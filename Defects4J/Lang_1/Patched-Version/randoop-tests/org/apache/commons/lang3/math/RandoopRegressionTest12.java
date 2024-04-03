package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6001");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6002");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 3072, 1662);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6003");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                     0.0a-1.0a10.0a100.0a0.0                                     ", 520.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 520.0f + "'", float2 == 520.0f);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!                                                                                              AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!                                                                                              AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6005");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6006");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6007");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0 1 35 0 1 -1", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6008");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6009");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 0, (long) 70, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 70L + "'", long3 == 70L);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6010");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6011");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "0.0 35.0 -1.0 10.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.0 35.0 -1.0 10.0 -1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6012");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                   #aaa#aa                                                                                   #aaa#aa                              10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!                                                                                   #aaa#aa                                                                                   #aaa#aa                              ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6013");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6014");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6015");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0A-1.0A1", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6016");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 416, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 0, 1758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                              AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                              AAA#AA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6019");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, (long) 108, (long) 1758);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1758L + "'", long3 == 1758L);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6020");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6021");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6022");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0, (double) 10, (double) 93.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.0d + "'", double3 == 93.0d);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6023");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100.04-1.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6024");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0a35.0a-1.0a10.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6026");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4440");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4440 + "'", int1 == 4440);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6027");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        java.lang.Class<?> wildcardClass14 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a0a1a1a0a-1" + "'", str13, "100a0a1a1a0a-1");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6028");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("00.0 -1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6029");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6031");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0#100.0" + "'", str6, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.04100.0" + "'", str8, "1.04100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0#100.0" + "'", str10, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0 100 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 100 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6033");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("Hi!hi!hi!", (long) 3072);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3072L + "'", long2 == 3072L);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6034");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10.0f, 93.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.0d + "'", double3 == 93.0d);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6035");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                   #aaa#aa                                                                                   #aaa#aa                              10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!                                                                                   #aaa#aa                                                                                   #aaa#aa                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6036");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#4a4#4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6037");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 70, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6038");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0A100.0                                                             ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6039");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6040");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(520, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6041");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6042");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1758, (float) 4440, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6043");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(99, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6044");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6045");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 265, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6046");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 265, 10);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.04100.0" + "'", str5, "1.04100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6047");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0, (float) 0L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                         01 1- 001 001 1                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"01 1- 001 001 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6049");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AA#AAA#                                                                                             a44#4#0.0a0.001a0.01a0.1-a0.", (float) 93L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 93.0f + "'", float2 == 93.0f);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6050");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1758L, (double) 410.0f, (double) 93.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1758.0d + "'", double3 == 1758.0d);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6051");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) '4', (int) ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 70, 10);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6052");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6053");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.001#0.144444444444444444444444444aaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaa#aaa#aaa#a-#aaaaaaaaaaaaaaaaaaA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.001#0.144444444444444444444444444aaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaa#aaa#aaa#a-#aaaaaaaaaaaaaaaaaaA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6056");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (-140), 1758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-140) + "'", int3 == (-140));
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6057");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4#44a ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6058");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1L, (long) 10, (long) 383);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 383L + "'", long3 == 383L);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6059");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("# a # a10a-1a100a100a1", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6061");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6062");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 1758, (-140));
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.04100.0" + "'", str5, "1.04100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6063");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 383);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 383 + "'", int2 == 383);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6064");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 129, 1758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 129");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6065");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0A100.0A0.0.1-#0.0010.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0A100.0A0.0.1-#0.0010.1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!                  10#-1#100#100#1                                    10#-1#100#100#1      100#-1#1#100#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!                  10#-1#100#100#1                                    10#-1#100#100#1      100#-1#1#100#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6068");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6069");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6070");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1 100 100 -1 10", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6071");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(265, (int) (byte) 10, 383);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6072");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0 35.0 -1.0 10.0 -1.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6073");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) (byte) 100, 99);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 176, (int) (byte) 1);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6074");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(520.0f, (float) 3072, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6075");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6076");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 416, (long) 265, (long) 129);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 129L + "'", long3 == 129L);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6077");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) '4', (int) ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6078");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.Class<?> wildcardClass10 = floatArray5.getClass();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6079");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6080");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.1-#0.001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6081");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("Aaaaaaaaaa", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aa#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!Hi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!aaaaaaaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#01                  !IH!IH!IHhi!Hi!#1-#001#001#01                                     1#1-#001#001#     1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6083");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!HI!10#-1#100#100#110#-1#100#100#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6084");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6086");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1662, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6087");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (-140.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6088");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 129, (double) (byte) 100, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 129.0d + "'", double3 == 129.0d);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6089");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6090");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6091");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3072.0f, 416.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3072.0d + "'", double3 == 3072.0d);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6092");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) '4', (int) ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6093");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 416, (int) (byte) 10);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6094");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Aaa#aaI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6095");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (double) 129);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 129.0d + "'", double2 == 129.0d);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.04-1.041HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.04-1.041HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6097");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 93.0f, (double) 1758, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.0d + "'", double3 == 93.0d);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6098");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 265L, (-140.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 265.0f + "'", float3 == 265.0f);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6099");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6100");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 108, (long) 383, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6101");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("# a # a10a-1a100a100a1", 176.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 176.0f + "'", float2 == 176.0f);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6102");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6103");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!HI!HI!HI!H#4#4I4HI!HI!HI!HI!HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!40!.H4H.H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!HI!HI!HI!H#4#4I4HI!HI!HI!HI!HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!40!.H4H.H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10#a#-#1#a#100#a#100#a#10#.#04#-#1#.#041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6106");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6107");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("HI!HI!HI!10041104-14100410041104-14100410041104-1...-HI!HI!HI!10041104-14100410041104-14100410041104-1...1HI!HI!HI!10041104-14100410041104-14100410041104-1...#HI!HI!HI!10041104-14100410041104-14100410041104-1...0HI!HI!HI!10041104-14100410041104-14100410041104-1...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6108");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 99L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6109");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 265, 0L, 70L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6110");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("HI!                                                                                              aaa#aaHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6111");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-140L), (long) 4393, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-140L) + "'", long3 == (-140L));
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6112");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hhi!hi!aaaaaaahi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6113");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6114");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aA#AAA#44a                                                                                             #4", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6115");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.04100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6116");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6117");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 0, (-1));
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a-1a100a100a1" + "'", str16, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "104-14100410041" + "'", str18, "104-14100410041");
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1.0 100.0                  10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0 100.0                  10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6119");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 0, (-1));
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a-1a100a100a1" + "'", str16, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a-1a100a100a1" + "'", str18, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6120");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4    a0 -1", (long) 131);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131L + "'", long2 == 131L);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6121");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1" + "'", str12, "10 -1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-1" + "'", str14, "104-1");
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6122");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" 10#-1#100#100#1 10#-1#100#100#1!ih", (float) 416L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 416.0f + "'", float2 == 416.0f);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6123");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.04-1.041HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H0.04-1.0410.04100.040.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6124");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 0.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6125");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 93, 0L, (long) 520);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 520L + "'", long3 == 520L);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6126");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1#1#100#100#10#100" + "'", str14, "-1#1#100#100#10#100");
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6127");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 176, 70);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6128");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (-140), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -140");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6129");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10 10 0 -1 100 0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6130");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "##############################hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h###############################1 100 100 -1 10");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ##############################hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h###############################1 100 100 -1 10");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6131");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "0.001#0.144444444444444444444444444aaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaa#aaa#aaa#a-#aaaaaaaaaaaaaaaaaaA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.001#0.144444444444444444444444444aaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaa#aaa#aaa#a-#aaaaaaaaaaaaaaaaaaA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6132");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 131, (float) 176, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6133");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA.AAA#AA.AAA#AA.AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6134");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6135");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6136");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      # #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6137");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6138");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#4a4a4a4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4a4a4a4#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6140");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 70L, (float) 176, (float) 520L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 520.0f + "'", float3 == 520.0f);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6141");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444...", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6142");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 99, 416L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6143");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6144");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0a0.001a0.01a0.1-a0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6145");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0#100#10", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6146");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#4#4 4A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6147");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0a-1.0a10.0a100.0a0.0Hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0.0a-1.0a10.0a100.0a0.0Hi!hi!hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6149");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1#0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6150");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6151");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100, 1.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6152");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (-140), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -140");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a-1a100a100a1" + "'", str13, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6153");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), (float) 70, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 70.0f + "'", float3 == 70.0f);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6154");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!aaaaaaa", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0 100 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 100 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6156");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6157");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(3072L, (long) 70, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6159");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6160");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a1a35a0a1a-1" + "'", str14, "0a1a35a0a1a-1");
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6161");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) (byte) 100, 99);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 129, 4440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 129");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6162");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1111111111111111111##-1#1###1###1111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6163");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 70L, 0.0d, (double) 176L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 176.0d + "'", double3 == 176.0d);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6164");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!AAAAAAA", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6165");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6166");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                   #aaa#aa                  ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("I");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: I is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6168");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) 520, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6169");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 4440);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4440 + "'", int2 == 4440);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.040.041.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".040.041.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6171");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1 100 100 -1 10", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6172");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 410, 100);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6174");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!HI!HI!HI!H444HI!HI!HI!HI!H", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6175");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Class [Bclass [Ljava.lang.String;class [D");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Class [Bclass [Ljava.lang.String;class [D\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6177");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                 10#-1#100#100#1                   ", (float) 3072L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0f + "'", float2 == 3072.0f);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6178");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6179");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10.0a100.0a0.0a97.0a10.0# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0a100.0a0.0a97.0a10.0# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6181");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6182");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(100, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6183");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 10 0 -1 100 0" + "'", str13, "10 10 0 -1 100 0");
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6184");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6185");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 99, 176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6186");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6187");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 108, (-1));
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str10, "0.0#-1.0#10.0#100.0#0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6189");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3072, (double) (-140.0f), (double) 265);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3072.0d + "'", double3 == 3072.0d);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6190");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6191");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: # #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             !ih!ih!ih0.1- 0.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih!ih!ih0.1- 0.001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6193");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("ih!ih!iH", 265);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 265 + "'", int2 == 265);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6194");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6195");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1.04100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("########################                 10#-1#100#100#1                   #########################0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######################                 10#-1#100#100#1                   #########################0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6198");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6199");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6200");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("   A# ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6201");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0 -1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6202");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("# #   A############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6203");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6204");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 99L, (float) 3072L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3072.0f + "'", float3 == 3072.0f);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6205");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 0, (-140));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 520, 4393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 520");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6206");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 370, (-140));
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6208");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(129, 0, 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 265 + "'", int3 == 265);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" -1 100 100 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 100 100 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6210");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.04100.0" + "'", str9, "1.04100.0");
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6211");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 129, (double) 93.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6212");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("A100.0a0.0a97.0a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6213");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("# #   a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1#100#100#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#100#100#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6215");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6216");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                       10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6217");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 553, (float) 416L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 553.0f + "'", float3 == 553.0f);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6218");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (byte) -1, (int) (byte) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (short) 100, 10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double22 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str21, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6219");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!                  10#-1#100#100#1                                    10#-1#100#100#1      100#-1#1#100#0", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6220");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4393, (int) 'a', 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4393 + "'", int3 == 4393);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6221");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6222");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6223");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 416, (double) 3072L, 3072.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3072.0d + "'", double3 == 3072.0d);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6224");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6225");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                             444444444444444444444444441.0#100.0                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444441.0#100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6226");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.04-1.041HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H0.04-1.0410.04100.040.0", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a1.0a100.0hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a1.0a100.0hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6228");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6229");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!aaaaaaa#4#44a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6230");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(70.0f, (float) 108, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6231");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 108, 549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 108");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6232");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 1, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6233");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("##########################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6234");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 520, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520.0d + "'", double3 == 520.0d);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6235");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.011111111111");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6236");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (-140L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-140L) + "'", long2 == (-140L));
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6237");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0#35.0#-1.0#10.0#-1.0" + "'", str11, "0.0#35.0#-1.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6238");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("class [Bclass [Ljava.lang.String;class [D", (float) 129L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 129.0f + "'", float2 == 129.0f);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6239");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 10#-1#100#100#1 10#-1#100#100#1!ih", (double) 410.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 410.0d + "'", double2 == 410.0d);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6240");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "10.0a100.0a0.0a97.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10.0a100.0a0.0a97.0a10.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-140" + "'", str9, "-140");
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6241");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.Class<?> wildcardClass11 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6242");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6243");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6244");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6246");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6247");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    10.0a100.0a0.0a97.0a10.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6248");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!HI!HI!HI!H#4#4I4HI!HI!HI!HI!HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!40!.H4H.H", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6249");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6250");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("HI!HI!HI!HI!H444HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6251");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6252");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14", 520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 520 + "'", int2 == 520);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6253");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "hhi!hi!aaaaaaahi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hhi!hi!aaaaaaahi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 10 0 -1 100 0" + "'", str12, "10 10 0 -1 100 0");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6254");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1L), (double) 1L, 1758.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6255");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 -1 100 100" + "'", str9, "-1 -1 100 100");
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6256");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6257");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0A100.0", (double) (-140.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-140.0d) + "'", double2 == (-140.0d));
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6258");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6259");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 370, 416);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 370");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6260");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6261");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4', (int) ' ', 0);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6262");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6263");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("##########################################################################################0.04-1.041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6264");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 176, 70L, (long) 108);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 70L + "'", long3 == 70L);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6265");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 129, (int) (short) 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6266");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6267");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6268");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 10, (float) 131, (float) 131L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6269");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!HI!HI!10#-1#100#100#110#-1#100#100#1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6270");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 131, 1758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 131");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6271");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 70, 549);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 549 + "'", int3 == 549);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6272");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4-1.040.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6273");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#", (float) 1758);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1758.0f + "'", float2 == 1758.0f);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6274");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.0 -1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6275");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6276");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("i!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6278");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', (int) (short) 0, (int) (byte) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6279");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6280");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(370, (int) (byte) 10, 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6281");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10 10 0 -1 100 0", 4440);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4440 + "'", int2 == 4440);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6282");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 0, (float) (short) 100, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6283");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6284");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4393, (int) (short) 100, 370);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4393 + "'", int3 == 4393);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6285");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hhi!hi!aaaaaaahi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6286");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, 1758, 549);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1758 + "'", int3 == 1758);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6287");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6288");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', 4393, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6289");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str16, "10.0#100.0#0.0#97.0#10.0");
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6290");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00.0 -1.0", (-140L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-140L) + "'", long2 == (-140L));
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6291");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(129, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 129 + "'", int3 == 129);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6292");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6294");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444444-14044444444444444444444444444444444444444444444444", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6295");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.0 100.0                  10#-1#100#100#1                   ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6296");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str15, "10.0#100.0#0.0#97.0#10.0");
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6297");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aa#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!Hi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!aaaaaaaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#01                  !IH!IH!IHhi!Hi!#1-#001#001#01                                     1#1-#001#001#     1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!Hi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!aaaaaaaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#01                  !IH!IH!IHhi!Hi!#1-#001#001#01                                     1#1-#001#001#     1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6299");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6300");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "0.04-1.041HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.04-1.041HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6301");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!HI!HI!HI!H##IHI!HI!HI!HI!HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!0!.HH.H");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6304");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a-1" + "'", str15, "10a-1");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6305");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6306");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6307");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6308");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44a                       ...#4", (long) 520);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 520L + "'", long2 == 520L);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6309");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!", (double) 549);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 549.0d + "'", double2 == 549.0d);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6310");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ", (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6311");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) -1, (float) 520, (float) 370);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 520.0f + "'", float3 == 520.0f);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6312");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, (double) (-1L), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6313");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#-1#100#100#1" + "'", str13, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6314");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 1662, 1758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1662");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6316");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6317");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                             10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!                              ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6318");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#1010a-1a100a100a10.04-1.0410#100#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6320");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(10L, 0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6321");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 265, 100);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 108, 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6322");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("Aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6323");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6324");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, 100L, (long) 553);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6325");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6326");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 93L, (double) 265L, 410.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 410.0d + "'", double3 == 410.0d);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6327");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("## ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###111111111111111111\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6329");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6330");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ", (float) 520);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 520.0f + "'", float2 == 520.0f);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6331");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 1662, 131);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 70, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6332");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0a0.001a0.01a0.1-a0.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#a#a aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#a aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6334");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 93.0f, (double) 416L, (double) 416);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 416.0d + "'", double3 == 416.0d);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6335");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10.0f, 1.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6336");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 1662, 370);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 1 35 0 1 -1" + "'", str13, "0 1 35 0 1 -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6337");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10L, (double) 416, (double) 129);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6338");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6339");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!HI!HI!10#-1#100#100#110#-1#100#100", 410);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 410 + "'", int2 == 410);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6340");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 0", 1662);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1662 + "'", int2 == 1662);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6341");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 370, 553);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 370");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-140" + "'", str9, "-140");
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6342");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6343");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6344");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) (byte) 100, 99);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6345");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a-1.0a10.0a100.0a0.0Hi!hi!hi!", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6346");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(549, 416, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 549 + "'", int3 == 549);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6347");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6348");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6349");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 176, (long) 383, (long) (-140));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 383L + "'", long3 == 383L);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6350");
        short[] shortArray3 = new short[] { (short) -1, (byte) 10, (byte) -1 };
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[-1, 10, -1]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6351");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#001#001#1-#011#001#001#1-#01!IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6352");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1.0 100.0                  10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1.0 100.0                  10#-1#100#100#1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-140" + "'", str9, "-140");
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6353");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1758.0f, (-140.0f), (float) (-140));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-140.0f) + "'", float3 == (-140.0f));
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI!HI!HI!HI!H444HI!HI!HI!HI!H                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!H444HI!HI!HI!HI!H                                                                                                      \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6355");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 100 100" + "'", str12, "0 100 100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6356");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6357");
        double[] doubleArray6 = new double[] { (-1.0f), 0, 520, 10.0d, 129, 549 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 520.0, 10.0, 129.0, 549.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6358");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAA", 131L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131L + "'", long2 == 131L);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6359");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#100#100#", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6360");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                 ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6361");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6362");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("HI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6363");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 -1" + "'", str9, "10 -1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6364");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100.0f, (double) 129, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6365");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaa", (float) 383L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 383.0f + "'", float2 == 383.0f);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6366");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) 265, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 265.0f + "'", float3 == 265.0f);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6367");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4#44A ...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6368");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 3072, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3072 + "'", int3 == 3072);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6369");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 176, 99);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6370");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6371");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104-1" + "'", str9, "104-1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6372");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6373");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("##############################hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h###############################1 100 100 -1 10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6374");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) -1, (float) 416, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA.AAA#AA.AAA#AA.AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA.AAA#AA.AAA#AA.AAA#AA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6376");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6377");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 410, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 410 + "'", int3 == 410);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6378");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 10, 1L, (long) 1758);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6379");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(129.0f, (float) 99L, 176.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 176.0f + "'", float3 == 176.0f);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6381");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a0.001a0.01a0.1-a0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6382");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) 1758.0f, 410.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1758.0d + "'", double3 == 1758.0d);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                 14-1.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                 14-1.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a100.0a0.0a97.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a100.0a0.0a97.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6385");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1758, (long) (-1), (long) 70);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6386");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("AA4AAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AA4AAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6387");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#-1#100#100#1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6388");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a-1a100a100" + "'", str8, "-1a-1a100a100");
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6389");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1#001#001#1-#01 1#001#001#1-#01 !IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6390");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("!!!!i!h", (-140));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-140) + "'", int2 == (-140));
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6391");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14-141004100" + "'", str8, "-14-141004100");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6392");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("140.1-40.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6393");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 0, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6394");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1758.0f, 0.0f, (float) 549);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6395");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 410, (-1));
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10.04100.040.0497.0410.0" + "'", str22, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6396");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6397");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 416, (long) 1, (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 416L + "'", long3 == 416L);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6398");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a-1a100a100a1" + "'", str13, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6399");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444440.001#0.14444444444444444AAAAAAA!IH44444444444444444444444444444444444444444444444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6400");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 1 35 0 1 -1" + "'", str13, "0 1 35 0 1 -1");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6401");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 93, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6402");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#### #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"### #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6403");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4393, (double) 410.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6405");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.04-1.0", (double) 416.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 416.0d + "'", double2 == 416.0d);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6406");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!h1004-141410040");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!h1004-141410040\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6408");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', 0L, (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6409");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (byte) 1, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6410");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6411");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6413");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 10, 0.0d, 93.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6414");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6415");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" -1 100 100 1", (long) 553);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 553L + "'", long2 == 553L);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("AAA4AA!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: AAA4AA!IH!IH!IH!IH!A4A44!IH!IH!IH!IH! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6417");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1758L, (double) 176, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1758.0d + "'", double3 == 1758.0d);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6418");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 265, 100);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str15, "0.04-1.0410.04100.040.0");
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.001#0.144444444444444444444444444aaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaa#aaa#aaa#a-#aaaaaaaaaaaaaaaaaaA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".001#0.144444444444444444444444444aaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaa#aaa#aaa#a-#aaaaaaaaaaaaaaaaaaA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6420");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 70, (double) 416L, 93.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 416.0d + "'", double3 == 416.0d);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6421");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) -1, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6422");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 4440, (int) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6423");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444441.0#100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6424");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0#100.0" + "'", str6, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.04100.0" + "'", str8, "1.04100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0#100.0" + "'", str10, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0#100.0" + "'", str13, "1.0#100.0");
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6425");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("########################10#-1#100#100#1#########################0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6426");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1 -1 100 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6428");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" 97.0 10.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6429");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a                       ...#444444444444444444444444                  10#-1#100#100#1                   444444444444444444444444", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6430");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 520L, (double) 176, (double) 70.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 70.0d + "'", double3 == 70.0d);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6431");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "aaaaaaa10a-1a100a100a10.04-1.041");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaa10a-1a100a100a10.04-1.041");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6432");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1662, (float) 1662, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6433");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-140-140-1", (float) 4440);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4440.0f + "'", float2 == 4440.0f);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6434");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6435");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6436");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6437");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6438");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 410, 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6439");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1, 553L, (long) 553);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6440");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6441");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(70, 1, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6442");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 383.0f, (double) 0L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 383.0d + "'", double3 == 383.0d);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6443");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6444");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...0 100 1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6445");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6446");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 0HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6448");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6449");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 131L, (double) 370, (double) 129.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 129.0d + "'", double3 == 129.0d);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6450");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#4#44a...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6451");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6452");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0 -1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6453");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(10, 0, 1758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6454");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, 93L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6455");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!                                                                                          ", (long) (-140));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-140L) + "'", long2 == (-140L));
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6456");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#4#44A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6457");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6458");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 131, 131);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6459");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(553L, (-140L), (long) 176);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-140L) + "'", long3 == (-140L));
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6460");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("class [B4class [Ljava.lang.String;4class [D");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6461");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6462");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                             444444444444444444444444441.0#100.0                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                             444444444444444444444444441.0#100.0                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6463");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-140a100a370");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6464");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6465");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.04-1.0410.04100.040.0", 265);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 265 + "'", int2 == 265);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6466");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                             100.0 -1.0                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6467");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6468");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(553L, (long) 549, (long) 416);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 553L + "'", long3 == 553L);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6469");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0 100.0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6470");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6471");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6472");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6473");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 265, (long) 129, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6474");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1662, 99, 416);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1662 + "'", int3 == 1662);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6475");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "1.0a0.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1.0a0.0a0.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6476");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#4#44a                       ...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  10#-1#100#100#1                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  10#-1#100#100#1                  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6478");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6479");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 131L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 131.0f + "'", float2 == 131.0f);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6481");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.04100.040.0497.0410.0" + "'", str11, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6482");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1662, (float) 416, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6484");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA.AAA#AA.AAA#AA.AAA#AAHI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6485");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(176.0f, (float) (short) 0, (float) 99L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6486");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0a0.001a0.01a0.1-a0.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6487");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "hi!", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10 -1 100 100 1", (java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        short[] shortArray9 = new short[] { (byte) 1 };
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray9, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray9, '#', (int) (byte) 100, (int) '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray9, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray9, 'a');
        java.lang.Class<?> wildcardClass23 = shortArray9.getClass();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!aaaaaaa", "hi!", "" };
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray34);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.prependIfMissing("hi!aaaaaaa", (java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray34);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "hi!aaaaaaa", "hi!", "" };
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray42);
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.stripAll(strArray42);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray34, strArray42);
        int int46 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray42);
        java.lang.String[] strArray48 = org.apache.commons.lang3.StringUtils.stripAll(strArray42, "0.0a-1.0a10.0a100.0a0.0");
        int int49 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "100.0#-1.0", (java.lang.CharSequence[]) strArray42);
        int int50 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1.0 100.", (java.lang.CharSequence[]) strArray42);
        java.lang.Class<?> wildcardClass51 = strArray42.getClass();
        java.lang.CharSequence charSequence54 = null;
        char[] charArray59 = new char[] { '#', '#', ' ', 'a' };
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join(charArray59, '4');
        int int62 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence54, charArray59);
        boolean boolean63 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "0.0a-1.0a10.0a100.0a0.0#4#44a                                                                                             #AAA#AA", charArray59);
        boolean boolean64 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "# #   A", charArray59);
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join(charArray59, ' ', (int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass69 = charArray59.getClass();
        java.lang.String[] strArray73 = org.apache.commons.lang3.StringUtils.split("", "", (int) (byte) 10);
        java.lang.Class<?> wildcardClass74 = strArray73.getClass();
        java.lang.reflect.Type[] typeArray75 = new java.lang.reflect.Type[] { wildcardClass7, wildcardClass23, wildcardClass51, wildcardClass69, wildcardClass74 };
        java.lang.reflect.Type[][] typeArray76 = new java.lang.reflect.Type[][] { typeArray75 };
        java.lang.String str77 = org.apache.commons.lang3.StringUtils.join(typeArray76);
        java.lang.String str78 = org.apache.commons.lang3.StringUtils.join(typeArray76);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[1]");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!aaaaaaa" + "'", str36, "hi!aaaaaaa");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "## a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "## a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #,  , a]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#4#4 4a" + "'", str61, "#4#4 4a");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6488");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("########################                 10#-1#100#100#1                   #########################0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6489");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6490");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 176, (float) 70, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 176.0f + "'", float3 == 176.0f);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6491");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihh");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6492");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("# #   a104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6493");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) (byte) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6494");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6495");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, (-140), (-140));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #Aaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" #   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6497");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6498");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...                                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test6500");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100.00.097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

