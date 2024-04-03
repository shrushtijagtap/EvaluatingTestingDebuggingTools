package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '#', (float) 549, (float) 37);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 549.0f + "'", float3 == 549.0f);
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444444444444444444444444444444444440.001#0.14444444444444444aaaaaaa!ih44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4!ih4!ih44!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0435.04-1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(129.0d, (double) 168L, (double) 4440L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4440.0d + "'", double3 == 4440.0d);
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "104-1" + "'", str8, "104-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "104-1" + "'", str12, "104-1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "104-1" + "'", str15, "104-1");
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(168, 517, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 0, 0);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) '4', (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4393, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.001#0.144444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.001#0.144444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 131, 390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 131");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0 -1.0" + "'", str6, "100.0 -1.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0#-1.0" + "'", str10, "100.0#-1.0");
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 39.0f, (double) 615L, (double) 150);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.0d + "'", double3 == 39.0d);
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a-1a100a100a1" + "'", str14, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10.04-1.041a100a100a-1a                                                                                             #AAA#AA10a#4#441                  #100#100#-1#1                  hi!                  10#100#100#-1#1                  hi!aaaaaaa                  10#100#100#-1#1                                    10#100#100#-1#hi!                  104!ih4!ih44!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        short[] shortArray2 = new short[] { (short) 0, (short) -1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 122, (int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, -1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 -1" + "'", str4, "0 -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 -1" + "'", str6, "0 -1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 2752, 291);
        int int27 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 0, (int) (byte) -1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0#100.0" + "'", str6, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 517L, (double) 539, (double) (byte) -14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 539.0d + "'", double3 == 539.0d);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
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
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(168.0d, (double) (-140.0f), (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-140.0d) + "'", double3 == (-140.0d));
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10#-1#100#100#1" + "'", str21, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 93, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#0" + "'", str15, "-1#0");
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1" + "'", str8, "10#-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 365, 515);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 70, (int) (byte) 10);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 81, 0);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AA#AAA#AAHI!#AAA#AAHI!AAAAAAA#AAA#AA#AAA#HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AA#AAA#AAHI!#AAA#AAHI!AAAAAAA#AAA#AA#AAA#HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "041004100" + "'", str12, "041004100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a100a100" + "'", str14, "0a100a100");
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("IHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 81, 875L, (long) 672);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 81L + "'", long3 == 81L);
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0#100#10##hi!##hi!####hi!Hi!##hi!##hi!####hi!Hi!##hi!##hi!####Hi!##hi!##hi!####01                  !IH!IH!IHhi!Hi!#1-#001#001#01                                     1#1-#001#001#     1", 2609);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2609 + "'", int2 == 2609);
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                 10.04100.040.0497.0410.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.Class<?> wildcardClass8 = floatArray5.getClass();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a100.0" + "'", str9, "1.0a100.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!ih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a100a100a10" + "'", str7, "-1a100a100a10");
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 410, (int) (byte) 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 2952, 227);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a100a0" + "'", str13, "100a-1a1a100a0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 -1 1 100 0" + "'", str19, "100 -1 1 100 0");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "041004100" + "'", str12, "041004100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 100, 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.040.040.0" + "'", str13, "1.040.040.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.040.040.0" + "'", str16, "1.040.040.0");
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1.040.040.0# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 716, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#10#1#100#100" + "'", str12, "-1#10#1#100#100");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1a10a1a100a100" + "'", str15, "-1a10a1a100a100");
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("40.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.0", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                       10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104-1" + "'", str9, "104-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a-1" + "'", str11, "10a-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#-1" + "'", str15, "10#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "104-1" + "'", str17, "104-1");
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1857.0f, (float) 399, (float) 172L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 172.0f + "'", float3 == 172.0f);
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...0 100 1", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#44#44A4#444A444#444A4#44#44A4#444A444#444A4#44#44A4#444A444#4-14#44#44A4#444A444#444A4#44#44A4#444A444#444A4#44#44A4#444A444#4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10 -1" + "'", str7, "10 -1");
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            0 -1hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0 -1hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 291, (int) '4');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 647, 122L, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 553, (float) 365L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("11hi!hi!hi! 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -11#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihh1#001#001#1-#011#001#001#1-#01!IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa# a # a#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 171L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 171L + "'", long2 == 171L);
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0A100.0                                                                                                                                                                      1.0A100.0                                                                                                                                                                      1.0A100.0                                                                                                                                                                      1.0A100.0                                                   ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0", (short) (byte) -14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -14 + "'", short2 == (short) -14);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 10100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      aaaaaaaaaaaaaai!", 3072);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3072 + "'", int2 == 3072);
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1.040.040.0# #   a#4a4#4a# #   a#4a4#4ahi!  hi!aaaaaaa hi! 4#4a# #   a#4a4#4a# #   a#4a4#4a# #   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("!!!!i!hhi!hi!hi!Hi!hi!hi!hi!Hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!!!i!hhi!hi!hi!Hi!hi!hi!hi!Hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(180.0d, (double) 4780, (double) 265.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4780.0d + "'", double3 == 4780.0d);
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1#1#100#100#10#100" + "'", str14, "-1#1#100#100#10#100");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444                  10a-1a100a100a1                   444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#4a4#4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 515, (float) 370L, (float) 507);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 515.0f + "'", float3 == 515.0f);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#-1#100#100#1                   hi!aaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", (float) 370);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 370.0f + "'", float2 == 370.0f);
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.04-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.04-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a100.0a0.0a97.0a", 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        float[] floatArray0 = new float[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104-1" + "'", str9, "104-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a-1" + "'", str11, "10a-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-1" + "'", str14, "104-1");
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                    #AAA#AA10a#4#44");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a100.0" + "'", str10, "1.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1852, 0.0d, (double) 131.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1852.0d + "'", double3 == 1852.0d);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 2752, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 0, 309);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) -1, (-1));
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 108, (int) (short) 1);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                              AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444#4#4 4", (float) 122L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 122.0f + "'", float2 == 122.0f);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1758, 517.0d, (double) 70.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1758.0d + "'", double3 == 1758.0d);
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 131, (float) (-14), (float) 291L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 291.0f + "'", float3 == 291.0f);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.04100.0" + "'", str10, "1.04100.0");
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 416, (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1" + "'", str12, "10 -1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 -1" + "'", str14, "10 -1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a-1" + "'", str16, "10a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "104-1" + "'", str18, "104-1");
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) '#', (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 3068, 390);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0#100.0" + "'", str15, "1.0#100.0");
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                     0.0A-1.0A10.0A100.0A0.0                                     ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 70, (int) (byte) 10);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.Class<?> wildcardClass12 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str12, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("          1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                         1 100 100 -1 10                                         ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 195, (long) 195, 549L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 195L + "'", long3 == 195L);
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa41-.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 585, (float) 520);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 585.0f + "'", float3 == 585.0f);
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 520, (int) ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 507, 3068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 507");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1685, (long) 84, 129L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 84L + "'", long3 == 84L);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 615.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 615.0d + "'", double2 == 615.0d);
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 891, (double) (byte) -14, 76.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 891.0d + "'", double3 == 891.0d);
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 0, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str15, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#a", (short) (byte) -14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -14 + "'", short2 == (short) -14);
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 778, (long) 70, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 778L + "'", long3 == 778L);
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(265L, 1852L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1852L + "'", long3 == 1852L);
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#4a4#4a44444444444444444444444444441#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihh", 195);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 195 + "'", int2 == 195);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 244, 122);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 3068, 406);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', (int) ' ', 539);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "041004100" + "'", str12, "041004100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("## #   A#### #   A#### #   A#### #   A#### #   A#### #   A#### #   A#### #   A####1I100I100I-1I10## #   A#### #   A#### #   A#### #   A#### #   A#### #   A#### #   A#### #   A#### 111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("!ih4!ih44!ihAA#AAA#AAHI!#AAA#AAHI!AAAAAAA#AAA#AA#AAA#HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 543);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543 + "'", int2 == 543);
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '4', 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(647.0d, (double) 194, 70.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 647.0d + "'", double3 == 647.0d);
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str11, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.04100.040.0497.0410.0" + "'", str13, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str17, "10.0 100.0 0.0 97.0 10.0");
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
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
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
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
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.011111111111", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#44...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("I");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"I\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("######################################################################## # a####################################################################################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
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
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "104-14100410041" + "'", str25, "104-14100410041");
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!10.0ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!a4444444444444444444444444444444444444444444444444444444444444444444hi!a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!10.0ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!ahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!ahi!a4444444444444444444444444444444444444444444444444444444444444444444hi!a10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 1 35 0 1 -1" + "'", str13, "0 1 35 0 1 -1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "[Daaaaaaaaaaaa [Ljava.lang.String;class [Bclass aaaaaaaaaaaa444444444444444444444444441.0#100.0Class");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: [Daaaaaaaaaaaa [Ljava.lang.String;class [Bclass aaaaaaaaaaaa444444444444444444444444441.0#100.0Class");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...10#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...0#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...-1#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...100", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 1758, 99);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str22, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str24, "0.0#-1.0#10.0#100.0#0.0");
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("i41104-14100410041104-14100410041104-1...", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  10#-1#100#100#1                  ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444#########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 70, 99.0f, (float) 588);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 588.0f + "'", float3 == 588.0f);
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAA", 4393);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4393 + "'", int2 == 4393);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" 97.0 10.0", 1749L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1749L + "'", long2 == 1749L);
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...                                             ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-############################################################################0.0 -1.0 10.0 100.0 0.0#############################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-############################################################################0.0 -1.0 10.0 100.0 0.0#############################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa10#-1#100#100#1                   hi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#AAA4AA!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 751L, (float) 419, (float) 309);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 309.0f + "'", float3 == 309.0f);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 265, (float) 300, (float) 2752);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 265.0f + "'", float3 == 265.0f);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 1758, 507);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short24 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 1 + "'", short24 == (short) 1);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!ih#############################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(745, 2952, 3072);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 745 + "'", int3 == 745);
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (-1), 1657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (long) 138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0a0.001a0.01a0.1-a0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!H1004-14141004");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!H1004-14141004");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100#-1#1#100#0" + "'", str14, "100#-1#1#100#0");
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.040.040.0# #   a#4a4#4a# #   a#4a4#4ahi!  hi!aaaaaaa hi! 4#4a# #   a#4a4#4a# #   a#4a4#4a# #      a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10.0a100.0a0.0a97.0a10.0# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("# # a###########################", 3072L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3072L + "'", long2 == 3072L);
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
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
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -14, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-414#40");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) '#', (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 3068, 390);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 543, 3640);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 543");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -14, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(543, 1, 226);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 543 + "'", int3 == 543);
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4440", 84L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4440L + "'", long2 == 4440L);
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) '4', (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4393, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short22 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short23 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str17, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str19, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 125, 231);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 125");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str16, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.04100.040.0497.0410.0" + "'", str18, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
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
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 150L, (float) 543L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 127, 554);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) -14, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(891, 70, 244);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(2952.0d, (double) 171, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       -1#10#1#100#100                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", (long) 226);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 226L + "'", long2 == 226L);
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("..................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                 ", (float) 180L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 180.0f + "'", float2 == 180.0f);
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 399.0f, (double) (-1.0f), 122.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 399.0d + "'", double3 == 399.0d);
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '4', 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#0" + "'", str11, "-1#0");
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) -14, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (short) 100, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 520, (int) ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14HI!AAHI!AAAAAAAAHI!A10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(520, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 0", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 353, 416);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 353");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-141410041004104100" + "'", str9, "-141410041004104100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaahi!hi!hi!                  10#-1#100#100#1                         ...aaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaahi!hi!hi!                  10#-1#100#100#1                         ...aaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(253, 0, 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 553L, 1857.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0#-1.0#10.0#100.0#0.0", (double) 566);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 566.0d + "'", double2 == 566.0d);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1#10#1#100#10044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(44444.0d, 0.0d, (double) 409L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4                                                                                                                                                                                                                                                                                                                                                                                                                                                                       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(220L, 131L, (long) 415);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 131L + "'", long3 == 131L);
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 382, (float) (-14L), (float) 291);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-14.0f) + "'", float3 == (-14.0f));
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a-1a100a100a1" + "'", str14, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a-1a100a100a1" + "'", str16, "10a-1a100a100a1");
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hhi!                                       1 100 100 -1 10                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1 1 100 100 10 100 .0 -1. hi! aaa#aahi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 .0 -1. .0 -1. .0 -1. .0 -1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short22 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 3068, (float) 615, (float) (short) -14);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-14.0f) + "'", float3 == (-14.0f));
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("i!a0#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#100111hi!hi!hi! 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -10#100#1001.0A100.00#1000 1 35 0 1 -");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1 0HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAAA4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 0HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAAA4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("           0.0a-1.0a1           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"           0.0a-1.0a1           \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1 0# # a104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AA#AAA#AAHI!#AAA#AAHI!AAAAAAA#AAA#AA#AAA#HI!", 1852);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1852 + "'", int2 == 1852);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a0HI0444", 122);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 122 + "'", int2 == 122);
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 -1" + "'", str16, "10 -1");
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 585, (float) 549, (float) 340);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 340.0f + "'", float3 == 340.0f);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                 10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411100.0 -1.0HI!HI!HI!                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411100.0 -1.0HI!HI!HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14-141004100" + "'", str8, "-14-141004100");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 507.0f, (double) 244, (double) (-14.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14.0d) + "'", double3 == (-14.0d));
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(4393.0f, (float) 2703, (float) 615);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4393.0f + "'", float3 == 4393.0f);
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 176, 1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#100.0" + "'", str14, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 171, 383);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 171");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1 100 100 -1 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("CLASS [lJAcLASS [bCLASS [lJAVA.LANG.sTRING;CLASS [d   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# TRING;CLASS [lJAVA.LANG.sTRING;CLASS [iCLASS [[[lJAVA.LANG.REFLECT.aNNOTATEDeLEMENT;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CLASS [lJAcLASS [bCLASS [lJAVA.LANG.sTRING;CLASS [d   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# #4A#4A4#   A# TRING;CLASS [lJAVA.LANG.sTRING;CLASS [iCLASS [[[lJAVA.LANG.REFLECT.aNNOTATEDeLEMENT;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a-1a1a100a0" + "'", str14, "100a-1a1a100a0");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) 'a', 0);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 4440, 0);
        int int30 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10#-1#100#100#1" + "'", str21, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        short[] shortArray2 = new short[] { (short) 0, (short) -1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, -1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 -1" + "'", str4, "0 -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "04-1" + "'", str6, "04-1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "04-1" + "'", str9, "04-1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 4440, 553L, 3072L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4440L + "'", long3 == 4440L);
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 81, 383);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 81");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.-140");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#4#44a                                                                                           ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "041004100" + "'", str8, "041004100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0a100a100" + "'", str11, "0a100a100");
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 4163, 164);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str14, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str17, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str18, "0.0 -1.0 10.0 100.0 0.0");
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 1, (int) (short) 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 549, 549);
        short short26 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 1 + "'", short26 == (short) 1);
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4#a44##4##44#a44##4##4a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4#", (double) 180L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 180.0d + "'", double2 == 180.0d);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        float[] floatArray3 = new float[] { (byte) 0, (byte) 1, (-1.0f) };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 875, 195);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.041.04-1.0" + "'", str6, "0.041.04-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0# #   A", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 370, 10);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float19 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 127, 10);
        float float24 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a35.0a-1.0a10.0a-1.0" + "'", str10, "0.0a35.0a-1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0a35.0a-1.0a10.0a-1.0" + "'", str18, "0.0a35.0a-1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 35.0f + "'", float19 == 35.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 35.0f + "'", float24 == 35.0f);
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 180, (float) 227, (float) 2648);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 180.0f + "'", float3 == 180.0f);
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(131, 1685, 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1685 + "'", int3 == 1685);
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                         hI!AAAAAAA", 1856);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1856 + "'", int2 == 1856);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a# #   a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-141410041004104100class [Iclass [Bclass [Ljava.lang.String;class [Ljava.lang.String;a# #   a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAaAaaAAAa", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) (byte) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0#", (long) 615);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 615L + "'", long2 == 615L);
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1", 1685);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1685 + "'", int2 == 1685);
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0a100a100" + "'", str9, "0a100a100");
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#0.100110.1-0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 175);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 175 + "'", int2 == 175);
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 -1 100 100 1" + "'", str9, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 647, 100);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str14, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str20, "0.04-1.0410.04100.040.0");
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '4', 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#0" + "'", str11, "-1#0");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str14, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (short) -14, 3070);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#aaaaaaa##4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...", (long) 1857);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1857L + "'", long2 == 1857L);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(2952, 415, 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2952 + "'", int3 == 2952);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) -14, (double) 108L, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 108.0d + "'", double3 == 108.0d);
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hhi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', (int) '4', (int) '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 716, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "#4#4 4a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #4#4 4a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2703, (float) 84L, (float) 2691);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2703.0f + "'", float3 == 2703.0f);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int27 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 244, 273);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 244");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "104-14100410041" + "'", str25, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) -14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -14 + "'", short2 == (short) -14);
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 100, 195L, 553L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 0, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -14, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(127, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 127 + "'", int3 == 127);
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10#-1#100#100#1 10#-1#100#100#1!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str16, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str18, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#4A4#4A                                                                                                                                                                                                                                                                                                                                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#4A4#4A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 3070, 543);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# # #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# hi!aaaaaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# hi!# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (byte) -1, (int) (byte) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (short) 100, 10);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(" a#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 226, (long) 39, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.04100.040.0497.0410.0" + "'", str13, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 100, (short) (byte) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 10, 176);
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
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "104-14100410041" + "'", str25, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10 -1 100 100 1" + "'", str27, "10 -1 100 100 1");
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0 . 0 A - 1 ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 459, (double) 81L, (double) 517L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 517.0d + "'", double3 == 517.0d);
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 108, (long) 176, 150L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 176L + "'", long3 == 176L);
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1#10#1#100#100" + "'", str9, "-1#10#1#100#100");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a10a1a100a100" + "'", str12, "-1a10a1a100a100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 10 1 100 100" + "'", str14, "-1 10 1 100 100");
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(353.0f, 93.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 353.0f + "'", float3 == 353.0f);
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                    10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(93, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 93 + "'", int3 == 93);
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-14");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + (-14) + "'", number1, (-14));
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 716, 0.0f, (float) 84L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 716.0f + "'", float3 == 716.0f);
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "HI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 -1 1 100 0" + "'", str10, "100 -1 1 100 0");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str10, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str12, "10.0 100.0 0.0 97.0 10.0");
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!                          ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', (int) (short) 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str10, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str17, "10.0#100.0#0.0#97.0#10.0");
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" a#a4a a ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 751, 615);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10.0#100.0#0.0#97.0#10.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0#100.0#0.0#97.0#10.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 0, 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 168 + "'", int3 == 168);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 3072, 176);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1685, 99);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1662, 515, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 93 + "'", int3 == 93);
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2703, 3022, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 0, 2752);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "04143540414-1" + "'", str16, "04143540414-1");
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10 10 0 -1 100                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 10 0 -1 100                                                                                              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 131, (-140));
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (-14.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-14.0f) + "'", float3 == (-14.0f));
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0#100#10##hi!##hi!####hi!Hi!##hi!##hi!####hi!Hi!##hi!##hi!####Hi!##hi!##hi!####01!IH!IH!IHhi!Hi!#1-#001#001#011#1-#001#001#1", 1857);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1857 + "'", int2 == 1857);
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aa#aaa#aaaaa#aaa#aaaaaaaaaaaa#aaa#aa#aaa#aaHaaaaa#aaa#aaaaa#aaa#aaaaaaaaaaaa#aaa#aa#aaa#aaHaaaaaaaaaaaa#aaa#aaaaa#aaa#aaaaaaaaaaaa#aaa#aa#aaa#aaHaa#aaa#aaaaa#aaa#aaaaaaaaaaaa#aaa#aa#aaa#aaHaaaHIaHIaHIa                  10#-1#100#100#1                                     10#-1#100#100#1     ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!aaa#aaHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!10#-1#100#100#110#-1#100#100#1HI!HI!HI!10#-1#100#100#110#-1#100#100#1HI!AAAAAAAHI!HI!HI!10#-1#100#100#110#-1#100#100#1HI!HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                      ", 151.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 151.0d + "'", double2 == 151.0d);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        double[] doubleArray5 = new double[] { 265.0d, 99L, 131.0f, 1662L, 129 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 751, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[265.0, 99.0, 131.0, 1662.0, 129.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "265.0499.04131.041662.04129.0" + "'", str7, "265.0499.04131.041662.04129.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1662.0d + "'", double8 == 1662.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "265.0a99.0a131.0a1662.0a129.0" + "'", str14, "265.0a99.0a131.0a1662.0a129.0");
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0 100.0" + "'", str8, "1.0 100.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("14-1.040.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 93);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93L + "'", long2 == 93L);
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 3072, 176);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444444444444441.0#100.0", 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        float[] floatArray0 = new float[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, '4');
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 410, 70);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1758, 353);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("       ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a0" + "'", str6, "-1a0");
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a# #   a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# #   a#", (long) 553);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 553L + "'", long2 == 553L);
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!                                                                                              AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("# ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("  10a a10a a0a a-a1a a100a a0   ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#4a4#4a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1a0HI0444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a0HI0444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 0, (int) (byte) -1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 365, 227);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0#100.0" + "'", str6, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa##########################1.0#100.ih!ih!iH#####a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa##########################1.0#100.ih!ih!iH#####a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) (byte) 10, 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) 'a', (int) (byte) 1);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 176, 129);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                 HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0-1.0", (float) 891);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 891.0f + "'", float2 == 891.0f);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) (byte) 10, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str15, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.04100.040.0497.0410.0" + "'", str17, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(265.0f, (float) 70L, (float) 138L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 265.0f + "'", float3 == 265.0f);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 0, 0);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) '#', (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 3022, 164);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 419, 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str20, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ##########################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#001#001#1-#01 1#001#001#1-#01 !ih!ih!ih", (double) 4.4444446E32f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444591917127E32d + "'", double2 == 4.444444591917127E32d);
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 1 100 100 10 100                                                                                             .0 -1.           hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1                                        .0 -1.                                                                                             .0 -1.                                                                                             .0 -1.                                                                                             .0 -1.      ", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA.AAA#AA.AAA#AA.AAA#AAHI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
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
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 195, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 59, 253);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                   #aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 615, 151.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                               444444444444444444444444444444444444444444444440.001#0.14444444444444444AAAAAAA!IH44444444444444444444444444444444444444444444444                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444440.001#0.14444444444444444AAAAAAA!IH44444444444444444444444444444444444444444444444                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
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
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 4393, 167);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", (byte) -14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -14 + "'", byte2 == (byte) -14);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#-1#100#100#1" + "'", str20, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10 -1 100 100 1" + "'", str22, "10 -1 100 100 1");
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("00001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.11                                                                                                                                                                                                                                                  hi!hi!hi!                  10#-1#100#100#1                         ...                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 00001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.11                                                                                                                                                                                                                                                  hi!hi!hi!                  10#-1#100#100#1                         ...                                                                                                                                                                                                                                                   is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 891, 1749);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 891");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str11, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', (int) (short) 0, (int) (byte) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', (int) (byte) 100, 99);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 0, 554);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str17, "0.0a-1.0a10.0a100.0a0.0");
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 0, (long) 340, 520L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', (long) 1685, (long) (byte) -14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1685L + "'", long3 == 1685L);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!hi!aahi!aaaaaaaahi!ahi!aahi!aaaaaaaahi!ahi!aaaaaaahi!aahi!aaaaaaaahi!ahi!hi!aahi!aaaaaaaahi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!aahi!aaaaaaaahi!ahi!aahi!aaaaaaaahi!ahi!aaaaaaahi!aahi!aaaaaaaahi!ahi!hi!aahi!aaaaaaaahi!a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#################10a-1a100a100a1#aaaaaaa##4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#10...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!                                                                                          ", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 200, (float) 520L, (float) 70);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 70.0f + "'", float3 == 70.0f);
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray4, '#');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#-1#100#100" + "'", str7, "-1#-1#100#100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1#-1#100#100" + "'", str9, "-1#-1#100#100");
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                     0.0A-1.0A10.0A100.0A0.0                                     HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 176, 1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.04100.0" + "'", str17, "1.04100.0");
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 1852L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(291, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 0, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.00.097.0", (long) 39);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39L + "'", long2 == 39L);
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 365, (-140));
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 520, (int) ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 0, (int) (byte) 0);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          !ih!ih!ih!ih!a4a44!ih!ih!ih!ih!HI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10.0a100.0#1                   #100#100#-1#                 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0a100.0#1                   #100#100#-1#                 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 365, 100);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 520, (int) (byte) 0);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 273, 226);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH     1#001#001#1-#01                                     11I100I100I-1I10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -14, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#4#44aa...", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1                  #100#100#-1#1                  HI!                  10#100#100#-1#1                  HI!                  10#100#100#-1#1                                    10#100#100#-1#HI!                  10    ...", (float) 365);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 365.0f + "'", float2 == 365.0f);
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 778, 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.04100.0" + "'", str8, "1.04100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 507L, (float) 122L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -14, 216, 891);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(382, 566, 226);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 226 + "'", int3 == 226);
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444                                                                                                        I     444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.444444444444444444444444444444444444444444444444-1 044444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -14, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a-1" + "'", str15, "10a-1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("############################################################################################################################################iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii############################################################################################################################################", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(".0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("114001400141-40114001400141-40114001400141-40114001400141-40114001400141-40114001400141-401                   1#001#001#1-#01                                                                                                                                                                                                                                                                                             4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!ih                                                                                                    4!ih4!ih44!iH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 340, (long) 291, (long) 76);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 76L + "'", long3 == 76L);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1#10#1#100#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 1, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (short) 10, 0);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -14, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                  aaa4aa!ih!ih!ih!ih!a4a44!ih!ih!ih!ih!HI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 73);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 73.0d + "'", double2 == 73.0d);
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10.0a4444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!10.0a", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 549, 1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("140.1-40.0clss [Bclss [Ljv.lng.String;clss [D140.1-40.0clsHI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!H1004-14141004140.1-40.0clss [Bclss [Ljv.lng.String;clss [D140.1-40.0clss");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444...# #   A# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A", (double) 4393);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4393.0d + "'", double2 == 4393.0d);
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 0, 0);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 543, 507);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 84, 164);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84");
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
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0#-1100.0 -1.0#4#44                                                                                             #AAA#AA410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4440L, (float) 100, 4393.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        double[] doubleArray5 = new double[] { 265.0d, 99L, 131.0f, 1662L, 129 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 382, 231);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[265.0, 99.0, 131.0, 1662.0, 129.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "265.0499.04131.041662.04129.0" + "'", str7, "265.0499.04131.041662.04129.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1662.0d + "'", double8 == 1662.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "265.0#99.0#131.0#1662.0#129.0" + "'", str10, "265.0#99.0#131.0#1662.0#129.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "265.0a99.0a131.0a1662.0a129.0" + "'", str12, "265.0a99.0a131.0a1662.0a129.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) -14, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) '4', 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 1852, 1662);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 515, 409);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0 0.0A-1.0A10.0A100.0A0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                    10.04100.040.0497.0410.0                                                     ", (long) 549);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 549L + "'", long2 == 549L);
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -14, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -14, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("####################-##############################hi!aaaaaaa", 151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 151 + "'", int2 == 151);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 100, (int) '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 -1 100 100 1" + "'", str18, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "104-14100410041" + "'", str20, "104-14100410041");
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(543L, (long) 672, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2752, (double) 3068L, (double) 509.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3068.0d + "'", double3 == 3068.0d);
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1##### ####                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1##### ####\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1111111111111111111 ## - 1 # 1 ### 1 ### 1111111111111111111", (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-14-141004100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -14-141004100");
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
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 553, 2609);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 553");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 81, 1857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 81");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 176, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 1, 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0#100.0" + "'", str17, "1.0#100.0");
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 -1 1 100 0" + "'", str10, "100 -1 1 100 0");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 647, 100);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str14, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str20, "0.0 -1.0 10.0 100.0 0.0");
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 507, (int) (short) -1);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 168, 459);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 168");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str13, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 543.0f, (double) 543, (double) 167L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 167.0d + "'", double3 == 167.0d);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14", 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 3072, 1662);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10410404-1410040" + "'", str17, "10410404-1410040");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1379, 1685, 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1685 + "'", int3 == 1685);
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100404141404-1" + "'", str14, "100404141404-1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI!10041104-14100410041104-14100410041104-1...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 778L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 778L + "'", long2 == 778L);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) -1, (-1));
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str14, "0.0a-1.0a10.0a100.0a0.0");
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 647, 216);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.0-1.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#1", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 265, (int) (short) 10);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 0, (-1));
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 588, 309);
        double double24 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double25 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0#35.0#-1.0#10.0#-1.0" + "'", str11, "0.0#35.0#-1.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a35.0a-1.0a10.0a-1.0" + "'", str16, "0.0a35.0a-1.0a10.0a-1.0");
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 2752, (int) (byte) 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 1, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 99, 1758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(543.0f, (float) 168, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 543.0f + "'", float3 == 543.0f);
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 549, 1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 10, 0.0f, (float) 520L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 520.0f + "'", float3 == 520.0f);
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) '#', (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 37, (int) (short) 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0A100.0A0.0.1-#0.0010.1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100#-1#1#100#0" + "'", str14, "100#-1#1#100#0");
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 0" + "'", str5, "-1 0");
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) '#', (int) (short) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 2609, 459);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str16, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0-1.010.0100.00.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0-1.010.0100.00.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a1a1                                                                                                                                                                                                                                                                                                                                                             ", 4163L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4163L + "'", long2 == 4163L);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 1, 70.0d, (double) 151);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 151.0d + "'", double3 == 151.0d);
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) 10);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 382, 244);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 0, (int) (byte) -1);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1" + "'", str24, "1");
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...a#4#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...a#4#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#-1#100#100#1" + "'", str13, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a-1a100a100a1" + "'", str19, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 1, (int) (short) 0);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 0, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0a1a35a0a1a-1" + "'", str13, "0a1a35a0a1a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0#1#35#0#1#-1" + "'", str15, "0#1#35#0#1#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "04143540414-1" + "'", str17, "04143540414-1");
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1#1#100#100#10#100                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10#10#0#-1#100#0" + "'", str14, "10#10#0#-1#100#0");
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...HI!   #  HI!AAAAAAAAAAAAHI!AA...");
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
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger3 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger5 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger[] bigIntegerArray6 = new java.math.BigInteger[] { bigInteger1, bigInteger3, bigInteger5 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray6);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigIntegerArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str7, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
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
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#100#100#1" + "'", str12, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(231L, 588L, 2703L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2703L + "'", long3 == 2703L);
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("140.1-40.0clss [Bclss [Ljv.lng.String;clss [D140.1-40.0clsHI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!H1004-14141004140.1-40.0clss [Bclss [Ljv.lng.String;clss [D140.1-40.0clss");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140                                                                                                                                                                                                                                                                                                                                                                                                                                                               -1#10#1#100#100");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("      1#001#001#1-#01                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"      1#001#001#1-#01                               \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 1758L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1758.0d + "'", double2 == 1758.0d);
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 365, 129);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4-1.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4-1.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("40.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.014-1.040.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.Class<?> wildcardClass13 = shortArray1.getClass();
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
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str12, "10.0#100.0#0.0#97.0#10.0");
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           100.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.0-0.0#-1.0#10.0#100.0#0.010.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.01000.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.01000.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.0100.0#-1.0#10.0#100.0#0.0.0.0#-1.0#10.0#100.0#0.0040.0#-1.0#10.0#100.0#0.0-0.0#-1.0#10.0#100.0#0.010.0#-1.0#10.0#100.0#0.0.0.0#-1.0#10.0#100.0#0.0041                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -14, (short) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a-1a100a100a1" + "'", str13, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 -1 100 100 1" + "'", str16, "10 -1 100 100 1");
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.0 -1.0hi!hi!hi!                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0 -1.0hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10#-1#100#100#1###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.041.04-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', (int) '#', 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str18, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 131, (-140));
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 172, 108);
        short short23 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4', 1662, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "HI!HI!HI!                  10-11001001                                     10-11001001     ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!HI!HI!                  10-11001001                                     10-11001001     ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-14-141004100" + "'", str9, "-14-141004100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1a-1a100a100" + "'", str15, "-1a-1a100a100");
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 392, 108);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 192, 891.0f, (float) 3068L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3068.0f + "'", float3 == 3068.0f);
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 2691, 3067);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2691");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 -1" + "'", str9, "10 -1");
    }
}

