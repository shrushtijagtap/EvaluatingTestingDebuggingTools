package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04001");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0#1#10.0a#a#a#a#a#a#a#a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0a52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04002");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa110410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa110410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04003");
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
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04004");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(9L, 65L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04005");
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
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04006");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(7.0d, (double) 61.0f, (double) 1098504L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.0d + "'", double3 == 7.0d);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04007");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04008");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("... #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #...", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04009");
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
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04010");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04011");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 100 10 -1.0 true-1 -1 100 0#1#1#10               aaaaaaaaaa", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04012");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" a #a #a #a #a #a #a #a #a #a # aa#aa#aa#aa#aa#aa#aa#aa#aa#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a #a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04013");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.25A0.1-", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04014");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 107L, (double) 101L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.0d + "'", double3 == 107.0d);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04015");
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
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04016");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04017");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04018");
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
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04019");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 31.0f, (double) 1098504, (double) 102);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.0d + "'", double3 == 31.0d);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04020");
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
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04021");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04022");
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
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04023");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaa aaaa -aaa141004-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04024");
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
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04025");
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
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04026");
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
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04027");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04028");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                             ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.04444444444444 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                             ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.04444444444444 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04031");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 61, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04032");
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
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04033");
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
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04034");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(871L, (long) 1458, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0a5210a5297");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a5210a5297\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04036");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.010a10a0a0a10a10a10a0a0a10a10a10a0a0a10a10a10a0a0a10a10a1", 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04037");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04038");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 49, (double) 23L, (double) 169L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 169.0d + "'", double3 == 169.0d);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04039");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04040");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 -1 100 10 -1.0 true-1 -1 100 4                                                                                             -14");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04041");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 1...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04042");
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
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04043");
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
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04044");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04045");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("  ###-##-eurt# ##-# ####################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04046");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0#1#10.0a#a#a#a#a#a#a#a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04047");
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
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04048");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("     44444444  44444444  44444444  44444444 0#1#1#0#1#1#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04049");
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
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04050");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(88, 5, 1297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1297 + "'", int3 == 1297);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04051");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                          # 001 1- 1-eurt", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04052");
        int[] intArray3 = new int[] { '#', (-141), 821 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, -141, 821]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 821 + "'", int4 == 821);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 821 + "'", int5 == 821);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04053");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                     -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04054");
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
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04056");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1 -1 100 10 -1.0 true-1 -1 100 4                                                                                             -14");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04057");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04058");
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
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04059");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04060");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04061");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("001 1- 1-EURT 0.1- 01 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04062");
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
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04063");
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
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("# A# A# A# A# A# A# A# A# AA# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# A# A# A# A# A# A# A# A# AA# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04065");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".0a52.0-1a...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04066");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444444444444444444444444444444440#1#1#0#1#14444                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04067");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04068");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(98, 33, 867);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04069");
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
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04070");
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
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04071");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a4#4aaaaaaaaaaaAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04072");
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
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04073");
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
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04074");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04075");
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
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04076");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                             -1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04077");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0          ...", 72.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 72.0d + "'", double2 == 72.0d);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04078");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                            A #                                         44444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                            A #                                         44444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04080");
        float[] floatArray3 = new float[] { 101, 10041, 30 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[101.0, 10041.0, 30.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "101.0#10041.0#30.0" + "'", str5, "101.0#10041.0#30.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10041.0f + "'", float6 == 10041.0f);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04081");
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
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04082");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04083");
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
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04084");
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
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04085");
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
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04086");
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
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04087");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 263L, 11.0f, (float) 47);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 263.0f + "'", float3 == 263.0f);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04088");
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
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                    01110-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                    01110-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                    \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04090");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaa               ", (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04091");
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
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04092");
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
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04093");
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
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                        true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04095");
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
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04096");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("    -1.0A52");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04097");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("               aaaaaaaaaa# A# A# A# A# A# A# A# A# A# A");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04098");
        int[] intArray2 = new int[] { 48, 9 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 67, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[48, 9]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04099");
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
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("######################################################.#a52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######################################################.#a52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04101");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#10#1#100#0#10hi!-1 -1 100 10 -1.0 true-1 -1 100a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04102");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04103");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 54, (double) 864L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04105");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 97, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04106");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a  A 001 1- 1-EURT 0.1- 01 001 1- 1-", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04107");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("         10a-1         ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04108");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 10, (float) 871L, (float) 169L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 871.0f + "'", float3 == 871.0f);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04109");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaa                                                    a-a1a.a0aaa52a.a0aaaaaaaaaaaaaaaaaaaaa                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1#1#1", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04110");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(2.0f, (float) 90, 41.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 90.0f + "'", float3 == 90.0f);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04111");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 -1 100 10 -1.0 TRUE-1 -1 100 HI!-1 -1 100 10 -1.0 TRUE-1 -1 100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04112");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 52, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04113");
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
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04114");
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
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04115");
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
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04116");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...a52.0-1a4#0 1 0 1--1.0a##########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04117");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                        2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04118");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1432, 0, 1452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04119");
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
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04120");
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
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04121");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a##a#a####a##a#a####a##a#a###.aa52.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04122");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("TRUE-1 -1 100 0.0##########################################-1.0A52.0", 3224);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3224 + "'", int2 == 3224);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04123");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 96, (float) 33L, (float) 75L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 33.0f + "'", float3 == 33.0f);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04124");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(201, 183, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04125");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04126");
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
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A#A#A#A\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A#A#A#A?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100#1?100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04129");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(455, 17, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04130");
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
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04131");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04132");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444", (long) 45);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 45L + "'", long2 == 45L);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04133");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410", (short) 52);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 52 + "'", short2 == (short) 52);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04134");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((-1404140.0d), (double) 95L, 48.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1404140.0d) + "'", double3 == (-1404140.0d));
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04135");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 83, (long) 179, (long) 136);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 179L + "'", long3 == 179L);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04136");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(51.0f, (float) 55L, 15.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a ###        ##        ##        #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a ###        ##        ##        #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04138");
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
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04139");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(2881L, 162L, (long) 101097);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101097L + "'", long3 == 101097L);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04140");
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
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04141");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A A A A", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04142");
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
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("   44444444  44444444  44444444  44444444 0#1#1#0#1#1100.0 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   44444444  44444444  44444444  44444444 0#1#1#0#1#1100.0 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04144");
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
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04145");
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
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04146");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04147");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1hI!-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04148");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04149");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#0#10hi!-1 -1 100 10 -1.0 tr", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04150");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0#52.0-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0-1.0#52.0-1.0#52.0-1.0#52.0-...", (float) 110L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 110.0f + "'", float2 == 110.0f);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04151");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04152");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".0-1.0a52.0-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1a1a10a1a100a0a10-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1a10a1a100a0a10-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04154");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 2, (double) 16L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04155");
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
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04156");
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
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04157");
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
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#A 001 1- 1-EURT 0.1- 01 001 1- 1-#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04159");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a0a1a0-1.0a5         10a-", (double) 169);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 169.0d + "'", double2 == 169.0d);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04161");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3, 2, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04162");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 52, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04163");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #4444444444444 #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04164");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(22, 4141410, 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04165");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 41.0d, (double) 3.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 41.0d + "'", double3 == 41.0d);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04166");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("141-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04167");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, (long) 1151, (long) 859);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1151L + "'", long3 == 1151L);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04168");
        float[] floatArray5 = new float[] { 1098504L, Float.POSITIVE_INFINITY, 5, 35, 2560 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[1098504.0, Infinity, 5.0, 35.0, 2560.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 5.0f + "'", float7 == 5.0f);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04169");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(52.0d, (double) 47, 23.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.0d + "'", double3 == 23.0d);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("01a0a0a01a001a79# a# a# a# a# a# a# a# a# a# a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a0a0a01a001a79# a# a# a# a# a# a# a# a# a# a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04171");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a # #A 001 1- 1-EURT 0.1- 01 001 1- 1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a # #A 001 1- 1-EURT 0.1- 01 001 1- 1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04174");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A1", (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04175");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.0", 188);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 188 + "'", int2 == 188);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04176");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04177");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".0a52.0 .0a52.0 .0a52.0 .0a52.0 .0a52.0 0#1#1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04178");
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
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04179");
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
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04180");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04181");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 tr...", 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04182");
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
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04184");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04185");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##02-1.052.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04186");
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
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04187");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...  ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...  ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04188");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a 100 10 -1.0 true-1 -1 100 a# #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04189");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("# a# a# a# a# a# a# a# a# a# aa", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04190");
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
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04191");
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
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04192");
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
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04193");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 86, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04194");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("true-1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04195");
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
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04196");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3224, (long) 126, (long) 14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04197");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a52.0aaaaaaaaaaaaaaaaaaaa", (double) 156L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 156.0d + "'", double2 == 156.0d);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04198");
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
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04199");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0          ...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04200");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # #                                                                                              -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04201");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04202");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -141, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04203");
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
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04204");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 18L, (double) 104.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.0d + "'", double3 == 104.0d);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04205");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaa52a52a52a52a52a52a52a52a52a52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04206");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04207");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0                                   97111111");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04208");
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
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04209");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!-1 -1 100 10 -100.0a10.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!-1 -1 100 10 -100.0a10.0a-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04211");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04212");
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
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04213");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#aaa a#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04214");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("    -1.0A52", (float) 51);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 51.0f + "'", float2 == 51.0f);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04215");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                               44a4aaaaaaaaaaaaaaaaaaaaaaa", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04216");
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
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...                                             ...100.0 10.0 -1.0100.0 10.0 -1.010aaaaaaaaaA4#4A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ...                                             ...100.0 10.0 -1.0100.0 10.0 -1.010aaaaaaaaaA4#4A is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04218");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43L + "'", long2 == 43L);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04219");
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
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04220");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0 10.0 -1.0100.0 10.0 -1.010#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04221");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 98, (double) 1432, 41.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1432.0d + "'", double3 == 1432.0d);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04222");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04223");
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
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04224");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" 10 -1.0 true-1 -1 100aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04225");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04226");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 31L, 4141410.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04227");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("# A# A# A# A# A# A# A# A# A# A.0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" A# A#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04228");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1297L, 0.0d, 4.4444444444444445E51d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04229");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("35.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.035.0 23.0 97.0 52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04230");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(60L, (long) 140, (long) 87);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04231");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04232");
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
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04233");
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
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04234");
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
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04235");
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
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100#1#1#0#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100 1 1 100#1#1#0#1#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#############################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04238");
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
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04239");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 52, (short) (byte) 100, (short) -141);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04240");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(197, (int) (byte) 100, 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04241");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(52, 8, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04242");
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
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04243");
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
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04244");
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
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04245");
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
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04246");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4##4##4##4##4##4##4##4##4##4#97##00##0#0#0##0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04247");
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
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04248");
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
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04250");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04251");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10a10a97                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04252");
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
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04253");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1#-1-110010-1.0true-1-1100a-1a1           a4#4a            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##0aaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ## ## ## ## ## ## ## ## ## #97##00##0#0#0##0aaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04255");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(3866.0d, 0.0d, (double) 971111);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 971111.0d + "'", double3 == 971111.0d);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04256");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1...", (double) 68);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68.0d + "'", double2 == 68.0d);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04257");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(20, 67, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04258");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 8, 55L, (long) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 8L + "'", long3 == 8L);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04259");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("52.0a                                                    -1", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04260");
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
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04261");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 1-1 1-1 1-1 1-1 1-10.0a0.0-1 1-1 1-1 1-1 1-1 1-1", 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04262");
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
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04263");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(8.0f, 14.0f, 8.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 8.0f + "'", float3 == 8.0f);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04264");
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
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04265");
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
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04266");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 1-1 1-1 1-1 1-1 1-10.00.0-1 1-1 1-1 1-1 1-1 1-1   ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04267");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0 10.0 -1.0100.0 10.0 -1.010");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04268");
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
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04269");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                      ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...                  ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...                  ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04271");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          #-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   # #", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04272");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 262, 45.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 262.0f + "'", float3 == 262.0f);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04273");
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
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04274");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(63, 113, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04275");
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
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04276");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1432, 2572, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2572 + "'", int3 == 2572);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04277");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("##########", 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111 + "'", int2 == 111);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04278");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                     -14-140410");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04279");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(96, 72, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04280");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3, (float) 16, (float) 880L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 880.0f + "'", float3 == 880.0f);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04281");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04282");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!-1-110010-100.0a10.0a-1.0", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04283");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444444444444444444444444444444444444444444...     ...44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04284");
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
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04285");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1297L, (long) 13, (long) 864);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 13L + "'", long3 == 13L);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04286");
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
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04287");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("  44444444  44444444  44444444  44444444 0#1#1#0#1#1", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04288");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100", (double) 57L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.0d + "'", double2 == 57.0d);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04289");
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
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04290");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04291");
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
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04292");
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
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04293");
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
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04294");
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
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04295");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04296");
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
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04297");
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
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04298");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                   #A 001 1- 1-EURT 0.1- 01 001 1- 1-#", (float) 101097);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 101097.0f + "'", float2 == 101097.0f);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04299");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0410.04-1.0                                         -1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04300");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3, 49, 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04301");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 0, 185);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04302");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("           ##a#a#a###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a5          .0a52.0          .0a52.0          .0a52.0          .0a52.0          .0a52.0       0#1#1.           ", (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04303");
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
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04304");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100100.0410.04-1.0ru1ru1u--1u-1ru-1trueru1ru1u--1hi!ru1ru1u--1u-1ru-1trueru1ru1u--ru1ru1u--1u-1ru", (double) 101);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.0d + "'", double2 == 101.0d);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04305");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10#1#10...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04306");
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
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04307");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaa0.25a0.1-aaaaaaaaaaaaaaaaaaa0011-1-eurt0.1-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04308");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-110A5210A5297AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04309");
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
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04310");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(169L, 5L, (long) 88);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5L + "'", long3 == 5L);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04311");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(" 10 -1.0 true-1 -1 100 -1 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04312");
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
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" aaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04314");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10.0a10.0a102.0", (long) 47);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47L + "'", long2 == 47L);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04315");
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
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04316");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-14-141004104-1.04true-14-141004a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1a1", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("52.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0#-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100 1-1 -1 100 10 -1.0 TRUE-1 -1 100 -1.-1 -1 100 10 -1.0 TRUE-1 -1 100 true-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100                                                                                              -1152.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0#-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100 1-1 -1 100 10 -1.0 TRUE-1 -1 100 -1.-1 -1 100 10 -1.0 TRUE-1 -1 100 true-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100                                                                                              -1152.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04318");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#52.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04319");
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
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04320");
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
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04321");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04322");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("##1#1-                                                                                             # 001 1- 1-eurt ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04323");
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
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("  -1.0 100.0 1.0 -1.0 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1...   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:   -1.0 100.0 1.0 -1.0 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1...    is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04325");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04326");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 859.0f, 1151.0d, (double) 102.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1151.0d + "'", double3 == 1151.0d);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04327");
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
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04328");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 2881L, 40.0f, (float) 103);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 40.0f + "'", float3 == 40.0f);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#######################################################################################################-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######################################################################################################-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04330");
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
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04331");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 97, (short) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04332");
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
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04333");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04334");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###  -#A#AAAAAAAAAAAAAAAAAAAAAAAA####################################################AAAAAAAAAAAAAAAAAAAAAAAA#################################### #-## #TRUE-##-###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04336");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("           -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04337");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(67, 12, (int) (short) 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04338");
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
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04339");
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
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04340");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04341");
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
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04342");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a4#4a100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04343");
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
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04344");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04345");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" ", (float) 75);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 75.0f + "'", float2 == 75.0f);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1#-1#0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#-1#0#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04347");
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
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04348");
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
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04349");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 100 . 00 1 1 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04351");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("TRUE-1 -1 100 0.0##########################################-1.0A52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04352");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04353");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 32L, 53.0f, (float) 15);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 53.0f + "'", float3 == 53.0f);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04354");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 489, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04355");
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
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04356");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaa", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04357");
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
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04358");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         #-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1                         ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04359");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(26, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04360");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 52, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04361");
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
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04362");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                            a-a1aaa1aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                             a-a1aaa1aa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04363");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4141410L, (long) 80, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04364");
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
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04365");
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
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04366");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.25a0.1-A   44444444444444444444444444444444##########A    ", (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04367");
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
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100.0410.04Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa -1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04369");
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
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04370");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("####################97##00##0#0#0##02");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04371");
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
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04372");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04373");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1098504.0f, 97.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04374");
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
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a4#4a100.010.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a4#4a100.010.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04376");
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
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04377");
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
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04378");
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
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04379");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("##", 211);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 211 + "'", int2 == 211);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04380");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a97#########################################-1.0a52-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04381");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04382");
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
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04383");
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
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04384");
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
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04385");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa#aa#aa#aa#aa#aa#aa#aa#aa#", (float) 859);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 859.0f + "'", float2 == 859.0f);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04386");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 001 1- 1-EURT 0.1- 01 ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04387");
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
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04388");
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
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04389");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("# aa #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04390");
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
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-rr-rrruurrur-r.urTRUE-rr-rrruu52.0                                                     -1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04392");
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
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04393");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(24.0d, 101097.0d, (double) 1458);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.0d + "'", double3 == 24.0d);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04394");
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
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04395");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000-10-101000100-1100true-10-101000");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04396");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1#-1-1#-1AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04397");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 185.0f, 95.0d, 9.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 185.0d + "'", double3 == 185.0d);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04398");
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
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04399");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#52.0-1.0#52.0-1.0#52.0-...###############");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04400");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("35.0 23.0 97.0 52.0", (long) 126);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 126L + "'", long2 == 126L);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04401");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04402");
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
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04403");
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
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04404");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(68.0f, (float) 0, (float) 50L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a#a#a#a#a-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0#a#a#a#a#a#a#a#a#a#a#a#a#aa#a#a#a#a#a#a#a#a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a#a#a#a#a-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0#a#a#a#a#a#a#a#a#a#a#a#a#aa#a#a#a#a#a#a#a#a# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04406");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa14001aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04407");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 3, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04408");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("       00  0   .0 true       00 0.0##########...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04410");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("25a0.          0.25a0.          0.25a0.          0.25a0.          0.25a0.          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.      \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi...-1a0a1a0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04412");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("########################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04413");
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
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04414");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 2881, (double) 132.0f, 1.0410497104104971E123d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 132.0d + "'", double3 == 132.0d);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04415");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(263, 15, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 263 + "'", int3 == 263);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04416");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1404140#-1#-1#100#10#-1.0#true-1#-1#100#a  44444444  44444444  44444444  44444444 0#1#1#0#1#1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04417");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(29.0d, (double) 971111, 2.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 971111.0d + "'", double3 == 971111.0d);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(".0A52.0   -1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....-1.0#52.0-1...0          .0A52.0          .0A52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A52.0   -1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....-1.0#52.0-1...0          .0A52.0          .0A52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04419");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04420");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04421");
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
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0                                   97111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0                                   97111111\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04424");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...A52.0-1A...", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04425");
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
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04426");
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
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04427");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...                                             ...100.0 10.0 -1.0100.0 10.0 -1.010aaaaaaaaaA4#4A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04428");
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
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04429");
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
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04430");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10410497141004-1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04431");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("               35.0a23.0a97.0a52", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04432");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("###.0-1.0A52.0-1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04433");
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
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04434");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a4#a4#a4#a4#a4-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#aa4#a4#a4#a4#a4#a4#a4#a4#a4#10a10a97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04435");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0A52");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04436");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04438");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04439");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 386, (double) 66);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 386.0d + "'", double3 == 386.0d);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04440");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-14-140410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004100410041004");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04441");
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
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04442");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("##        ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A# # a                                          44a4aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#-1 -1 100 10 -1.0 TRUE-1 -1 100 A# # a                                          44a4aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04444");
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
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04445");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A aA aA aA aA aA aA aA aA aA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0A.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04447");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0-", (double) 68);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 68.0d + "'", double2 == 68.0d);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04448");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 52, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04449");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#############hi!###############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04450");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04451");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a97#########################################-1.0a52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04452");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAA-AAA141004-1AAAAAAAAA-AAA141004-110a5210a5297AAAAAAAAA-AAA141004-1AAAAAAAAA-AAA141004-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04453");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 48L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04454");
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
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04455");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 31, (double) 13L, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04456");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 10 -1.0 TRUE-1 -1 100 A#                                                                   # #", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04457");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (short) 0, (long) 89);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04458");
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
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04459");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 97, (short) -1, (short) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04460");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("197101097101097101097101097101097101097101097101097101097101097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04461");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1404140#-1 -1 100 10 -1.0 true-1 -1 100 a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04462");
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
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04463");
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
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04464");
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
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04465");
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
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04466");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("##041414");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04467");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA-1 -1 100 10 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04468");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 23L, 107.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04469");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 41, (long) 201, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 201L + "'", long3 == 201L);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04470");
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
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04471");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1297L, 871.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1297.0f + "'", float3 == 1297.0f);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04472");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444            -1.0a52.0-1a...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04473");
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
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04474");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#########", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04475");
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
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04476");
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
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04477");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 1143L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1143.0f + "'", float3 == 1143.0f);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04478");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04479");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0a10.0a-1.10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04480");
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
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04481");
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
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04482");
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
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04483");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', (-1), 2560);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2560 + "'", int3 == 2560);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04484");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-11-11-11-11-11-10.0a0.0-11-11-11-11-11-1100.0 10.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04485");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a0", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04486");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04487");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 97.0f, (double) 408.0f, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04488");
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
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04489");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1, (float) 1089, (float) 110);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1089.0f + "'", float3 == 1089.0f);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04490");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#0#1#0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04491");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04492");
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
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04493");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 166, (float) 871, (float) 132);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 871.0f + "'", float3 == 871.0f);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04494");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" true-1 -1 100 a                                                                                             -1a1##-1 -1-1 -1AAAAAAAAAAAAAAAAAAAAAAAA###############################################################", (float) 262);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 262.0f + "'", float2 == 262.0f);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04495");
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
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04497");
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
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04498");
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
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04499");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(864, (int) '4', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 864 + "'", int3 == 864);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04500");
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

