package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07001");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, 4440L, (long) 265);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07003");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4 4HI!HI!HI!HI!H#4#0.04-1.041HI!HI!HI!HI!H", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07004");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("265.0499.04131.041662.04129.0", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07005");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1", 1758L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1758L + "'", long2 == 1758L);
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07006");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ##########################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07007");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 520, (int) ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07008");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, 353);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1#-1#100#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#-1#100#100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07010");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("00.0 -1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07011");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 0, 231);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07012");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07013");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("# #   ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.04-1.041HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H0.04-1.0410.04100.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.04-1.041HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H0.04-1.0410.04100.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07015");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 180, (double) '#', (double) 410.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 410.0d + "'", double3 == 410.0d);
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07016");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 100, 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.040.040.0" + "'", str13, "1.040.040.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.040.040.0" + "'", str15, "1.040.040.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07017");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-                                                                                                                                 aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaa#-a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07018");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 549);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 549 + "'", int2 == 549);
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07019");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) 10, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07020");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# i!aaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07021");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(70, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07022");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                         !IH");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07023");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07024");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, (double) 416.0f, (double) 383L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07025");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07026");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                       ", (float) 265L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 265.0f + "'", float2 == 265.0f);
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07027");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 370, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#-1#100#100#1" + "'", str13, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "104-14100410041" + "'", str20, "104-14100410041");
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07029");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07030");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 10, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07031");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07032");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1#1#100#100#10#100                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07033");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
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
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07034");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 716, 0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 716L + "'", long3 == 716L);
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07035");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 195, 383L, (long) 164);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 164L + "'", long3 == 164L);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07036");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07037");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 99, 416);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10a-1" + "'", str9, "10a-1");
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07038");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07039");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 164L, 3072.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07040");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) -1, (-1));
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str16, "0.0#-1.0#10.0#100.0#0.0");
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07041");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#-1" + "'", str9, "10#-1");
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07042");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1     10#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...10#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...0#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...-1#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07043");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaa!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaa!ih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07045");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#4a4a4a4#", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07046");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#AAAAAAA##a#a aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07047");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, (long) 108);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07048");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07049");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 265, 549L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 549L + "'", long3 == 549L);
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07050");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0a0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07051");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 507, (float) 647, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 647.0f + "'", float3 == 647.0f);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07052");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07053");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("########################10#-1#100#100#1#########################0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07054");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                     0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A1", (double) 3072L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.0d + "'", double2 == 3072.0d);
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07055");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07056");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0 35.0 -1.0 10.0 -1.0", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07057");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("!40!.H4H.H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07058");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!hi!aahi!aaaaaaaahi!ahi!aahhi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1hi!hi!aahi!aaaaaaaahi!ahi!aah", 4440);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4440 + "'", int2 == 4440);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.0#100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0#100.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07060");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 370, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 370 + "'", int3 == 370);
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07061");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 265, (-140.0d), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 265.0d + "'", double3 == 265.0d);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07063");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#0.144444444444444444444444001140.1-40.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07064");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("####################################################################################################0.04-1.041HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H0.04-1.0410.04100.040.0#####################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07065");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 -1 1 100 0" + "'", str10, "100 -1 1 100 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 -1 1 100 0" + "'", str12, "100 -1 1 100 0");
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07066");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(176L, (long) 231, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07067");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(231, 70, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 231 + "'", int3 == 231);
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07068");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1L), 0.0f, 70.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07069");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07070");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 416, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07071");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 129, (int) (short) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 520, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "...0 100 1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...0 100 1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1a0" + "'", str20, "-1a0");
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07072");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 129, (int) (short) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 520, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07073");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#######################################################################################################################################################################4#44a ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################################################################################################################################################################################################################Hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07074");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.00444444444444444444444444444444444444444444444444041-444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07075");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07076");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (-1), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07077");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1hi!aaaaaaa-1 1 100 100 10 100#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07078");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" ...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07079");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07080");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07081");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#4a4#4a                                                                                                                                                                                                                                                                                                                                                                                                                   ", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07082");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1#001#001#1-#011#001#001#1-#01!IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih", 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07083");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 549, 1662);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 549");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "104-1" + "'", str8, "104-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07084");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07085");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 0, 4393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4393 + "'", int3 == 4393);
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07086");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 100, (float) 100L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07087");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07088");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4#44A ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07089");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 100, (int) '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a-1a100a100a1" + "'", str18, "10a-1a100a100a1");
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07090");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                    10 -1 100 100 1AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA.AAA#AA.AAA#AA.AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07091");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!44hi!4hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07092");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07093");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07094");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...0 100 1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07095");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07096");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 1, 410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07097");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("!IH!IH!IH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: !IH!IH!IH is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07098");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihhaaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa.aaa#aa.aaa#aa.aaa#aa", 553.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 553.0f + "'", float2 == 553.0f);
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07100");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 410, (float) 716, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07101");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 0, 1749);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07102");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(553L, (long) '4', (long) 365);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07103");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#001#001#1-#01 1#001#001#1-#01 !IH!IH!IH", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07104");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("040014141-4001", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07105");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 716L, 0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07106");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                             100.0 -1.0                                             ", (double) 4393);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4393.0d + "'", double2 == 4393.0d);
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07107");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1.0f, (double) 93L, (double) 129L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07108");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07109");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 129, 4440L, 131L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 129L + "'", long3 == 129L);
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07110");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 520, (int) ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07111");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0 1 35 0 1 -aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07112");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                             #AAA#AA", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100.04-1.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.04-1.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10a-1a100a100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a-1a100a100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07115");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4-1.040.0", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07116");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 265, (int) (short) 10);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 0, (-1));
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str21, "10.0 100.0 0.0 97.0 10.0");
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07117");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Hi!aaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07118");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 129, (int) '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07119");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(175, (-140), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 175 + "'", int3 == 175);
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07120");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                    10.04100.040.0497.0410.0                                                     ", 410L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 410L + "'", long2 == 410L);
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07121");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("# #   A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07122");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#!iha#a#a#a!iha#a#a#!iha#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07123");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                 ", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07124");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(175, 353, 231);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 353 + "'", int3 == 353);
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07125");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.0#-1.0#10.0#100.0#0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07127");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-141004444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07128");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("HI!                                                                                              aaa#aaHI!AAAAAAAAAAAAHI!AAAAA4-1410041004");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07129");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 0.0d, (double) 3072);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3072.0d + "'", double3 == 3072.0d);
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07130");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.04-1.041HI!HI!HI!HI!H#4#4hi4HI!HI!HI!HI!", (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0 1 35 0 1 -");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 1 35 0 1 -\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07132");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 647, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07133");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 410L, (double) 99.0f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 410.0d + "'", double3 == 410.0d);
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!H1004-141410040");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07135");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 370, (long) (byte) -1, (long) 370);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 370L + "'", long3 == 370L);
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07136");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07137");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("      1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14HI!AAHI!AAAAAAAAHI!A10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11HI!HI!HI!", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07138");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07139");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07140");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 129, (double) 0L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 129.0d + "'", double3 == 129.0d);
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("IHIHIHIHIHIHIHIHIHIHIH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IHIHIHIHIHIHIHIHIHIHIH\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07142");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.04100.0#", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07143");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1" + "'", str8, "10#-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a-1" + "'", str11, "10a-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07144");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) '4', (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07145");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07146");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10.0f, (double) 10L, (double) 93L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07147");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a100.0 -1.0                                                                                          4    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a0 -14    a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07148");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!aahi!aaaaaaaahi!a", 129);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129 + "'", int2 == 129);
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07149");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!HI!HI!HI!H11IHI!HI!HI!HI!HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!0!-HH-H", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07150");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                    10.04100.040.0497.0410.0                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07151");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.0a0.001a0.01a0.1-a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07152");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07153");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "1.0 100.0                  10#-1#100#100#1                   ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1.0 100.0                  10#-1#100#100#1                   ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-14-141004100" + "'", str9, "-14-141004100");
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!##########################################################################################0.04-1.041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!##########################################################################################0.04-1.041\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07155");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1758L, (long) (short) -1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1758L + "'", long3 == 1758L);
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07156");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, '#');
        // The following exception was thrown during execution in test generation
        try {
            short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07157");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07158");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 151, (-1.0f), (float) 4440);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07159");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(410L, (long) 131, 1662L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1662L + "'", long3 == 1662L);
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" ...a#4#44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ...a#4#44\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07161");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07162");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1 100 100 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     11I100I100I-1I10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     11I100I100I-1I10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07164");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07165");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a35.0a-1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("444444444444444444444444444444444444444444444444-14044444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444-14044444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07167");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("ih!ih!ih");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07168");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07169");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) (short) 0, 1662);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a-1a100a100a1" + "'", str14, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 -1 100 100 1" + "'", str16, "10 -1 100 100 1");
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07170");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07171");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 99L, 108L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 108L + "'", long3 == 108L);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07172");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 370, 10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a35.0a-1.0a10.0a-1.0" + "'", str10, "0.0a35.0a-1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0#35.0#-1.0#10.0#-1.0" + "'", str17, "0.0#35.0#-1.0#10.0#-1.0");
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0 1 35 0 1 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 1 35 0 1 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07174");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 716, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 0, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07175");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 370, 10);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 353, 1662);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 353");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a35.0a-1.0a10.0a-1.0" + "'", str10, "0.0a35.0a-1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07177");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0 . 0 A - 1 ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07178");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 383, 1857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 383");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07179");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 365, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.0a-1....##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a-1....##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07181");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi!           #!iha#a#a#a!iha#a#a#!iha#        10#-1#100#100#", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07182");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07183");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07184");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 164L, (-140L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-140L) + "'", long3 == (-140L));
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     001#01#001#001#1#1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     001#01#001#001#1#1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07186");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) ' ', (int) (short) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', 716);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07187");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07188");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 1 100 100 10 100" + "'", str14, "-1 1 100 100 10 100");
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.04-1.0410.04100.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.04-1.0410.04100.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4 4HI!HI!HI!HI!H#4#0.04-1.041HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 4HI!HI!HI!HI!H#4#0.04-1.041HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07191");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10-11001001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10-11001001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07193");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.040.040.0# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07194");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 507L, 1662.0d, 4393.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4393.0d + "'", double3 == 4393.0d);
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07195");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 1, 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07196");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#################10A-1A100A100A1", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07197");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 10, 416);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a-1a100a100a1" + "'", str14, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07198");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1 100 100 -1 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07199");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hi!aaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07200");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1758L, (double) 353, (double) 164L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1758.0d + "'", double3 == 1758.0d);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07201");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) '4', (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07202");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) '4', (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4393, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 129, (int) (short) 100);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07203");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 1758, (int) (short) 100);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 231, 1758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 231");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07204");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(131.0d, (double) 647.0f, 129.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 129.0d + "'", double3 == 129.0d);
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0#-1.0                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100.0#-1.0                                                                                                                                                                                 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07206");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(370L, (long) 10, 507L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07207");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 3072, 176);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07209");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07210");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (-140), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -140");
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
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07211");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100#-1#1#100#0" + "'", str15, "100#-1#1#100#0");
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07212");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa##########################1.0#100.ih!ih!iH#####a", (float) 131L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 131.0f + "'", float2 == 131.0f);
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07213");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07214");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a0.001a0.01a0.1-a0.0", 265);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 265 + "'", int2 == 265);
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07216");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0# #   a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0# #   a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07217");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 93, 195);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 93");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07218");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 129, 0);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "4-1.040.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4-1.040.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a0a1a1a0a-1" + "'", str13, "100a0a1a1a0a-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07219");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.0 -1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07220");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.Class<?> wildcardClass6 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07221");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100.00.097.0", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07222");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 383L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 383L + "'", long2 == 383L);
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07223");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07224");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1#001#001#1-#011#001#001#1-#01!IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa# a # a#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07225");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07226");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07227");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4a4#4a44444444444444444444444444441#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihh", (double) 3072.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.0d + "'", double2 == 3072.0d);
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07228");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07229");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07230");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 84, 195);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 195 + "'", int3 == 195);
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07231");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4440, 2752, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4440 + "'", int3 == 4440);
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07232");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!                                                                                              aaa#aaHI!AAAAAAAAAAAAHI!AAAAA4-141004100", 129L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 129L + "'", long2 == 129L);
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07233");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07234");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str15, "0.0a-1.0a10.0a100.0a0.0");
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07235");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (short) 1, 127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07236");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 365, (float) (short) 100, (float) 549L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 549.0f + "'", float3 == 549.0f);
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07237");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07238");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4393L, 0.0d, 549.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("Hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07240");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihh1#001#001#1-#011#001#001#1-#01!IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa# a # a#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07241");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                               444444444444444444444444444444444444444444444440.001#0.14444444444444444AAAAAAA!IH44444444444444444444444444444444444444444444444                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                               444444444444444444444444444444444444444444444440.001#0.14444444444444444AAAAAAA!IH44444444444444444444444444444444444444444444444                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07243");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 0.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07244");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07245");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("i!                  10#-1#100#10", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07246");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                              AAA#AA", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07247");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 4440.0f, (double) 353, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4440.0d + "'", double3 == 4440.0d);
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07248");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(84, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 84 + "'", int3 == 84);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07249");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!", (double) 129);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 129.0d + "'", double2 == 129.0d);
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07250");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaa10#10#0#-1#100#0aaaaaaa444444444444444444444444441.0#100.", (double) 175);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 175.0d + "'", double2 == 175.0d);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07251");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 108, 3072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 108");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07252");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#", 265L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 265L + "'", long2 == 265L);
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07253");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07254");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1hi!aaaaaaa-1 1 100 100 10 100", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07255");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 10, 1758L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07256");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0a-1.0a10.0a100.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07257");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100404141404-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07258");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("!40!.H4H.H");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07259");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1.0#100.0", 93L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93L + "'", long2 == 93L);
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07260");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(390, 3068, 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3068 + "'", int3 == 3068);
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07261");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444#4#4 4", (float) 4440L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4440.0f + "'", float2 == 4440.0f);
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07262");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0 100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07263");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 1749, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07264");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str10, "10.0 100.0 0.0 97.0 10.0");
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10-11001001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07267");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                     0.0a-1.0a10.Hi!aaaaaaa                                    -1 -1 100 100", (float) 70L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 70.0f + "'", float2 == 70.0f);
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07268");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 10, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0a1a35a0a1a-1" + "'", str13, "0a1a35a0a1a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0#1#35#0#1#-1" + "'", str15, "0#1#35#0#1#-1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07269");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 131.0f, 176.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 176.0f + "'", float3 == 176.0f);
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07270");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07271");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int25 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10a-1a100a100a1" + "'", str23, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07272");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07273");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (byte) 10, 3072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1" + "'", str12, "10 -1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07274");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07275");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str11, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.04100.040.0497.0410.0" + "'", str13, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str16, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07276");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(108L, (long) ' ', (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07277");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(171, 410, 3068);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3068 + "'", int3 == 3068);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07278");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 231, 131L, (long) 1758);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1758L + "'", long3 == 1758L);
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07279");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAA # AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAA # AA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07281");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#a#a aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#a aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07283");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!hi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!aaaaaaahi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!hi!hi!hi!10#-1#100#100#110#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07284");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (-140), 1749);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -140");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0 -1.0" + "'", str6, "100.0 -1.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07285");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) '4', (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4393, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, 353);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07286");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07287");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07289");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 180, (double) 647, (double) 1749);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 180.0d + "'", double3 == 180.0d);
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07290");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...a#4#44");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07291");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07292");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 84, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-14100410041" + "'", str14, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 -1 100 100 1" + "'", str16, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07293");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     001#01#001#001#1#1-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07294");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 70, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100#-1#1#100#0" + "'", str14, "100#-1#1#100#0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07295");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0 0.001 0.01 0.1- 0.0", (long) 180);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 180L + "'", long2 == 180L);
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07296");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                        I     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07297");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07298");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 370, (float) 171, (float) 1749);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1749.0f + "'", float3 == 1749.0f);
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07299");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 1 100 100 10 100" + "'", str10, "-1 1 100 100 10 100");
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07300");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 129, (int) (short) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 520, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 370, (int) '4');
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07302");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0-1.010.0100.00.0-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07303");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07304");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', (float) 2752, 3068.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07305");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07306");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("!!!!i!h", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07307");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 176, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 390, 647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 390");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07308");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 647, 70);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07309");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str16, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07310");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 553, 520L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07311");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', 520L, 70L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07312");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(195, 2752, 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2752 + "'", int3 == 2752);
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.0 -1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.0 -1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07314");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#-1#100#100#1", (float) 99L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.0f + "'", float2 == 99.0f);
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!aaaaaaa44444444444444441.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaa44444444444444441.0#100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07316");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 129, 520L, 93L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 93L + "'", long3 == 93L);
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07317");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray4, '#');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#-1#100#100" + "'", str10, "-1#-1#100#100");
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07318");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 549, 0.0f, 1749.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07319");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 0, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 1, 383);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a-1" + "'", str16, "10a-1");
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07320");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4393L, (long) 520, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07321");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1758L, 416.0d, (double) 1662);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 416.0d + "'", double3 == 416.0d);
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07322");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07323");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 129, (int) (short) 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0a0.001a0.01a0.1-a0.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0a0.001a0.01a0.1-a0.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07324");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 647.0f, (double) 520L, (double) 99.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 647.0d + "'", double3 == 647.0d);
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07325");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) -1, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07326");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaa10#10#0#-1#100#0aaaaaaa444444444444444444444444441.0#100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07328");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) '4', (int) ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07329");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444-14044444444444444444444444444444444444444444444444400.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07330");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("14-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.0", (float) 3072L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0f + "'", float2 == 3072.0f);
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07331");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(390, 164, 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 390 + "'", int3 == 390);
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07332");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 129, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str11, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.04100.040.0497.0410.0" + "'", str13, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#########################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#########################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07334");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10.04100.040.0497.0410.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10.04100.040.0497.0410.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.010.04100.040.0497.0410.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10.04100.040.0497.0410.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 1857);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1857.0d + "'", double2 == 1857.0d);
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1HI!AAAAAAA-1 1 100 100 10 100##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1HI!AAAAAAA-1 1 100 100 10 100##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07336");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10a-1" + "'", str9, "10a-1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07337");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07338");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Hi!hi!hi!                  10#-1...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07339");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 0, 171);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 171 + "'", int3 == 171);
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07340");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07341");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 410, 70);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1758, 353);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07342");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1857, (float) 231, (float) 416L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 231.0f + "'", float3 == 231.0f);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07343");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07344");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07345");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("           0.0a-1.0a1           ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07346");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.41410041004104096E17d), 0.0d, (double) 70);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 70.0d + "'", double3 == 70.0d);
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07347");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10100AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA.AAA#AA.AAA#AA.AAA#AA44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07348");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!## ## hi!aaaaaaa## hi!## ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07349");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(3072.0f, (float) (byte) 10, 4440.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07350");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "104-14100410041" + "'", str20, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07351");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(647, (int) (byte) 10, 353);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 647 + "'", int3 == 647);
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07352");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(716L, (long) (byte) 0, (long) 70);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 716L + "'", long3 == 716L);
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07353");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi! AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-141004100", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07354");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hhi!hi!aaaaaaahi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1!ih");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07355");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0435.04-1.0410.04-1.0", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07356");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(647.0d, (double) 1.0f, 520.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07357");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0 35.0 -1.0 10.0 -1.0" + "'", str11, "0.0 35.0 -1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0435.04-1.0410.04-1.0" + "'", str16, "0.0435.04-1.0410.04-1.0");
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07358");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 171, (long) 416, (long) 168);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 168L + "'", long3 == 168L);
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07359");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      # #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07360");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     11I100I100I-1I", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07361");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 416, (int) 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str17, "0.0#-1.0#10.0#100.0#0.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07362");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 390, 100.0f, (float) 549);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07363");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 409, 0L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07364");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                      hi!44hi!4hi!4                                                                                                    hi!44hi!4hi!4", 151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 151 + "'", int2 == 151);
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07365");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0#100#10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07366");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("140.1-40.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07367");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("     1#001#001#1-#01                             ...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07368");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 70, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (-1), 151);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 10 0 -1 100 0" + "'", str12, "10 10 0 -1 100 0");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07369");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07370");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!0.04-1.041hi!hi!hi!hi!h#4#4HI4hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07371");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 0, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 0, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07372");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!HI!HI!10041104-14100410041104-14100410041104-1...-HI!HI!HI!10041104-14100410041104-14100410041104-1...1HI!HI!HI!10041104-14100410041104-14100410041104-1...#HI!HI!HI!10041104-14100410041104-14100410041104-1...0HI!HI!HI!10041104-14100410041104-14100410041104-1...", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI!AAAAAAA44444444444444441.0#100.0                                                                 444444444444444444444444444444444444444444444444...                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!AAAAAAA44444444444444441.0#100.0                                                                 444444444444444444444444444444444444444444444444...                                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07374");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#-1#100#100#1" + "'", str13, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("14-1.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"14-1.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07377");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07378");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001#0.144444444444444444444444001");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07379");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa", 176.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 176.0f + "'", float2 == 176.0f);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07380");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07381");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("140.1-40.0", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07382");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 176, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 553, 1749);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 553");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07383");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07384");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) '4', (-1));
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str11, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str13, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07385");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#  # 10-11001001", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07386");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaa 10#-1#100#100#1 hi! 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaa 10#-1#100#100#1 hi! 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07387");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#-1#100#100#1" + "'", str13, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "104-14100410041" + "'", str15, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07388");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ih");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07389");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07390");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("444444444444444444444444444444444444444444444440.001#0.14444444444444444AAAAAAA!IH44444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444440.001#0.14444444444444444AAAAAAA!IH44444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07392");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!HI!HI!10#-1#100#100#110#-1#100#100#1HI!HI!HI!10#-1#100#100#110#-1#100#100#1HI!AAAAAAAHI!HI!HI!10#-1#100#100#110#-1#100#100#1HI!HI!HI!HI!10#-1#100#100#110#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!aaaaaaa                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07394");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 131.0f, (double) 4440, (double) 716L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 131.0d + "'", double3 == 131.0d);
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07395");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07396");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07397");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 176, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0#4#44a ...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0#4#44a ...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07398");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) '4', (-1));
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 129, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 129");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str11, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str13, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str19, "0.0#-1.0#10.0#100.0#0.0");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07399");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (-140));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) '#', (-140));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str18, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07400");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 70L, (float) 416, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07401");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                    0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0                                                                          0.0A-1.0A10.0A100.0A0.0    ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07402");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("!IH", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07403");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07404");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(231, 1662, 4163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 231 + "'", int3 == 231);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07405");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(176, 410, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 410 + "'", int3 == 410);
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07406");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 131, (float) 507L, 265.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07407");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(410, 172, 553);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 172 + "'", int3 == 172);
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07408");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihhaaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa.aaa#aa.aaa#aa.aaa#aa", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07409");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07410");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07411");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07412");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(70, (-140), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07413");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07414");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07415");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10 10 0 -1 100 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07416");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("HI!                                                                                              AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07417");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("# #   a104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# #   a104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07418");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 291, 410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 410 + "'", int3 == 410);
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07419");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(129L, (long) 4163, (long) 4440);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 129L + "'", long3 == 129L);
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07420");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2752, 172, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07421");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("######A############################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07422");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07423");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1749.0f, (double) 3072.0f, 410.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3072.0d + "'", double3 == 3072.0d);
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07424");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                           -1#0                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07425");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(383L, (long) 164, (long) 370);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 383L + "'", long3 == 383L);
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07426");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07427");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#0.144444444444444444444444001140.1-40.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07428");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, (long) 131, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 131L + "'", long3 == 131L);
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07429");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', (int) (short) 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str10, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str17, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07430");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 416, 353);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 416 + "'", int3 == 416);
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07431");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07432");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("I!                  10#-1#100#100#1                                     10#-1#100#100#1-1#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07433");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 1, 0.0f, (float) 410L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07434");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444...                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07435");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("I!                  10#-1#100#100#1                                     10#-1#100#100#1-1#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA.AAA#AA.AAA#AA.AAA#AA", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07436");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07437");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("!IH!IH!...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07438");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 176, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07439");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 70L, (double) 99L, (double) 1749.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 70.0d + "'", double3 == 70.0d);
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07440");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07441");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (-1), 2752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104-1" + "'", str9, "104-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a-1" + "'", str11, "10a-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#######################################################################################################################################################################4#44A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######################################################################################################################################################################4#44A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07443");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                              AAA#A", (float) 129L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 129.0f + "'", float2 == 129.0f);
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07444");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 1, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07445");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 0, (-140));
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 231, 10);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#-1" + "'", str16, "10#-1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07446");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0a100a100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07447");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) (byte) 10, 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) 'a', (int) (byte) 1);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 151, 3072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 151");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07448");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 520L, 549.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 549.0f + "'", float3 == 549.0f);
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07449");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07450");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07451");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                    10 -1 100 100 1", (double) 1749.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1749.0d + "'", double2 == 1749.0d);
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07452");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHHI!HI!HI!!!!!!!!!!!!!!!!!!!II#HI#III#III#I!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!II#HI#III#III#I!!!!!AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHHI!HI!HI!!!!!!!!!!!!!!!!!!!II#HI#III#III#I!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!II#HI#III#III#I!!!!!AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAa                       ...#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHHI!HI!HI!!!!!!!!!!!!!!!!!!!II#HI#III#III#I!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!II#HI#III#III#I!!!!!AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHHI!HI!HI!!!!!!!!!!!!!!!!!!!II#HI#III#III#I!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!II#HI#III#III#I!!!!!AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAa                       ...#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07453");
        double[] doubleArray2 = new double[] { 1L, 0.0d };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 0, 370);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0a0.0" + "'", str6, "1.0a0.0");
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07454");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, (float) 553L, (float) 1749);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1749.0f + "'", float3 == 1749.0f);
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07455");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, 410L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 410L + "'", long3 == 410L);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07456");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#4a4#4a44444444444444444444444444441#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("AAA4AA!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAA4AA!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07458");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3072L, (double) (-1L), (double) 93L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07459");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104-1" + "'", str9, "104-1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a-1" + "'", str12, "10a-1");
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07460");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07461");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07462");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                         !IH");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07463");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07464");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07465");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                       10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07466");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (short) 1, 390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10 -1 100 100 1" + "'", str23, "10 -1 100 100 1");
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07467");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(409, (int) '4', 370);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07468");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(647, 1749, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07469");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07470");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 410L, (double) 10, (double) 175.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 410.0d + "'", double3 == 410.0d);
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07471");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 3072, 176);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07472");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AA#AAA#                                                                                             a44#4#0.0a0.001a0.01a0.1-a0.0", (long) 180);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 180L + "'", long2 == 180L);
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07473");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1749, (float) 716, 231.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 231.0f + "'", float3 == 231.0f);
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07474");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07475");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) ' ', 416);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("# a a a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# a a a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07477");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 1662);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1662.0f + "'", float2 == 1662.0f);
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07478");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0a35.0a-1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07479");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 3072, (long) 265);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07480");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (byte) 100, 0);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07481");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07482");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 171, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 171");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str11, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.04100.040.0497.0410.0" + "'", str13, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07483");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1.040.040.0# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07484");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0 100.0" + "'", str6, "1.0 100.0");
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07485");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!aaaaaaa                     ", (float) 1379);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1379.0f + "'", float2 == 1379.0f);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07486");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444                  10a-1a100a100a1                   444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07487");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IH");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07488");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                  10#-1#100#100#1                  ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07489");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07490");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 151L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 151.0f + "'", float3 == 151.0f);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07491");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) -1, (-1));
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) '4', 2752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07492");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07493");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("##############################################################AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAA...###############################################################", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07494");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 390, 517);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 390");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("11hi!hi!hi! 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07496");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1-1#", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07497");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07499");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                 10-11001001                   444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest14.test07500");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a-1....##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.0a-1....##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.0a-1....##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.0a-1....############################################################################################", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }
}

