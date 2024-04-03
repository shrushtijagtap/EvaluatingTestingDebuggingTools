package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("143541004\raaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1#35#100#10#-1#0\r                                               aa4a4                                                52.010.0-1.0-1.010.052.00#-", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("010#-1#0A001A001A1A1-A001tring;c", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "!4ih4!4ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: !4ih4!4ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10 1 100" + "'", str7, "10 1 100");
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(30.0d, (double) 30, (double) 7);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.0d + "'", double3 == 7.0d);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 90L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1-#0        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-#0        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 79, 97.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                       100a1a-1a100", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                A4A                                               ", (double) 29.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.0d + "'", double2 == 29.0d);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 1, (long) 97, 53L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str19, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str21, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str23, "1.0a2.0a10.0a16.0a3.0a2.0");
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(16L, (long) 104100, (long) 140);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 16L + "'", long3 == 16L);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3 35" + "'", str13, "3 35");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("52.0410.04-1.04-1.0410.0452.000a1a-1a#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("52.010.0-1.0-1.010.052.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(301, 271, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 301 + "'", int3 == 301);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("00  0 0\r1#35#100#10#-1#01#35#...                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...           ...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("\ra#4#4                                             ...10#-1#0           0#-1#0                                             ...10#-1#0   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?a#4#4                                             ...10#-1#0           0#-1#0                                             ...10#-1#0   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("001a1-a1a001a001a01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a44class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [c                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi4!4hi4!                        ", (double) 271);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 271.0d + "'", double2 == 271.0d);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(23, 18, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 174, (float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 174.0f + "'", float3 == 174.0f);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, 32.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1A10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi! aa aaaaaa##aaa#aa#aa#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! aa aaaaaa##aaa#aa#aa#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("001a1-a1a001a001a01");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 140L, 35.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10a100a100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a100a100a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1aa4a435.", (double) 21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.0d + "'", double2 == 21.0d);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("ii  01 0...1..00.00.  0 00  0 00  0 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.Class<?> wildcardClass23 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100#-1" + "'", str21, "100#-1");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 100 + "'", byte22 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(".1.010.0-1.1.143541004104-1401.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3 35" + "'", str8, "3 35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("971#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.011#35#100#10#-1#0HI! 10 100.001#35#100#10#-1#0HI! 10 aaaaaaaaaaaaaaaa", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1 35 100 10 -1 0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                   0#-1            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("00  0 0\r");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (short) 100, (int) ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 100, 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("00a4444aaa44444a4444aa44444a4444                                       44a4444aa444444a4444aaa44444a4444aa44444a4444\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a4444aaa44444a4444aa44444a4444                                       44a4444aa444444a4444aaa44444a4444aa44444a4444?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 16, (long) (byte) 10, (long) 17);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 17L + "'", long3 == 17L);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("3 35aa4a4hi!hi!aa4a4 aa4a44aa4a4\r", 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("\r                                               aa4a4                                                \r                                               aa4a4                                                \r                                               aa4a4                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ?                                               aa4a4                                                ?                                               aa4a4                                                ?                                               aa4a4                                                 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HI!10100.01435410044444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 32L, (float) 125);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 125.0f + "'", float3 == 125.0f);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 35, (long) 49);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 49L + "'", long3 == 49L);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("001a1-a1a001a001a01", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), 37, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10a-1                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("041-401400145341");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 37, 32.0f, (float) 24L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 37.0f + "'", float3 == 37.0f);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa4a4                                                52.010.0-1.0-1.010.052.0", (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("52.0410.04-1.04-1.0410.0452.000a4444a52.0410.04-1.04");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0000##.#4###.#4##.#4#.#", 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0410.04-1.0" + "'", str11, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), 52L, (long) 27);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0a100.0a-1.0a0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10" + "'", str13, "-1a10");
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 9, 83.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 83.0f + "'", float3 == 83.0f);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 24.0f, (double) 32, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.0d + "'", double3 == 24.0d);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 81, 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 32, (int) (byte) 1);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10" + "'", str11, "-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 18, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3#35" + "'", str11, "3#35");
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0#1-#01...0 10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("[Ljava.lang.String; [Ljava.lang.String;class [Ljava.lang.String;class 1041001041001041001041.010.0-1.0tring;clas", 109.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 109.0f + "'", float2 == 109.0f);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 53, 0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("HI4!4HI4!                        ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(23.0d, (double) 824, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 824.0d + "'", double3 == 824.0d);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4                                                A4A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1 0...10#-1#0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0#-1#01#35#10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 18, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0a100.0a-1.0a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                  1#01#01#0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#10" + "'", str7, "-1#10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1410" + "'", str10, "-1410");
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 7, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("  -1 10  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 45.0      #1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (byte) 100, (int) (short) 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#0hi!10100.0-1A10A100A97A97A35-1A10A10", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 81, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(43, 0, 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 25, (double) 43L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444444444444444 -.0                               444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1#10#100#97#97#35" + "'", str13, "-1#10#100#97#97#35");
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        float[] floatArray1 = new float[] { 35 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 0, (int) (byte) 0);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 83, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 83");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[35.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35.0" + "'", str3, "35.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1.01A0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0#1-#01...0 10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1), (float) 30L, (float) 824L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 824.0f + "'", float3 == 824.0f);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("HI! 10 100.0143541004");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 7.0f, (double) 824.0f, (double) 16.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 824.0d + "'", double3 == 824.0d);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AA4A4a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("97ii  0 000.00.  0 00  0 00  0 0\r                                                              ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 0, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 21, 140.0f, 44.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 21.0f + "'", float3 == 21.0f);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) 24.0f, (double) 90L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.0d + "'", double3 == 90.0d);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("00aa4a4hi!hi!aa4a4 aa4a44aa4a4", 113);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113 + "'", int2 == 113);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 8, 1878);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aa4a4hi!hi!aa4a4 aa4a44aa4a4\r");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1a0" + "'", str6, "1a0");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 0" + "'", str10, "1 0");
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) (byte) -1, (long) 14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1#35#100#10#-1#0HI!10100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 110, (long) 37, (long) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 110L + "'", long3 == 110L);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) -1, 391, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 391 + "'", int3 == 391);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" a4a4a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a4a4a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 3, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 52, 13);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 130, 17);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 8, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("143541004\raaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("101010101010101010101010101010101010101010101010101010101010101044 4 4#4#4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"101010101010101010101010101010101010101010101010101010101010101044 4 4#4#4#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(107, 14, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(6.0f, 39.0f, (float) 31L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.0f + "'", float3 == 6.0f);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("cl9ss [Lj9v9.l9ng.String;cl9ss [Lj9v9.l9ng.String;cl9ss [Lj9v9.l9ng.String;cl9ss [C                 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1041001041001041001041.010.0-1.0", (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444", 30.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444E10d + "'", double2 == 4.4444444444E10d);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 23L, (float) (-1L), 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("143541004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(30.0f, 1.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                  16.0A1.0001a1-a1a001a001a010#-1#0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 301, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 40, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 40");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                         !ih    ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44 4 4#4#4#4            -1A10A#-1A10A#-1A10A#-1-1.041.040.0           a4a                                                              aa4a4                                                ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(824L, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, 0L, 90L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#35");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 44L, (float) 130, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 130.0f + "'", float3 == 130.0f);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("97A100A1A0A100A34a4 aa4a44aa4a4\r16.0A1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) (byte) 1, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 33, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str17, "52.0a10.0a-1.0a-1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("16.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.3#35");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4aa4a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4aa4a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) '4', (double) 16.0f, (double) 6L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.0d + "'", double3 == 6.0d);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("A100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4a a a#a#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, 0.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("##########################################################################################################################################################################################################################################################################################################0#-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 113, (-1));
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 571, 24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', 53L, (long) 113);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 113L + "'", long3 == 113L);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 39, 9);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        double[] doubleArray3 = new double[] { (short) -1, (short) 100, '4' };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 3, (int) (byte) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 47, 9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) 'a', 33);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 52.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(23.0d, (double) 30.0f, 21.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 49, (double) 52, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1, (float) 130, (float) 26);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 110, (float) 3, 90.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "97 100 1 0 100 3");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 97 100 1 0 100 3");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AA4A44-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ih # -#  #   #53#                                                        ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 130, (float) '#', 49.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "44444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("###################################################################################################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1 35 100 10 -1 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(301, 30, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 0.0f, 107.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 107.0f + "'", float3 == 107.0f);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(83, (int) 'a', 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 125 + "'", int3 == 125);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0a10.0a-1.0" + "'", str14, "1.0a10.0a-1.0");
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a100a100a1a-1a100" + "'", str14, "10a100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("97ii  0 000.00.  0 00  0 00  0 0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44 4 4#4#                                           ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 23, 0);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 14, 6);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1A1A1A97A97A1#hia-1A1A1A97A97-1#10#100#97#97#35-1A1A1A97A97A1#hia-1A1A1A97A97A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(43, 29, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 49, (float) 3L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1L), (double) 43, (double) 17.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.0d + "'", double3 == 43.0d);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) 'a', 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0a100.0a-1.0a0.0" + "'", str11, "-1.0a100.0a-1.0a0.0");
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 824L, (double) 13, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 824.0d + "'", double3 == 824.0d);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1041001041001041001041.010.0-1.0TRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;                                                    A-", (float) 140);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 140.0f + "'", float2 == 140.0f);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 11111.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11111.0d + "'", double3 == 11111.0d);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), 11111.0f, (float) 301L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#0HI!10100.", (double) 125.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 125.0d + "'", double2 == 125.0d);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0A10.0A-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(40, 4, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                       100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                       100a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(140.0f, (float) 1, (float) 140L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aa004a4aa!ih!ih4a4aa4a4aa4a4...#53#10#1-#01#001#53#100000#1-#01#001#53#1!aiha!aih                       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16.0 1.0" + "'", str7, "16.0 1.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("!IH!IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 1L, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h1 0...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0                                             ...10#-1#0                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10" + "'", str11, "-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi! 10 100. #4#4###############################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10 100. #4#4###############################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10#-1#01#35#100#10#-1#01#35#100#10#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("97ii0000.00.000000097ii0000.00.000000097ii0000.00.000000097ii0000.00.000000097ii0000.00.000000097ii0-1.0a1.0a0.0", (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("###################################################################################################", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 31, 44.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44.0d + "'", double3 == 44.0d);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0a0.0", 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(32L, (long) 95, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "hi! 10 100.01#35#100#10#-1#0                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi! 10 100.01#35#100#10#-1#0                                                                        ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.01A0.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 130, (double) '4', (double) 16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.0d + "'", double3 == 16.0d);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                         #35#   #  #- # hi!     .", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 140L, 824.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 824.0d + "'", double3 == 824.0d);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 64, 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 130 + "'", int3 == 130);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r", (float) 107);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 107.0f + "'", float2 == 107.0f);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                         HI! 10 100.0143541004                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(10.0d, 23.0d, (double) 6L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.0d + "'", double3 == 6.0d);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ", (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("class [Cclass [Ljava.la");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [Cclass [Ljava.la\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1 35 100 10 -1 0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("16.0a1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(271, 95, 405);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 405 + "'", int3 == 405);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) 'a', 1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.04100.04-1.040.0" + "'", str14, "-1.04100.04-1.040.0");
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hI!HI is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                     4444444444", (long) 83);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("3#35", 4.444444444444444E129d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444444E129d + "'", double2 == 4.444444444444444E129d);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 301, 1878);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 301");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h10...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0...10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (short) 0, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 16.0f + "'", float6 == 16.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16.0#1.0" + "'", str8, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "16.0#1.0" + "'", str10, "16.0#1.0");
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0#1-#01...0 10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53hi!10100.hi!hi!", 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(110, 7, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 110 + "'", int3 == 110);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10, (double) 35, (double) 271);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 271.0d + "'", double3 == 271.0d);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(25, 95, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".1-0.010.1010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0a001a001a1a1-a1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 4, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 1, (double) 110, 104100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104100.0d + "'", double3 == 104100.0d);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a1a-1a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.Class<?> wildcardClass20 = byteArray2.getClass();
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        java.lang.Class<?> wildcardClass24 = strArray23.getClass();
        short[] shortArray31 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short32 = org.apache.commons.lang3.math.NumberUtils.min(shortArray31);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join(shortArray31, '4', (int) (short) 100, (-1));
        short short37 = org.apache.commons.lang3.math.NumberUtils.max(shortArray31);
        java.lang.Class<?> wildcardClass38 = shortArray31.getClass();
        java.lang.String[] strArray42 = org.apache.commons.lang3.StringUtils.split("100a1a-1a100", '4');
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 ", strArray42, strArray45);
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray45, "00aa4a4hi!hi!aa4a4aa4a44aa4a4");
        java.lang.Class<?> wildcardClass49 = strArray45.getClass();
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.join(byteArray52, '#');
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join(byteArray52, ' ', (int) (byte) 1, 0);
        byte byte59 = org.apache.commons.lang3.math.NumberUtils.max(byteArray52);
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join(byteArray52, 'a');
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join(byteArray52, '4');
        byte byte64 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.join(byteArray52, '4');
        java.lang.String str68 = org.apache.commons.lang3.StringUtils.join(byteArray52, 'a');
        byte byte69 = org.apache.commons.lang3.math.NumberUtils.max(byteArray52);
        java.lang.Class<?> wildcardClass70 = byteArray52.getClass();
        java.lang.reflect.Type[] typeArray71 = new java.lang.reflect.Type[] { wildcardClass20, wildcardClass24, wildcardClass38, wildcardClass49, wildcardClass70 };
        java.lang.reflect.Type[][] typeArray72 = new java.lang.reflect.Type[][] { typeArray71 };
        java.lang.String str73 = org.apache.commons.lang3.StringUtils.join(typeArray72);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "140" + "'", str16, "140");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1a0" + "'", str18, "1a0");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short32 + "' != '" + (short) -1 + "'", short32 == (short) -1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 1 + "'", short37 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 " + "'", str46, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 ");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str48, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1#0" + "'", str54, "1#0");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 1 + "'", byte59 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1a0" + "'", str61, "1a0");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "140" + "'", str63, "140");
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 0 + "'", byte64 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "140" + "'", str66, "140");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1a0" + "'", str68, "1a0");
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 1 + "'", byte69 == (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray72);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4, (double) 3L, (double) 104100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0d + "'", double3 == 3.0d);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("00aa4a4hi!hi!aa4a4aa4a44aa4a4", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 0, 140);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".1.010.0-1.1.143541004104-1401.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1.010.0-1.1.143541004104-1401.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 405, 0.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 405.0f + "'", float3 == 405.0f);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!10100.01#35#100#10#-1#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 17, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) (short) 10, 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', 27, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.04100.04-1.040.0" + "'", str11, "-1.04100.04-1.040.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("##35##11##1####1\r33333333333333333333333333333333333333333333333aaaaa33333333333333333333333333333333333333333333333352-1#1-1##-1##-1#1-152-11##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##35##11##1####1?33333333333333333333333333333333333333333333333aaaaa33333333333333333333333333333333333333333333333352-1#1-1##-1##-1#1-152-11##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 16.0f + "'", float10 == 16.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100 -1", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(64, 83, 824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1a10a100a97a97a35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a10a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 35, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 18, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (short) -1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 59, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 0" + "'", str10, "1 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1a0" + "'", str17, "1a0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1a0" + "'", str19, "1a0");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" #", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 10, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0410.04-1.0" + "'", str14, "1.0410.04-1.0");
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                   AA4A4                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                   AA4A4                                                   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("971#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.011#35#100#10#-1#0HI! 10 100.001#35#100#10#-1#0HI! 10 aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(" .     !ih # -#  #   #53# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".     !ih # -#  #   #53#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 174, 109);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("###143541004104-14# # ######143541004104-14# # ######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 107, 11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, ".1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 0" + "'", str18, "1 0");
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100aa4a4hi!hi!aa4a4aa4a44aa4a4\r", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(39, 109, 140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39 + "'", int3 == 39);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + Float.POSITIVE_INFINITY + "'", float1 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 53, 301L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 301L + "'", long3 == 301L);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 2, 40L, 8L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#35#444#44#-4#4hi!44444.", (long) 571);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 571L + "'", long2 == 571L);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" #35#   #  #- # hi!     . lass [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(6.0d, (double) 104100L, (double) 125.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104100.0d + "'", double3 == 104100.0d);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(43L, 0L, (long) 7);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 43L + "'", long3 == 43L);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str14, "1.042.0410.0416.043.042.0");
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("52.44444444444444444444444444444444444144444444444444444444444444444444444.444444444444444444444444444444444441.444444444444444444444444444444444441.44444444444444444444444444444444444144444444444444444444444444444444444.4444444444444444444444444444444444452.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ih # -#  #5.0      #53#5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0        ", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444!4ih4!4ih44444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4!4ih4!4i\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 40, 35L, (long) 28);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 40L + "'", long3 == 40L);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                             1#35#100#10#-1#0HI!10100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                             1#35#100#10#-1#0HI!10100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 44, 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "53 3");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 53 3");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1aa4a435.0                               HI!HI!", (float) 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, 271, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 64, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("     001a1-a1a001a001a010#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"001a1-a1a001a001a010#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444        0#-1#", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 33, (float) 90, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100a-1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("40", 24L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hI!HI");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16.0a1.0" + "'", str7, "16.0a1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16.041.0" + "'", str13, "16.041.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 16.0f + "'", float14 == 16.0f);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("40-1aa4a4hi100a100a1a-1a100", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10");
        java.math.BigInteger bigInteger3 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10");
        java.math.BigInteger bigInteger5 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-14104100497497435");
        java.math.BigInteger bigInteger7 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10");
        java.math.BigInteger bigInteger9 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger11 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray12 = new java.math.BigInteger[] { bigInteger1, bigInteger3, bigInteger5, bigInteger7, bigInteger9, bigInteger11 };
        java.math.BigInteger bigInteger14 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10");
        java.math.BigInteger bigInteger16 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10");
        java.math.BigInteger bigInteger18 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-14104100497497435");
        java.math.BigInteger bigInteger20 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10");
        java.math.BigInteger bigInteger22 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger24 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray25 = new java.math.BigInteger[] { bigInteger14, bigInteger16, bigInteger18, bigInteger20, bigInteger22, bigInteger24 };
        java.math.BigInteger[][] bigIntegerArray26 = new java.math.BigInteger[][] { bigIntegerArray12, bigIntegerArray25 };
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray26);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigIntegerArray12);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigIntegerArray25);
        org.junit.Assert.assertNotNull(bigIntegerArray26);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(4.4444444444E10d, (double) 174, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4100.04-1.040.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 40, (double) 103, 301.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 40.0d + "'", double3 == 40.0d);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.0d + "'", double2 == 21.0d);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("##35##11##1####1\r33333333333333333333333333333333333333333333333aaaaa33333333333333333333333333333333333333333333333352-1#1-1##-1##-1#1-152-11##", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("00a1a-1a#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a1a-1a#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI! 10 100.0143541004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI! 10 100.0143541004\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 0, 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(301.0d, (double) 130, (double) 125);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 301.0d + "'", double3 == 301.0d);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(103, 95, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######1#35#100#10#-1#0hi!10100.0-1A10A100A97A97A35-1A10A10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######1#35#100#10#-1#0hi!10100.0-1A10A100A97A97A35-1A10A10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(".1.010.0-1.1.010.0-1.1.1.0 10.0 -1.0i!hi!aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: .1.010.0-1.1.010.0-1.1.1.0 10.0 -1.0i!hi!aaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 174, 37.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 37.0f + "'", float3 == 37.0f);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(2, 26, 571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 571 + "'", int3 == 571);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) -1, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0 10.0 -1.0" + "'", str8, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 18, (long) '#', 11111L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11111L + "'", long3 == 11111L);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(35.0d, (double) (short) 100, (double) 47.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) 'a', 1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (long) 1878, (long) 53);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1878L + "'", long3 == 1878L);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', 0.0d, (double) 42);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 42.0d + "'", double3 == 42.0d);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) (short) 10, 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.04100.04-1.040.0" + "'", str11, "-1.04100.04-1.040.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a100.0a-1.0a0.0" + "'", str13, "-1.0a100.0a-1.0a0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.04100.04-1.040.0" + "'", str15, "-1.04100.04-1.040.0");
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 104100, (float) 28, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0#2.0#10.0#16.0#3.0#2.01#0a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("tring;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("        0#-1#0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#1#100" + "'", str7, "10#1#100");
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("        0#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1#0.1-0.010.11#0.1-0.010.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 39, (int) (byte) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 97, 125);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 571, (float) 49);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 571.0f + "'", float3 == 571.0f);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("--10110.10010a1010010.10010a10-10110.10010a10010.1001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("###################################################################################################hi100a100a1a-1a100hi100a100010#-1#0a001a001a1a1-a001hi100a100a1a-1a100hi100a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4                                                A4A                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4                                                A4A                                               \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 37, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("   !IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       !IH       !IH        !IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       !IH       !IH     ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35-1410hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("... a-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 174, 0.0f, (float) 20);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 37, (float) 3L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 271, 571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1aa4a435.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("16.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0 10.0 -1.0" + "'", str10, "1.0 10.0 -1.0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI! 10 100.Ii  0 000.00.  0 00  0 00  0 0\r", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 23, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 14, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 81, Float.POSITIVE_INFINITY, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 81.0f + "'", float3 == 81.0f);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                            16.041.0                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16.0 1.0" + "'", str7, "16.0 1.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "16.0a1.0" + "'", str10, "16.0a1.0");
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("# # #", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(52, 28, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 81, 47);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 2, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a#4#4", (float) 176);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 176.0f + "'", float2 == 176.0f);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(20, 405, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HIA!AHIA!1#35#100#10#-1#0hi! 10 100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                         !ih    ", 17.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.0d + "'", double2 == 17.0d);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("              -1a1a1a97a97a1#hia-1a1a1a97a97a1#!-1a1a1a97a97a1#ahia-1a1a1a97a97a1#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...", (float) 25);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 25.0f + "'", float2 == 25.0f);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("H1401H!!1H!1.H1!H1401H!!1H!1.H1!H1401H!!1H!1H1!H!1!.H1!H1401H!!1H!1.H1!H1401H!!1H!1.H1!H1401H!!1H!1.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("3 3544444444444444444444444444444444444", 49.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.0d + "'", double2 == 49.0d);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaahia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("...          ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(107.0f, 30.0f, 14.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14.0f + "'", float3 == 14.0f);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 33, (float) 29L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                         #35#   #  #- # hi!     . ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1041004100414-14100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(".1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4aaaaaaaa1#35#100#10#-1#0.1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4aaaaaaaa1#35#100#10#-1#0.1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(32, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 59);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59L + "'", long2 == 59L);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4444444444E10d + "'", double1 == 4.4444444444E10d);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("16.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("   !IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   !IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("97A100A1A0A100A3", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...0.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("143541004\r", 391L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 391L + "'", long2 == 391L);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0#1-#01...0 10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...35#h!!#h!#-h#!h#35#h!!#h!#h...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("   ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 6, 97.0f, (float) 11);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1A10A#HI! 10 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A10A#HI! 10 100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00aa4a4hi!hi!aa4a4aa4a44aa4a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("16.", 1878);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1878 + "'", int2 == 1878);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 100, 29);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0a10.0a-1.0" + "'", str14, "1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#35#   #  #- # hi!     . l#ss [Ccl#ss [Lj#v#.l#ng.String;cl#ss [Lj#v#.l#ng.String;cl#ss [Lj#v#.l#ng.String;cl#ss [Lj#v#.l#ng.String;cl#ss [Lj#v#.l#ng.String;");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a4a4a4a4aa-1HI! 10 100.a-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1 0...10#-1#010a100a100a1a-1a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1 0...10#-1#010a100a100a1a-1a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "140" + "'", str16, "140");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "140" + "'", str18, "140");
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', 97.0f, (float) 14L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14.0f + "'", float3 == 14.0f);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0#10.0#-1.0", (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 4, 0);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 16.0f + "'", float6 == 16.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16.0#1.0" + "'", str8, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "16.0#1.0" + "'", str10, "16.0#1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 16.0f + "'", float11 == 16.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 16.0f + "'", float18 == 16.0f);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("010#-1#0a001a001a1a1-a001", 176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176 + "'", int2 == 176);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 23, 0);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "###143541004104-14#########\r###############################################aa4a4################################################\r###############################################aa4a4################################################\r###############################################aa4a4##########################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ###143541004104-14#########?###############################################aa4a4################################################?###############################################aa4a4################################################?###############################################aa4a4##########################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1004-1" + "'", str9, "1004-1");
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97ii  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("001a1-a1a001a001a010#1-#01...0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44 4 4444444            -1A10A4-1A10A4-1A10A4-1-1.041.040.0           a4a                                                              aa4a4                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44 4 4444444            -1A10A4-1A10A4-1A10A4-1-1.041.040.0           a4a                                                              aa4a4                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        float[] floatArray1 = new float[] { 35 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[35.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35.0" + "'", str3, "35.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35.0" + "'", str5, "35.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 4, 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0#10.0#-1.0" + "'", str11, "1.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#10.0#-1.0" + "'", str14, "1.0#10.0#-1.0");
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi4!4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4hi4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0000##.#4###.#4##.#4#.#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 104100L, 44.0f, (float) 8);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 8.0f + "'", float3 == 8.0f);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3 35" + "'", str13, "3 35");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 301, (float) 20, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 301.0f + "'", float3 == 301.0f);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0 10.0 -1.0" + "'", str17, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0410.04-1.0" + "'", str21, "1.0410.04-1.0");
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 15, 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10 1 100" + "'", str7, "10 1 100");
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a100a100a1a-1a1###################################################################################################a100a100a1a-1a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                              hia!ahia!1#35#100#10#-1#0HI! 10 100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 13, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("3#35                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3#35\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4                                                A4A97ii  0 000.00.  0 00  0 00  0 0\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        double[] doubleArray0 = new double[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray0, 'a', (int) 'a', 22);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str12, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str16, "1.0 2.0 10.0 16.0 3.0 2.0");
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1 0...10-1010a100a100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 0...10-1010a100a100a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(26.0f, (float) 0, 53.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 35L, (float) 7, 49.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 49.0f + "'", float3 == 49.0f);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 100, (int) '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-110");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + (-110) + "'", number1, (-110));
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 81, 16);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }
}

