package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4001");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0#1#10.0a#a#a#a#a#a#a#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0a52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4002");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa110410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa110410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4003");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#1" + "'", str12, "100#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a1" + "'", str14, "100a1");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4004");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(9L, 65L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4005");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#1#100#0#10" + "'", str12, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4006");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(7.0d, (double) 61.0f, (double) 1098504L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.0d + "'", double3 == 7.0d);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4007");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4008");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("... #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #...", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4009");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#10#97" + "'", str10, "10#10#97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4010");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4011");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 100 10 -1.0 true-1 -1 100 0#1#1#10               aaaaaaaaaa", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4012");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" a #a #a #a #a #a #a #a #a #a # aa#aa#aa#aa#aa#aa#aa#aa#aa#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a #a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4013");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.25A0.1-", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4014");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 107L, (double) 101L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.0d + "'", double3 == 107.0d);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4015");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 75, 235);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 75");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4016");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4017");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4018");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97410041040404102" + "'", str14, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 100 10 0 0 102" + "'", str16, "97 100 10 0 0 102");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 102L + "'", long17 == 102L);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4019");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 31.0f, (double) 1098504, (double) 102);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.0d + "'", double3 == 31.0d);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4020");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4021");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4022");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', (int) (byte) 100, (int) (short) 10);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', (int) 'a', 27);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0a1a1a10" + "'", str8, "0a1a1a10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4023");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaa aaaa -aaa141004-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4024");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 25, 0);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4025");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35.0a23.0a97.0a52.0" + "'", str7, "35.0a23.0a97.0a52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4026");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 252, 60);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#1" + "'", str12, "-1#1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4027");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4028");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                             ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.04444444444444 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                             ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.04444444444444 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4031");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 61, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4032");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4033");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 97, (int) (byte) 1);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 408, 1297);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 408");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4034");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(871L, (long) 1458, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0a5210a5297");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a5210a5297\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4036");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.010a10a0a0a10a10a10a0a0a10a10a10a0a0a10a10a10a0a0a10a10a1", 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4037");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4038");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 49, (double) 23L, (double) 169L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 169.0d + "'", double3 == 169.0d);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4039");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4040");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 -1 100 10 -1.0 true-1 -1 100 4                                                                                             -14");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4041");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 1...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4042");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 111, 0);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 42, 676);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 102L + "'", long17 == 102L);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4043");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4044");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4045");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("  ###-##-eurt# ##-# ####################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4046");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0#1#10.0a#a#a#a#a#a#a#a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4047");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-141" + "'", str6, "-141");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#1" + "'", str10, "-1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a1" + "'", str12, "-1a1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4048");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("     44444444  44444444  44444444  44444444 0#1#1#0#1#1#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4049");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 111, 0);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 102L + "'", long17 == 102L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4050");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(88, 5, 1297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1297 + "'", int3 == 1297);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4051");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                          # 001 1- 1-eurt", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4052");
        int[] intArray3 = new int[] { '#', (-141), 821 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, -141, 821]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 821 + "'", int4 == 821);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 821 + "'", int5 == 821);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4053");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                     -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4054");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 52, 77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97410041040404102" + "'", str11, "97410041040404102");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4056");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1 -1 100 10 -1.0 true-1 -1 100 4                                                                                             -14");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4057");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4058");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4059");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4060");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4061");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("001 1- 1-EURT 0.1- 01 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4062");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 41, 0);
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 97, (int) (short) 52);
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 0 + "'", byte29 == (byte) 0);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4063");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 104, 17);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 101, 0);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10a1a100a0a10" + "'", str20, "10a1a100a0a10");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("# A# A# A# A# A# A# A# A# AA# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# A# A# A# A# A# A# A# A# AA# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4065");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".0a52.0-1a...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4066");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444444444444444444444444444444440#1#1#0#1#14444                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4067");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4068");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(98, 33, 867);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4069");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4070");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 41, (int) (byte) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#1" + "'", str12, "100#1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100#1" + "'", str18, "100#1");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4071");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a4#4aaaaaaaaaaaAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4072");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 51, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 87, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#1#100#0#10" + "'", str15, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4073");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 1 100 0 10" + "'", str14, "10 1 100 0 10");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4074");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4075");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4076");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                             -1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4077");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0          ...", 72.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 72.0d + "'", double2 == 72.0d);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4078");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                            A #                                         44444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                            A #                                         44444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4080");
        float[] floatArray3 = new float[] { 101, 10041, 30 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[101.0, 10041.0, 30.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "101.0#10041.0#30.0" + "'", str5, "101.0#10041.0#30.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10041.0f + "'", float6 == 10041.0f);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4081");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4', 96, 82);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35.0a23.0a97.0a52.0" + "'", str7, "35.0a23.0a97.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35.0 23.0 97.0 52.0" + "'", str9, "35.0 23.0 97.0 52.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35.0a23.0a97.0a52.0" + "'", str16, "35.0a23.0a97.0a52.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4082");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4083");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 54, (int) (short) 52);
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0#1#1#10" + "'", str14, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "04141410" + "'", str16, "04141410");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4084");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 867, 2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4085");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-141" + "'", str7, "-141");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1" + "'", str9, "-1a1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4086");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', 32, 162);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 23.0d + "'", double6 == 23.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4087");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 263L, 11.0f, (float) 47);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 263.0f + "'", float3 == 263.0f);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4088");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041410040410" + "'", str14, "1041410040410");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                    01110-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                    01110-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                    \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4090");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaa               ", (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4091");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', (int) (short) 1, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04141410" + "'", str8, "04141410");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0#1#1#10" + "'", str16, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4092");
        float[] floatArray3 = new float[] { '#', (-141), (byte) 0 };
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[35.0, -141.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-141.0f) + "'", float6 == (-141.0f));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4093");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 89, 352);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 89");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                        true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4095");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', (int) (short) 1, (-141));
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 92, 2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4096");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("    -1.0A52");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4097");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("               aaaaaaaaaa# A# A# A# A# A# A# A# A# A# A");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4098");
        int[] intArray2 = new int[] { 48, 9 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 67, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[48, 9]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4099");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 252, (int) (short) 100);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("######################################################.#a52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######################################################.#a52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4101");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#10#1#100#0#10hi!-1 -1 100 10 -1.0 true-1 -1 100a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4102");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4103");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 54, (double) 864L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4105");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 97, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4106");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a  A 001 1- 1-EURT 0.1- 01 001 1- 1-", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4107");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("         10a-1         ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4108");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 10, (float) 871L, (float) 169L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 871.0f + "'", float3 == 871.0f);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4109");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaa                                                    a-a1a.a0aaa52a.a0aaaaaaaaaaaaaaaaaaaaa                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1#1#1", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4110");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(2.0f, (float) 90, 41.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 90.0f + "'", float3 == 90.0f);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4111");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 -1 100 10 -1.0 TRUE-1 -1 100 HI!-1 -1 100 10 -1.0 TRUE-1 -1 100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4112");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 52, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4113");
        short[] shortArray4 = new short[] { (byte) -1, (byte) -1, (short) 0, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', (int) (byte) 100, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, -1, 0, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14-140410" + "'", str10, "-14-140410");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1#-1#0#10" + "'", str14, "-1#-1#0#10");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4114");
        int[] intArray2 = new int[] { 48, 9 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 41, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[48, 9]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "48a9" + "'", str9, "48a9");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4115");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 166, 28);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#52.0" + "'", str10, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4116");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...a52.0-1a4#0 1 0 1--1.0a##########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4117");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                        2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4118");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1432, 0, 1452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4119");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4120");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 11, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0#1#1#10" + "'", str17, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4121");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a##a#a####a##a#a####a##a#a###.aa52.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4122");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("TRUE-1 -1 100 0.0##########################################-1.0A52.0", 3224);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3224 + "'", int2 == 3224);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4123");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 96, (float) 33L, (float) 75L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 33.0f + "'", float3 == 33.0f);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4124");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(201, 183, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4125");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4126");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A#A#A#A\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A#A#A#A?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4129");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(455, 17, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4130");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4131");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4132");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444", (long) 45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4133");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410", (short) 52);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 52 + "'", short2 == (short) 52);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4134");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((-1404140.0d), (double) 95L, 48.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1404140.0d) + "'", double3 == (-1404140.0d));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4135");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 83, (long) 179, (long) 136);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 179L + "'", long3 == 179L);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4136");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(51.0f, (float) 55L, 15.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a ###        ##        ##        #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a ###        ##        ##        #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4138");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', (-1), 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4139");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(2881L, 162L, (long) 101097);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101097L + "'", long3 == 101097L);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4140");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 110, 8);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0#52.0" + "'", str7, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0452.0" + "'", str16, "-1.0452.0");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4141");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A A A A", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4142");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "1a1.0a52.-1a1.0a52.-1a1.0a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1a1.0a52.-1a1.0a52.-1a1.0a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10a1a100a0a10" + "'", str20, "10a1a100a0a10");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("   44444444  44444444  44444444  44444444 0#1#1#0#1#1100.0 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   44444444  44444444  44444444  44444444 0#1#1#0#1#1100.0 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4144");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.Class<?> wildcardClass18 = floatArray1.getClass();
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("97410041040404102", ' ');
        java.lang.Class<?> wildcardClass22 = strArray21.getClass();
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1", "", 100);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray28);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("#", (java.lang.CharSequence) "#-1 -1 100 10 -1.0 true-1 -1 100 a", (java.lang.CharSequence[]) strArray28);
        java.lang.Class<?> wildcardClass31 = strArray28.getClass();
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.appendIfMissing("                                                            A #                                         ", (java.lang.CharSequence) "44444444444444444444444444444444", (java.lang.CharSequence[]) strArray35);
        java.lang.Class<?> wildcardClass37 = strArray35.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray38 = new java.lang.reflect.AnnotatedElement[] { wildcardClass18, wildcardClass22, wildcardClass31, wildcardClass37 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray39 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray38 };
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray39);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#-1 -1 100 10 -1.0 true-1 -1 100 a#" + "'", str30, "#-1 -1 100 10 -1.0 true-1 -1 100 a#");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                                            A #                                         44444444444444444444444444444444" + "'", str36, "                                                            A #                                         44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(annotatedElementArray38);
        org.junit.Assert.assertNotNull(annotatedElementArray39);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4145");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 16, 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 0, 455);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4146");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4147");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1hI!-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4148");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4149");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#0#10hi!-1 -1 100 10 -1.0 tr", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4150");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0#52.0-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0-1.0#52.0-1.0#52.0-1.0#52.0-...", (float) 110L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 110.0f + "'", float2 == 110.0f);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4151");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4152");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".0-1.0a52.0-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1a1a10a1a100a0a10-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1a10a1a100a0a10-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4154");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 2, (double) 16L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4155");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1#1" + "'", str14, "-1#1");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4156");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 102L + "'", long10 == 102L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 102L + "'", long11 == 102L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4157");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray5, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 90, 871);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 90");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1004100410041041" + "'", str11, "1004100410041041");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#100#100#10#1" + "'", str13, "100#100#100#10#1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#A 001 1- 1-EURT 0.1- 01 001 1- 1-#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4159");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a0a1a0-1.0a5         10a-", (double) 169);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 169.0d + "'", double2 == 169.0d);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4161");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3, 2, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4162");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 52, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4163");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4164");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(22, 4141410, 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4165");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 41.0d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 41.0d + "'", double3 == 41.0d);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4166");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("141-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4167");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, (long) 1151, (long) 859);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1151L + "'", long3 == 1151L);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4168");
        float[] floatArray5 = new float[] { 1098504L, Float.POSITIVE_INFINITY, 5, 35, 2560 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[1098504.0, Infinity, 5.0, 35.0, 2560.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 5.0f + "'", float7 == 5.0f);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4169");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(52.0d, (double) 47, 23.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.0d + "'", double3 == 23.0d);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("01a0a0a01a001a79# a# a# a# a# a# a# a# a# a# a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a0a0a01a001a79# a# a# a# a# a# a# a# a# a# a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4171");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a # #A 001 1- 1-EURT 0.1- 01 001 1- 1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a # #A 001 1- 1-EURT 0.1- 01 001 1- 1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4174");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A1", (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4175");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.0", 188);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 188 + "'", int2 == 188);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4176");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4177");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".0a52.0 .0a52.0 .0a52.0 .0a52.0 .0a52.0 0#1#1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4178");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 25, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 9, 9);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 106, 106);
        float float30 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.0" + "'", str25, "0.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4179");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 1" + "'", str14, "100 1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4180");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4181");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 tr...", 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4182");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97#100#10#0#0#102" + "'", str11, "97#100#10#0#0#102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97a100a10a0a0a102" + "'", str13, "97a100a10a0a0a102");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97 100 10 0 0 102" + "'", str15, "97 100 10 0 0 102");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4184");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4185");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##02-1.052.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4186");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', (int) (short) 1, (int) (short) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 102L + "'", long10 == 102L);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4187");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...  ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...  ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4188");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a 100 10 -1.0 true-1 -1 100 a# #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4189");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("# a# a# a# a# a# a# a# a# a# aa", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4190");
        int[] intArray2 = new int[] { 48, 9 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 41, 0);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[48, 9]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "48a9" + "'", str10, "48a9");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4191");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 3, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4192");
        int[] intArray1 = new int[] { 2 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4193");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 86, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4194");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("true-1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4195");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger3 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger bigInteger5 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger7 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger[] bigIntegerArray8 = new java.math.BigInteger[] { bigInteger1, bigInteger3, bigInteger5, bigInteger7 };
        java.math.BigInteger bigInteger10 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger12 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger bigInteger14 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger16 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger[] bigIntegerArray17 = new java.math.BigInteger[] { bigInteger10, bigInteger12, bigInteger14, bigInteger16 };
        java.math.BigInteger bigInteger19 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger21 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger bigInteger23 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger25 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger[] bigIntegerArray26 = new java.math.BigInteger[] { bigInteger19, bigInteger21, bigInteger23, bigInteger25 };
        java.math.BigInteger bigInteger28 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger30 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger bigInteger32 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger34 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger[] bigIntegerArray35 = new java.math.BigInteger[] { bigInteger28, bigInteger30, bigInteger32, bigInteger34 };
        java.math.BigInteger bigInteger37 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger39 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger bigInteger41 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger43 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444");
        java.math.BigInteger[] bigIntegerArray44 = new java.math.BigInteger[] { bigInteger37, bigInteger39, bigInteger41, bigInteger43 };
        java.math.BigInteger[][] bigIntegerArray45 = new java.math.BigInteger[][] { bigIntegerArray8, bigIntegerArray17, bigIntegerArray26, bigIntegerArray35, bigIntegerArray44 };
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray45);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigIntegerArray8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigIntegerArray17);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigIntegerArray26);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(bigInteger30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigInteger34);
        org.junit.Assert.assertNotNull(bigIntegerArray35);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigInteger39);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(bigIntegerArray44);
        org.junit.Assert.assertNotNull(bigIntegerArray45);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4196");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3224, (long) 126, (long) 14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4197");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a52.0aaaaaaaaaaaaaaaaaaaa", (double) 156L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 156.0d + "'", double2 == 156.0d);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4198");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 0, 113);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4199");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0          ...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4200");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # #                                                                                              -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4201");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4202");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -141, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4203");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97 100 10 0 0 102" + "'", str11, "97 100 10 0 0 102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4204");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 18L, (double) 104.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4205");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaa52a52a52a52a52a52a52a52a52a52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4206");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4207");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0                                   97111111");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4208");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "Aa#aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Aa#aa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10a1a100a0a10" + "'", str20, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10 1 100 0 10" + "'", str22, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 100 + "'", byte23 == (byte) 100);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4209");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!-1 -1 100 10 -100.0a10.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!-1 -1 100 10 -100.0a10.0a-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4211");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4212");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 53, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0a1a1a10" + "'", str18, "0a1a1a10");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4213");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4214");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("    -1.0A52", (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4215");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                               44a4aaaaaaaaaaaaaaaaaaaaaaa", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4216");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', (int) 'a', 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-141" + "'", str14, "-141");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...                                             ...100.0 10.0 -1.0100.0 10.0 -1.010aaaaaaaaaA4#4A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ...                                             ...100.0 10.0 -1.0100.0 10.0 -1.010aaaaaaaaaA4#4A is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4218");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43L + "'", long2 == 43L);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4219");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 867, 13);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4220");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0 10.0 -1.0100.0 10.0 -1.010#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4221");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 98, (double) 1432, 41.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1432.0d + "'", double3 == 1432.0d);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4222");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4223");
        int[] intArray1 = new int[] { 2 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 1151, 1452);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1151");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4224");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" 10 -1.0 true-1 -1 100aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4225");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4226");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 31L, 4141410.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4227");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("# A# A# A# A# A# A# A# A# A# A.0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" A# A#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4228");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1297L, 0.0d, 4.4444444444444445E51d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4229");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("35.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4230");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(60L, (long) 140, (long) 87);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4231");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4232");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "          .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A520 10.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:           .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A520 10.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a1a100a0a10" + "'", str18, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a1a100a0a10" + "'", str21, "10a1a100a0a10");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4233");
        int[] intArray2 = new int[] { 859, 1432 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 0, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 23, 0);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[859, 1432]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1432 + "'", int11 == 1432);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4234");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4235");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 8, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100#1#1#0#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100#1#1#0#1#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#############################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4238");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0#1#1#10" + "'", str17, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0a1a1a10" + "'", str19, "0a1a1a10");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "04141410" + "'", str21, "04141410");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4239");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 52, (short) (byte) 100, (short) -141);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4240");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(197, (int) (byte) 100, 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4241");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(52, 8, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4242");
        int[] intArray5 = new int[] { 97, '#', (short) 0, 12, (byte) -1 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 35, 0, 12, -1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4243");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 0 1 0" + "'", str12, "-1 0 1 0");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4244");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0" + "'", str10, "0.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4245");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0" + "'", str19, "0.0");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4246");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4##4##4##4##4##4##4##4##4##4#97##00##0#0#0##0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4247");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) '#', (int) ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 55, 106);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4248");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0" + "'", str19, "0.0");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4250");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4251");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10a10a97                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4252");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', (int) (short) 100, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 489, 25);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 106, 29);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4253");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1#-1-110010-1.0true-1-1100a-1a1           a4#4a            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##0aaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ## ## ## ## ## ## ## ## ## #97##00##0#0#0##0aaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4255");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(3866.0d, 0.0d, (double) 971111);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 971111.0d + "'", double3 == 971111.0d);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4256");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1...", (double) 68);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68.0d + "'", double2 == 68.0d);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4257");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(20, 67, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4258");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 8, 55L, (long) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 8L + "'", long3 == 8L);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4259");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("52.0a                                                    -1", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4260");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 90, (-141));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, 821);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a-1.0" + "'", str10, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4261");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 1-1 1-1 1-1 1-1 1-10.0a0.0-1 1-1 1-1 1-1 1-1 1-1", 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4262");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 60, 54);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, 8);
        short short23 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short24 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short25 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 100 + "'", short25 == (short) 100);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4263");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(8.0f, 14.0f, 8.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 8.0f + "'", float3 == 8.0f);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4264");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 92, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 92");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4265");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 60, 54);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, 8);
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 11, 4);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4266");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 1-1 1-1 1-1 1-1 1-10.00.0-1 1-1 1-1 1-1 1-1 1-1   ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4267");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0 10.0 -1.0100.0 10.0 -1.010");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4268");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 1" + "'", str17, "-1 1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4269");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                      ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...                  ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...                  ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4271");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          #-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   # #", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4272");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 262, 45.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 262.0f + "'", float3 == 262.0f);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4273");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 87, 0);
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97#100#10#0#0#102" + "'", str11, "97#100#10#0#0#102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97410041040404102" + "'", str15, "97410041040404102");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 102L + "'", long21 == 102L);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4274");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(63, 113, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4275");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041410040410" + "'", str17, "1041410040410");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4276");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1432, 2572, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2572 + "'", int3 == 2572);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4277");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("##########", 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111 + "'", int2 == 111);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4278");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                     -14-140410");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4279");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(96, 72, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4280");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3, (float) 16, (float) 880L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 880.0f + "'", float3 == 880.0f);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4281");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4282");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!-1-110010-100.0a10.0a-1.0", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4283");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444444444444444444444444444444444444444444...     ...44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4284");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#10#97" + "'", str10, "10#10#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a10a97" + "'", str12, "10a10a97");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10410497" + "'", str15, "10410497");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4285");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1297L, (long) 13, (long) 864);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 13L + "'", long3 == 13L);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4286");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 72, 1100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a10a97" + "'", str7, "10a10a97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4287");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("  44444444  44444444  44444444  44444444 0#1#1#0#1#1", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4288");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100", (double) 57L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.0d + "'", double2 == 57.0d);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4289");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 0, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 0 1 0" + "'", str16, "-1 0 1 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4290");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4291");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 53, 0);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4292");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0452.0" + "'", str13, "-1.0452.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0a52.0" + "'", str16, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0a52.0" + "'", str19, "-1.0a52.0");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4293");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', 100, (int) (byte) 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', 0, 977);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4294");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4295");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4296");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10 1 100 0 10" + "'", str21, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1041410040410" + "'", str23, "1041410040410");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4297");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 102, 0);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.040.0" + "'", str12, "0.040.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0 0.0" + "'", str14, "0.0 0.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0#0.0" + "'", str17, "0.0#0.0");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4298");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                   #A 001 1- 1-EURT 0.1- 01 001 1- 1-#", (float) 101097);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 101097.0f + "'", float2 == 101097.0f);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4299");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0410.04-1.0                                         -1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4300");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3, 49, 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4301");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 0, 185);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4302");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("           ##a#a#a###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a5          .0a52.0          .0a52.0          .0a52.0          .0a52.0          .0a52.0       0#1#1.           ", (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4303");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 17, 3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4304");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100100.0410.04-1.0ru1ru1u--1u-1ru-1trueru1ru1u--1hi!ru1ru1u--1u-1ru-1trueru1ru1u--ru1ru1u--1u-1ru", (double) 101);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.0d + "'", double2 == 101.0d);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4305");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10#1#10...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4306");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a1" + "'", str8, "-1a1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4307");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaa0.25a0.1-aaaaaaaaaaaaaaaaaaa0011-1-eurt0.1-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4308");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-110A5210A5297AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4309");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 49, 22);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0#1#1#10" + "'", str19, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4310");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(169L, 5L, (long) 88);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5L + "'", long3 == 5L);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4311");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(" 10 -1.0 true-1 -1 100 -1 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4312");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) '4', 20);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0410.04-1.0" + "'", str16, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" aaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4314");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10.0a10.0a102.0", (long) 47);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47L + "'", long2 == 47L);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4315");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1041410040410" + "'", str13, "1041410040410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 1 100 0 10" + "'", str15, "10 1 100 0 10");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4316");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-14-141004104-1.04true-14-141004a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1a1", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("52.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0#-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100 1-1 -1 100 10 -1.0 TRUE-1 -1 100 -1.-1 -1 100 10 -1.0 TRUE-1 -1 100 true-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100                                                                                              -1152.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0#-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100 1-1 -1 100 10 -1.0 TRUE-1 -1 100 -1.-1 -1 100 10 -1.0 TRUE-1 -1 100 true-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100                                                                                              -1152.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4318");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#52.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4319");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.Class<?> wildcardClass15 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#52.0" + "'", str11, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4320");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 24, 67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "04141410" + "'", str13, "04141410");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0#1#1#10" + "'", str17, "0#1#1#10");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4321");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4322");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("##1#1-                                                                                             # 001 1- 1-eurt ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4323");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 235, 0);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 1 1 10" + "'", str18, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 10 + "'", short19 == (short) 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("  -1.0 100.0 1.0 -1.0 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1...   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:   -1.0 100.0 1.0 -1.0 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1...    is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4325");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4326");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 859.0f, 1151.0d, (double) 102.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1151.0d + "'", double3 == 1151.0d);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4327");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ################################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10a1a100a0a10" + "'", str20, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10 1 100 0 10" + "'", str22, "10 1 100 0 10");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4328");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 2881L, 40.0f, (float) 103);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 40.0f + "'", float3 == 40.0f);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#######################################################################################################-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######################################################################################################-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4330");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', (int) (short) 1, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', (int) (byte) 1, (int) (short) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04141410" + "'", str8, "04141410");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0a1a1a10" + "'", str16, "0a1a1a10");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4331");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 97, (short) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4332");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 97, (int) (byte) 1);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 1100, 40);
        long long23 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long24 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long25 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 102L + "'", long23 == 102L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 102L + "'", long24 == 102L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4333");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4334");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4336");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("           -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4337");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(67, 12, (int) (short) 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4338");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#52.0" + "'", str11, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0a52.0" + "'", str16, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4339");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4340");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4341");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 95, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4342");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a4#4a100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4343");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 23.0d + "'", double7 == 23.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4344");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4345");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" ", (float) 75);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 75.0f + "'", float2 == 75.0f);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1#-1#0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#-1#0#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4347");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "hi!-1 -1 100 10 -1.0 true-1 -1 104 #4 #4 #4 #4 #4 #4 #4 #4 #");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!-1 -1 100 10 -1.0 true-1 -1 104 #4 #4 #4 #4 #4 #4 #4 #4 #");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a100a0a10" + "'", str14, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 100 0 10" + "'", str16, "10 1 100 0 10");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4348");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 1" + "'", str10, "100 1");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4349");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4351");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("TRUE-1 -1 100 0.0##########################################-1.0A52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4352");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4353");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 32L, 53.0f, (float) 15);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 53.0f + "'", float3 == 53.0f);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4354");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 489, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4355");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 42, 1297);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4356");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaa", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4357");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 859, 52);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#10#97" + "'", str11, "10#10#97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4358");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4359");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(26, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4360");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 52, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4361");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', (int) (short) 100, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 489, 25);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4362");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                            a-a1aaa1aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                             a-a1aaa1aa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4363");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4141410L, (long) 80, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4364");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a52.0" + "'", str13, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0 52.0" + "'", str16, "-1.0 52.0");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4365");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 97, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97#100#10#0#0#102" + "'", str19, "97#100#10#0#0#102");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 102L + "'", long20 == 102L);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4366");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.25a0.1-A   44444444444444444444444444444444##########A    ", (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4367");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a10.0a-1.0" + "'", str13, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0a10.0a-1.0" + "'", str16, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100.0410.04Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa -1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4369");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a1" + "'", str8, "-1a1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4370");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("####################97##00##0#0#0##02");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4371");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0#0.0" + "'", str5, "0.0#0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0 0.0" + "'", str7, "0.0 0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4372");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4373");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1098504.0f, 97.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4374");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97#100#10#0#0#102" + "'", str14, "97#100#10#0#0#102");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a4#4a100.010.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a4#4a100.010.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4376");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1041410040410" + "'", str9, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1041410040410" + "'", str15, "1041410040410");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4377");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 0, 77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4378");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 45, 27);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a100a0a10" + "'", str14, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10#1#100#0#10" + "'", str21, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1041410040410" + "'", str23, "1041410040410");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4379");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("##", 211);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 211 + "'", int2 == 211);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4380");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a97#########################################-1.0a52-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4381");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4382");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-141" + "'", str7, "-141");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1" + "'", str9, "-1a1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4383");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 41, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#1#1#10" + "'", str13, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4384");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "aaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa14001aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa14001aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#1#100#0#10" + "'", str13, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4385");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa#aa#aa#aa#aa#aa#aa#aa#aa#", (float) 859);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 859.0f + "'", float2 == 859.0f);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4386");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4387");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) '#', 27);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 1297, 197);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a1" + "'", str8, "-1a1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4388");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "          .0 52.0          .0 52.0          .0 52.0    100.0A10.0A-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:           .0 52.0          .0 52.0          .0 52.0    100.0A10.0A-1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4389");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("# aa #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4390");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 47, (-1));
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-rr-rrruurrur-r.urTRUE-rr-rrruu52.0                                                     -1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4392");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 1 100 0 10" + "'", str15, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4393");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(24.0d, 101097.0d, (double) 1458);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.0d + "'", double3 == 24.0d);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4394");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 880, 156);
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "04141410" + "'", str13, "04141410");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4395");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4396");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1#-1-1#-1AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4397");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 185.0f, 95.0d, 9.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 185.0d + "'", double3 == 185.0d);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4398");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 100, 22);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a1" + "'", str7, "-1a1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-141" + "'", str14, "-141");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4399");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#52.0-1.0#52.0-1.0#52.0-...###############");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4400");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("35.0 23.0 97.0 52.0", (long) 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 126L + "'", long2 == 126L);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4401");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4402");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 110, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 57, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 57");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4403");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1404140" + "'", str12, "-1404140");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4404");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(68.0f, (float) 0, (float) 50L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a#a#a#a#a-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0#a#a#a#a#a#a#a#a#a#a#a#a#aa#a#a#a#a#a#a#a#a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a#a#a#a#a-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0#a#a#a#a#a#a#a#a#a#a#a#a#aa#a#a#a#a#a#a#a#a# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4406");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa14001aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4407");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 3, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4408");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("       00  0   .0 true       00 0.0##########...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4410");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("25a0.          0.25a0.          0.25a0.          0.25a0.          0.25a0.          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.      \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi...-1a0a1a0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4412");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("########################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4413");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4414");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 2881, (double) 132.0f, 1.0410497104104971E123d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 132.0d + "'", double3 == 132.0d);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4415");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(263, 15, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 263 + "'", int3 == 263);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4416");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1404140#-1#-1#100#10#-1.0#true-1#-1#100#a  44444444  44444444  44444444  44444444 0#1#1#0#1#1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4417");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(29.0d, (double) 971111, 2.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 971111.0d + "'", double3 == 971111.0d);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(".0A52.0   -1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....-1.0#52.0-1...0          .0A52.0          .0A52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A52.0   -1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....-1.0#52.0-1...0          .0A52.0          .0A52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4419");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4420");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4421");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1" + "'", str9, "-1a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 1" + "'", str11, "-1 1");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0                                   97111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0                                   97111111\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4424");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...A52.0-1A...", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4425");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 29, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1041410040410" + "'", str9, "1041410040410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a1a100a0a10" + "'", str15, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4426");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 10041, 25);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4427");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...                                             ...100.0 10.0 -1.0100.0 10.0 -1.010aaaaaaaaaA4#4A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4428");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1a1" + "'", str10, "-1a1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#1" + "'", str12, "-1#1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4429");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a52.0" + "'", str12, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0452.0" + "'", str14, "-1.0452.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0 52.0" + "'", str16, "-1.0 52.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0a52.0" + "'", str18, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0#52.0" + "'", str20, "-1.0#52.0");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4430");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10410497141004-1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4431");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("               35.0a23.0a97.0a52", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4432");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("###.0-1.0A52.0-1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4433");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a0.0" + "'", str8, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0 0.0" + "'", str11, "0.0 0.0");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4434");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a4#a4#a4#a4#a4-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#aa4#a4#a4#a4#a4#a4#a4#a4#a4#10a10a97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4435");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0A52");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4436");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4438");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4439");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 386, (double) 66);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 386.0d + "'", double3 == 386.0d);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4440");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-14-140410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4441");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 66, 26);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.Class<?> wildcardClass19 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 102L + "'", long10 == 102L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97a100a10a0a0a102" + "'", str12, "97a100a10a0a0a102");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 100 10 0 0 102" + "'", str18, "97 100 10 0 0 102");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4442");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("##        ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A# # a                                          44a4aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#-1 -1 100 10 -1.0 TRUE-1 -1 100 A# # a                                          44a4aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4444");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', 169, 55);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (byte) 0, 0);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4445");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A aA aA aA aA aA aA aA aA aA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4447");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0-", (double) 68);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68.0d + "'", double2 == 68.0d);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4448");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 52, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4449");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#############hi!###############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4450");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4451");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a97#########################################-1.0a52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4452");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAA-AAA141004-1AAAAAAAAA-AAA141004-110a5210a5297AAAAAAAAA-AAA141004-1AAAAAAAAA-AAA141004-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4453");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 48L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4454");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4455");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 31, (double) 13L, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4456");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 10 -1.0 TRUE-1 -1 100 A#                                                                   # #", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4457");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (short) 0, (long) 89);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4458");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 10);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 94, 0);
        double double25 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 4, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4459");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 97, (short) -1, (short) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4460");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("197101097101097101097101097101097101097101097101097101097101097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4461");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1404140#-1 -1 100 10 -1.0 true-1 -1 100 a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4462");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 97, (int) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "04141410" + "'", str13, "04141410");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0#1#1#10" + "'", str17, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4463");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 102, (int) (byte) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 113, (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a0.0" + "'", str11, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0a0.0" + "'", str17, "0.0a0.0");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4464");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1" + "'", str12, "100a1");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4465");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a10a97" + "'", str7, "10a10a97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4466");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("##041414");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4467");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA-1 -1 100 10 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4468");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 23L, 107.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4469");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 41, (long) 201, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 201L + "'", long3 == 201L);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4470");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97#100#10#0#0#102" + "'", str11, "97#100#10#0#0#102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97a100a10a0a0a102" + "'", str15, "97a100a10a0a0a102");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4471");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1297L, 871.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1297.0f + "'", float3 == 1297.0f);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4472");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444            -1.0a52.0-1a...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4473");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4474");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#########", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4475");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0" + "'", str19, "0.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0" + "'", str21, "0.0");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4476");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 66, 1452);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0" + "'", str19, "0.0");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4477");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 1143L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1143.0f + "'", float3 == 1143.0f);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4478");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4479");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0a10.0a-1.10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4480");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0410.04-1.0" + "'", str8, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0410.04-1.0" + "'", str10, "100.0410.04-1.0");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4481");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a52.0" + "'", str12, "-1.0a52.0");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4482");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10a-1" + "'", str5, "10a-1");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4483");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', (-1), 2560);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2560 + "'", int3 == 2560);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4484");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-11-11-11-11-11-10.0a0.0-11-11-11-11-11-1100.0 10.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4485");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a0", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4486");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4487");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 97.0f, (double) 408.0f, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4488");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 2560, 201);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a10a97" + "'", str7, "10a10a97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4489");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1, (float) 1089, (float) 110);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1089.0f + "'", float3 == 1089.0f);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4490");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#0#1#0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4491");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4492");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a1a100a0a10" + "'", str10, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4493");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 166, (float) 871, (float) 132);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 871.0f + "'", float3 == 871.0f);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4494");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" true-1 -1 100 a                                                                                             -1a1##-1 -1-1 -1AAAAAAAAAAAAAAAAAAAAAAAA###############################################################", (float) 262);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 262.0f + "'", float2 == 262.0f);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4495");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4497");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 1 1 10" + "'", str18, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 10 + "'", short19 == (short) 10);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4498");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4499");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(864, (int) '4', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 864 + "'", int3 == 864);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test4500");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 1 100 0 10" + "'", str12, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }
}

