package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                            4#aaaaaaaa                             aaaaaa100#-1#10#100#52#974444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14002");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 61, (double) 74, (double) 1051);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 61.0d + "'", double3 == 61.0d);
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14003");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1618, 132L, (long) 67);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1618L + "'", long3 == 1618L);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("A1-A001A01A....AA0297A01001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001A-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1-A001A01A....AA0297A01001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001A-1.0A0.0A0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14005");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 100, 0);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.1100 10-100 104001401444435#-1#0#00.0A0.0A0.1-4444444 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.1100 10-100 104001401444435#-1#0#00.0A0.0A0.1-4444444 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14007");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4#AAAAAAAA                                                              HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH1###41###", (double) 996);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 996.0d + "'", double2 == 996.0d);
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14008");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.Class<?> wildcardClass11 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a100a-1" + "'", str10, "10a100a-1");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14009");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.1100 10-100 104001401444435#-1#0#00.0A0.0A0.1-4444444 a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14010");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) 'a', (int) (short) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35a-1a0a0" + "'", str15, "35a-1a0a0");
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14011");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, (int) (short) 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int28 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int29 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int30 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int31 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1004-14104100452497" + "'", str27, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14012");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 0.0 ", 492.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 492.0f + "'", float2 == 492.0f);
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14013");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(699, 500, 678);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 699 + "'", int3 == 699);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14014");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("35#-1#0#03");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14015");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 4326, 100);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100#10" + "'", str7, "100#10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100410" + "'", str9, "100410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14016");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 4444444444444444444444444444444444444444444Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 4444444444444444444444444444444444444444444Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 4444444444444444444444444444444444444444444#-#Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 4444444444444444444444444444444444444444444#-#Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 4444444444444444444444444444444444444444444#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14017");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (short) 0, 1052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14018");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 61.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 61.0d + "'", double2 == 61.0d);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14019");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("792aAA....aaaaaaaaaa79a2aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14020");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...001010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14021");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(4330.0f, (float) 4230, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14022");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("        0.0A0.0A0.1-1a001       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0A0.0A0.1-1a001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14024");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 0, 0);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1" + "'", str13, "100#1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14025");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100a-1a10a100a52a97" + "'", str16, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100 -1 10 100 52 97" + "'", str24, "100 -1 10 100 52 97");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14026");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                        1a1a001a1-a0a001                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14027");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("          100a1-1.0A0.0A0.0       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14028");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a10010a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14029");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("        0.0A0.0A0.1-1#001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh310aaa100.0a1a4 a10aaa100.0a1a4 a10aaa100.00.0 0.0 0.1-10aaa100.0a1a4 a10aaa100.0a1a4 a10aaa100.0ahHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14030");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0a0.0a0.1-a1001010010100101001010010100101001010010100101001010010100101001010010100101001010010.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a10010a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.0A0.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A0.0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14032");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14033");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.00.0 0.0 0.1-10a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.0aa#a100.0a1a4 a10a#a100.0a1a4 a10a#a1                                                                                                                                                                                                                            10a100a-1a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.00.0 0.0 0.1-10a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.0aa#a100.0a1a4 a10a#a100.0a1a4 a10a#a10                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4#AAAAAAAA                                                              HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH1###41###A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#001                       ###1 ###10.0 0.0 0.1-hhhhhhhhhhH-1.0A0.0A0.00#0#1-#53a#4A 4", 487);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 487 + "'", int2 == 487);
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14034");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 179, 546);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 179");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14035");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10 100 -11001010010100101001010010100101001010010100101001010010100101001010010100101001010010100                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("3hhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3hhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14037");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 229, (int) (byte) 100);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 0 -1 100 1 1" + "'", str15, "100 0 -1 100 1 1");
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14038");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 727, 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 727 + "'", int3 == 727);
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A#479#25#001#01#1-#001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14040");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) ' ', (-1));
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 171, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1004-14104100452497" + "'", str22, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14041");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (short) 100, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 811, (int) '4');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14042");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 694.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 694.0d + "'", double3 == 694.0d);
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14043");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("A4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14044");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14045");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(694, 557, 557);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 694 + "'", int3 == 694);
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14046");
        int[] intArray6 = new int[] { 0, 678, 1051, '#', 1059, 678 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 678, 1051, 35, 1059, 678]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1059 + "'", int7 == 1059);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14047");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1068, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double24 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0a0.0a0.0" + "'", str23, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1.0#0.0#0.0" + "'", str26, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1.0a0.0a0.0" + "'", str28, "-1.0a0.0a0.0");
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14048");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...5#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#001");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14049");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1052, 0, 482);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100 10100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10100 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14051");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(961.0f, (float) 535, 155.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 155.0f + "'", float3 == 155.0f);
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14052");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14053");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 206, (float) (short) 100, (float) 111100103L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14054");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 1071, 678);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1071 + "'", int3 == 1071);
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14055");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', (int) '#', (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14056");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0" + "'", str18, "100.0");
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14057");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 1, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0 -1.0" + "'", str4, "-1.0 -1.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14058");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...                                 ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14059");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 996, (float) 627, (float) 67L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 996.0f + "'", float3 == 996.0f);
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14060");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" 0.0 0.        0.0A0.0A0.1-1a001     111100103444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100a10", 4326.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4326.0f + "'", float2 == 4326.0f);
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14061");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("H0.0H0.0100#0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           -1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-10.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           -1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-10.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           -1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-10.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100            ", 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4a3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4a3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4a3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4a3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14063");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 149L, (double) 500L, (double) 3867L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3867.0d + "'", double3 == 3867.0d);
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14064");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 100, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 10041, (int) (short) -1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 1068, (int) (short) 0);
        byte byte27 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte28 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) -1 + "'", byte27 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) -1 + "'", byte28 == (byte) -1);
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14065");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '#', (int) (byte) 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 100, (int) (short) 0);
        double double21 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double22 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14066");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0 0.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14067");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '#', (int) ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "-1.0#0.0#0.0-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0#0.0#0.0-1.0A0.0A0.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a-1" + "'", str15, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14068");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0#-1#100A10h35", (float) 546);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 546.0f + "'", float2 == 546.0f);
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14069");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) ' ', 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 179, 627);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 179");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14070");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0 0.0 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14071");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                          100A0A-1A100A1A1                                       ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14072");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" a a a4 ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0. a-1a100a10a100 10a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a0.1-a0.0a354-140400.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14073");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a#-#0#-#0#001#-#0#-#0#0010.001#-#0#-#0#0011#-#0#-#0#        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14074");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 500, (int) 'a');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14075");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 243, (long) 996, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 996L + "'", long3 == 996L);
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14076");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a a a4 ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0. a-1a100a10a100 10a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a0.1-a0.0a354-140400.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14077");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaa100#-1#10#100#52#9744444441a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14078");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1733, 1071, 4322);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1071 + "'", int3 == 1071);
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14079");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) ' ', 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14080");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a135");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14081");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10a#a100.0a1a4 10 100 -11001010010100101001010010100101001010010100101001010010100101001010010100101001010010100        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14082");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14083");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14084");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1a1a001a1-a0a001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14085");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(199, (int) (short) 10, 171);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14086");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 199, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14087");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1068L, (long) 243, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14088");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 0, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 100 -1" + "'", str14, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14089");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4.114A4.4-4.44414A4144414A414441");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14090");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) ' ', 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int24 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int27 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a-1a10a100a52a97" + "'", str17, "100a-1a10a100a52a97");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100 -1 10 100 52 97" + "'", str23, "100 -1 10 100 52 97");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14091");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(". 0        .A.A.1-1a1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14092");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1, 3883.0d, (double) 546L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3883.0d + "'", double3 == 3883.0d);
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14093");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14094");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '#', (int) (byte) 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0a0.0a0.0" + "'", str19, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14095");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) -1, (int) (byte) -1);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double23 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0a0.0a0.0" + "'", str22, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1.040.040.0" + "'", str25, "-1.040.040.0");
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14096");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', (float) 500L, 74.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 74.0f + "'", float3 == 74.0f);
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14097");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaa10100a10100a10100a10100a10100a10100a10100a10100a10100", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14098");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1061, 1733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1061");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0a10.0" + "'", str16, "10.0a10.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14099");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0A0.0A0.1-1a", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14100");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                          100a0a-1a100a1a1                                          0a.a0aAa0a.a0aAa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14101");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14102");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14103");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4322, 4323, 770);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4323 + "'", int3 == 4323);
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14104");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0 0.0 0.0" + "'", str15, "-1.0 0.0 0.0");
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14105");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("###################################HHHHHHHHHHH4#13A313A3133A3A#4A 4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14106");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14107");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0.0A0.0A0.1-A10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010A100 10A10A100A-1A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14108");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 3883, 114);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14109");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 10041, 1044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10041 + "'", int3 == 10041);
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14110");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                    0.0 0.0 0.11");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14111");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 100 -1" + "'", str8, "10 100 -1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14112");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 290, 149);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.Class<?> wildcardClass21 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14113");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1041004-1" + "'", str13, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14114");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) ' ', 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 482, 0);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a-1a10a100a52a97" + "'", str17, "100a-1a10a100a52a97");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14115");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10a#a100.0a1a4 354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0. aa4 a a a ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14116");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a10#100#-1h35#-1#0#a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-110135a-1a0a0.0a0.0a0. aaaaaa100#-1#10#100#52#974#aaaaaaaa3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh       010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010######################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14117");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 100, 10);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH#####.# #.# 44444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH#####.# #.# 44444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041004-1" + "'", str14, "1041004-1");
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14118");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4 a#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0a0.0a0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14119");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 694, 0.0d, (double) 199);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14120");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0a10.0" + "'", str16, "10.0a10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0#10.0" + "'", str18, "10.0#10.0");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14121");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444444444440.0 0.0 0.1-h.0A0.0A0. hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14122");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 770L, (double) 487L, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 770.0d + "'", double3 == 770.0d);
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14123");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 0, 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354-14040" + "'", str15, "354-14040");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "354-14040" + "'", str17, "354-14040");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35a-1a0a0" + "'", str19, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14124");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a100a-1" + "'", str12, "10a100a-1");
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(".A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..301001111     100a1-1.0A0.0A0.0        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..301001111     100a1-1.0A0.0A0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14126");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 310, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 310 + "'", int3 == 310);
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14127");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(171, 727, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14128");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14129");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14130");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100A0A-1A100A1A10.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14131");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) (short) 1, (int) (short) 1);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 1061, 2433);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1061");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#-1#10#100#52#97" + "'", str17, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14132");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 634, 0.0f, (float) 1733);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14133");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4323, 0.0f, (float) 996);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4323.0f + "'", float3 == 4323.0f);
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444435#-1#0#00.0a0.0a0.1-4444444a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 444435#-1#0#00.0a0.0a0.1-4444444a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14135");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 100, (float) 770L, (float) 592);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14136");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444440.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           44444444444444444444444444444444444444444444444444444444444", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14137");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 10, (int) (byte) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 10041, 10041);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 1072, 210);
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 100 + "'", byte24 == (byte) 100);
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Hhhhhhhhhh100a1-1100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14139");
        float[] floatArray5 = new float[] { 100L, ' ', 10001000, 67, 1059 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[100.0, 32.0, 1.0001E7, 67.0, 1059.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0001E7f + "'", float6 == 1.0001E7f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0001E7f + "'", float7 == 1.0001E7f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0001E7f + "'", float8 == 1.0001E7f);
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14140");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".0A0.0A0.", (float) 996L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 996.0f + "'", float2 == 996.0f);
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14141");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 770, 905);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 ############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 ############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14143");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hhhhhhhhhh100a1-1100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a0aa0a0aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0aa0a0aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14145");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("###################################HHHHHHHHHHH4#13A313A3133A3A#4A 4", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14146");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1" + "'", str12, "100a1");
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14147");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("01001111a0.0a0.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14148");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 100, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a0a-1a100a1a1" + "'", str17, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100 0 -1 100 1 1" + "'", str20, "100 0 -1 100 1 1");
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14149");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("  ###1 ###35#-1#0#035#-1#0#035#-1#0#0############################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHHHHHHHHHHHHHHHHHHHHHH1### 1##");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14150");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(487, 1059, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14151");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 837, 627);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0 0.0 0.0" + "'", str6, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14153");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (byte) -1, (int) (short) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14154");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) ' ', 10);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
    }

    @Test
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14155");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 179, (float) 4326L, 1.00110096E8f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 179.0f + "'", float3 == 179.0f);
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14156");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100#-1#10#100#52#97 #A-1.0A0.0A0.01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#-1#10#100#52#97 #A-1.0A0.0A0.01\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14157");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4326, (double) 967, 1066.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 967.0d + "'", double3 == 967.0d);
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14158");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 100 -1" + "'", str10, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041004-1" + "'", str12, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14159");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14160");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35#-1#0#00.0a0.0a0.1-hhhhhhhhhhh-1.0 0.0 0.01### 1###                       ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                              1004-1410410045249735#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                              1004-1410410045249735#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14162");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("H35#-1#0#100 0.0A0.0A0.1-a1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010H35#-1#0#100 0.0A0.0A0.1-a1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14163");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7 == 35.0f);
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14164");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0011111111111111111111111111111HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0         #          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0         792");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14165");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14166");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1039, 528, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1039 + "'", int3 == 1039);
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14167");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) '4', 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 74, 149);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 74");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.040.040.0" + "'", str18, "-1.040.040.0");
    }

    @Test
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14168");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 811.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 811.0d + "'", double2 == 811.0d);
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14169");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) '#', 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 0, (int) (short) 1);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) '#', 115);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.0" + "'", str15, "10.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14170");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
    }

    @Test
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14171");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.04100#-1#10#100#52#97 #                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14172");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100, (float) 770L, (float) 220);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14173");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) -1, (int) (byte) 1, 492);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 492 + "'", int3 == 492);
    }

    @Test
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14174");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 132);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14175");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) -1, (float) 630, 243.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 630.0f + "'", float3 == 630.0f);
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14176");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0#####################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0#####################################################################################################################################################################################################################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#100#-1" + "'", str16, "10#100#-1");
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14177");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 4330, (long) 1059, 599L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 599L + "'", long3 == 599L);
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14178");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a", 290.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 290.0f + "'", float2 == 290.0f);
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14179");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14180");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, 1061, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14181");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 727, 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14182");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14183");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100#-1#10#100#52#97 #A-1.0A0.0A0.010.0A0.0A0.1-A10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010A100 10A10A100A-1A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14184");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "0.53a0.1-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.53a0.1-");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1041004-1" + "'", str19, "1041004-1");
    }

    @Test
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100 10H35#-1#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10H35#-1#0#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14186");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0 -1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14187");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 727, (double) 3883, 67.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.0d + "'", double3 == 67.0d);
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14188");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1039, 1044);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1039");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
    }

    @Test
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14189");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (double) 1051L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1051.0d + "'", double2 == 1051.0d);
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14190");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 967, 996.0d, (double) 1072);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 967.0d + "'", double3 == 967.0d);
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14191");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (byte) 10, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 0, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10 100 -1" + "'", str21, "10 100 -1");
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14192");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14193");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '4', (int) (byte) 1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#100#-1" + "'", str24, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 100 + "'", byte26 == (byte) 100);
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1041004-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041004-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14195");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("001#01#1-#0#001#001");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14196");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(996.0f, (float) 1066, (float) 662);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 662.0f + "'", float3 == 662.0f);
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0aa0a0aa0a0aa0-35#-1#0#0a0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0aa0a0aa0a0aa0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0aa0a0aa0a0aa0-35#-1#0#0a0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0aa0a0aa0a0aa0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14198");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), 627.0f, (float) 770);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14199");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1071, (double) 557, (double) 1051);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 557.0d + "'", double3 == 557.0d);
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14200");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 535L, (float) 229L, (float) 678L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 678.0f + "'", float3 == 678.0f);
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14201");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("class3[Ljava.lang.String;class3[S", (float) 1733L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1733.0f + "'", float2 == 1733.0f);
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14202");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) ' ', 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 4322, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14203");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) -1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 4322, 0);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14204");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                            4#AAAAAAAA                                                              ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14205");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0" + "'", str9, "100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0" + "'", str11, "100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0" + "'", str13, "100.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14207");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14208");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 678, 699);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 678");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35#-1#0#0" + "'", str13, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14209");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4 # #-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHI!aaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaa10100a10100a10100a10100a10100a10100a10100a10100a10100", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#####.# #.# 44444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14211");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0#0.0#0.1-100#10100#10100#10100#10100#10100##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################44444444444444444444444...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0#0.0#0.1-100#10100#10100#10100#10100#10100##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################44444444444444444444444...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#100#-1" + "'", str20, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 100 + "'", byte22 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 100 + "'", byte23 == (byte) 100);
    }

    @Test
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14212");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (short) 1, 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long22 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35a-1a0a0" + "'", str11, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "354-14040" + "'", str20, "354-14040");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#A4#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#974#A-1.0A0.0A0.0100#-1#10#100#52#97435#-1#0#A0.0A0.0100#-1#10#100#52#97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14214");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1066.0f, (double) 210L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14215");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 694, 905L, 1072L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1072L + "'", long3 == 1072L);
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14216");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 100, (int) '#');
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14217");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14218");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 171, 10041.0f, (float) 1618);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14219");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0d), (double) 1042.0f, (double) 630L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1042.0d + "'", double3 == 1042.0d);
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14220");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0-1.0#-1.0-1.0#-1.0-14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100a0a-1a100a1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14221");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0.0#0.0#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14222");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a0.0a0.0" + "'", str20, "-1.0a0.0a0.0");
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14223");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) 627, 546L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14224");
        long[] longArray1 = new long[] { (short) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14225");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("class[Ljava.lang.String;class...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14226");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hhhhhhhhhh", (long) 206);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 206L + "'", long2 == 206L);
    }

    @Test
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14227");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0 10.0" + "'", str12, "10.0 10.0");
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14228");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-141404104041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14229");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 10041, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354-14040" + "'", str15, "354-14040");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14230");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.00.0 0.0 0.1-10a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.0aa#a100.0a1a4 a10a#a100.0a1a4 a10a#a1                                                                                                                                                                                                                            10a100a-1a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.00.0 0.0 0.1-10a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.0aa#a100.0a1a4 a10a#a100.0a1a4 a10a#a10                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4#AAAAAAAA                                                              HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH1###41###A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#0010.0A0.0A0.1-A# 79#25#001#01#1-#001                       ###1 ###10.0 0.0 0.1-hhhhhhhhhhH-1.0A0.0A0.00#0#1-#53a#4A 4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14231");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("3a4aA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3a4aA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#100a1-1.0A0.0A0.04#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4100a0a-1a100a1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a1-1.0A0.0A0.04#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4100a0a-1a100a1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14233");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short25 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 100 + "'", short22 == (short) 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100a0a-1a100a1a1" + "'", str24, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14235");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14236");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14237");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(210, 120, 258);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test14238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14238");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(967.0d, (double) 149L, 599.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 967.0d + "'", double3 == 967.0d);
    }

    @Test
    public void test14239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14239");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hhhh                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 3883);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3883 + "'", int2 == 3883);
    }

    @Test
    public void test14240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14240");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1111001033hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14241");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 630, 482.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 630.0d + "'", double3 == 630.0d);
    }

    @Test
    public void test14242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14242");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 592, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 210, 1061);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 210");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14243");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(" 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test14244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14244");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 100, (int) (short) 1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) (byte) 0, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35 -1 0 0" + "'", str14, "35 -1 0 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35" + "'", str18, "35");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35a-1a0a0" + "'", str20, "35a-1a0a0");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
    }

    @Test
    public void test14245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14245");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100404 404 414-4 4354                404.404A404.404A404.414-414A4100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14246");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("####################################################4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14247");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1L), 199.0d, (double) 1424);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test14248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14248");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 492, 4326);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 492");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35a-1a0a0" + "'", str13, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35#-1#0#0" + "'", str19, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
    }

    @Test
    public void test14249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14249");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', (int) (byte) 100, (int) (byte) 1);
        short short24 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short25 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) -1 + "'", short24 == (short) -1);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100#0#-1#100#1#1" + "'", str27, "100#0#-1#100#1#1");
    }

    @Test
    public void test14250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hhhhhhhhhhH-1.0A0.0A0.00#0#1-#53");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhH-1.0A0.0A0.00#0#1-#53\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14251");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) (byte) 10, 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0" + "'", str13, "100.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0" + "'", str16, "100.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
    }

    @Test
    public void test14252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14252");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1" + "'", str9, "100#1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 1" + "'", str11, "100 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 1" + "'", str13, "100 1");
    }

    @Test
    public void test14253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14253");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A1-A001A01A....AA0297A01001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001A-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14254");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     class[ljava.lang.string;class... A.0A0.0A0.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14255");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a7920AA....aaaaaaaa#479#25#001#01#1-#001aaaaaa                                                                   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14256");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 114.0f, 10041.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10041.0d + "'", double3 == 10041.0d);
    }

    @Test
    public void test14257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14257");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hhhhhhhhhh100a1-1100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14258");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 4326L, (float) 770L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4326.0f + "'", float3 == 4326.0f);
    }

    @Test
    public void test14259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14259");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) -1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 10001000, (int) ' ');
        long long24 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "354-14040" + "'", str16, "354-14040");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35#-1#0#0" + "'", str18, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "35a-1a0a0" + "'", str26, "35a-1a0a0");
    }

    @Test
    public void test14260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14260");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 67, (long) (short) 10, 310L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 310L + "'", long3 == 310L);
    }

    @Test
    public void test14261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14261");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0" + "'", str11, "100.0");
    }

    @Test
    public void test14262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14262");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 100, 0.0f, (float) 1042L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test14263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14263");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 678, (long) 171, (long) 1068);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 171L + "'", long3 == 171L);
    }

    @Test
    public void test14264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14264");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(770.0d, 1.11100103E8d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.11100103E8d + "'", double3 == 1.11100103E8d);
    }

    @Test
    public void test14265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14265");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#####.# #.#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14266");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10.0a10.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14267");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) (short) 100, (int) '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', (int) '#', (int) (short) 10);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0 -1.0" + "'", str4, "-1.0 -1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test14268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14268");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 243, (float) 74, (float) 4230L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 74.0f + "'", float3 == 74.0f);
    }

    @Test
    public void test14269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14269");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("###1 ###1", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14270");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, 0, 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Class [Ljava.lang.String;class [S925001011-aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Class [Ljava.lang.String;class [S925001011-aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14272");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!100101001010010100101001010010100101001010010100 A1001010010100101001010010100101001010010100101");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14273");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a0a-1a100a1a1" + "'", str10, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a0a-1a100a1a1" + "'", str12, "100a0a-1a100a1a1");
    }

    @Test
    public void test14274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14274");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1618.0f, 310.0f, 74.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 74.0f + "'", float3 == 74.0f);
    }

    @Test
    public void test14275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14276");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 310, 310);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 10001000, 770);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14277");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14278");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14279");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(634, 1429, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1429 + "'", int3 == 1429);
    }

    @Test
    public void test14280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14280");
        long[] longArray4 = new long[] { ' ', (byte) 0, (short) 0, 1L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 811, 0);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32 0 0 1" + "'", str7, "32 0 0 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test14281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14281");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0100101001010010100101001010010100101001010010100101001010010100101");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh7925001...                                                                                          10aaa100.0a1a4 a10aaa100.0a1a4 a10aaa100.00.0 0.0 0.1-10aaa100.0a1a4 a10aaa100.0a1a4 a10aaa100.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh7925001...                                                                                          10aaa100.0a1a4 a10aaa100.0a1a4 a10aaa100.00.0 0.0 0.1-10aaa100.0a1a4 a10aaa100.0a1a4 a10aaa100.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14283");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) ' ', (int) (short) -1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 0.0 0.0" + "'", str8, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a0.0a0.0" + "'", str10, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0#0.0#0.0" + "'", str12, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0#0.0#0.0" + "'", str18, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a0.0a0.0" + "'", str20, "-1.0a0.0a0.0");
    }

    @Test
    public void test14284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14284");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 770.0f, (double) 159, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 770.0d + "'", double3 == 770.0d);
    }

    @Test
    public void test14285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14285");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 0, 0);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100a1" + "'", str16, "100a1");
    }

    @Test
    public void test14286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14286");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1424, 1429, 4322);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4322 + "'", int3 == 4322);
    }

    @Test
    public void test14287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14287");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 592, 276);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0#0.0#0.0" + "'", str9, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test14288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14288");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(655, 10001000, 4230);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10001000 + "'", int3 == 10001000);
    }

    @Test
    public void test14289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14289");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Class [Ljava.lang.String;class [S925001011-aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100a", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14290");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4330, 2433, 905);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4330 + "'", int3 == 4330);
    }

    @Test
    public void test14291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14291");
        short[] shortArray5 = new short[] { (byte) 0, (short) -1, (byte) -1, (byte) -1, (short) 1 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test14292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14292");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 627, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0 0.0 0.0" + "'", str22, "-1.0 0.0 0.0");
    }

    @Test
    public void test14293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14293");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaa-35#-1#0#00.0A0.0A0.1-aaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14294");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0h0.0h0.0100#1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14295");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 100, 3883);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test14296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14296");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100a10AAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14297");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger[] bigIntegerArray2 = new java.math.BigInteger[] { bigInteger1 };
        java.math.BigInteger[][] bigIntegerArray3 = new java.math.BigInteger[][] { bigIntegerArray2 };
        java.math.BigInteger bigInteger5 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger[] bigIntegerArray6 = new java.math.BigInteger[] { bigInteger5 };
        java.math.BigInteger[][] bigIntegerArray7 = new java.math.BigInteger[][] { bigIntegerArray6 };
        java.math.BigInteger[][][] bigIntegerArray8 = new java.math.BigInteger[][][] { bigIntegerArray3, bigIntegerArray7 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray8);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigIntegerArray2);
        org.junit.Assert.assertNotNull(bigIntegerArray3);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigIntegerArray6);
        org.junit.Assert.assertNotNull(bigIntegerArray7);
        org.junit.Assert.assertNotNull(bigIntegerArray8);
    }

    @Test
    public void test14298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14298");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1071, 727L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1071L + "'", long3 == 1071L);
    }

    @Test
    public void test14299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14299");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14300");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10#100#-1100#-1#10#100#52#97##a-1.001001111a0.0a0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#100#-1100#-1#10#100#52#97##a-1.001001111a0.0a0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14301");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 100 -1" + "'", str13, "10 100 -1");
    }

    @Test
    public void test14302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14302");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (byte) 10, (int) (short) 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10041" + "'", str15, "10041");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100#1" + "'", str20, "100#1");
    }

    @Test
    public void test14303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(".0 0.0 0.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0 0.0 0.1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14304");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10041" + "'", str10, "10041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#1" + "'", str12, "100#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a1" + "'", str14, "100a1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100#1" + "'", str18, "100#1");
    }

    @Test
    public void test14305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14305");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100a10" + "'", str8, "100a10");
    }

    @Test
    public void test14306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14306");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "AA4AAA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: AA4AAA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041004-1" + "'", str17, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
    }

    @Test
    public void test14307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14307");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
    }

    @Test
    public void test14308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4 A 4 A 4 -                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    -                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 A 4 A 4 -                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    -                                                                                                     \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14309");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 243, 487.0d, (double) 132L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 132.0d + "'", double3 == 132.0d);
    }

    @Test
    public void test14310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14310");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444444444444444444444444444444444444hhhhhhhhhh100 7920AA....                                                                                          1-4001401", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test14311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14311");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1" + "'", str9, "100#1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a1" + "'", str14, "100a1");
    }

    @Test
    public void test14312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14312");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14313");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 276, 3883);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 276");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14314");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) 'a', (int) (short) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 -1 0 0" + "'", str15, "35 -1 0 0");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test14315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14315");
        long[] longArray4 = new long[] { ' ', (byte) 0, (short) 0, 1L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 905, 699);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32 0 0 1" + "'", str7, "32 0 0 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test14316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14316");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1424, (float) 1068, (float) 132L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1424.0f + "'", float3 == 1424.0f);
    }

    @Test
    public void test14317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14317");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 276.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 276.0f + "'", float2 == 276.0f);
    }

    @Test
    public void test14318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("001#01#1-#0#001#001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"01#01#1-#0#001#001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14319");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44a", 837);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 837 + "'", int2 == 837);
    }

    @Test
    public void test14320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14320");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "792aAA....aaaaaaaaaa79a2aaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 792aAA....aaaaaaaaaa79a2aaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a100a-1" + "'", str18, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
    }

    @Test
    public void test14321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14321");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(229.0f, (float) 177, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test14322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14322");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test14323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14323");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.035#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14324");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1424, 290, 694);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1424 + "'", int3 == 1424);
    }

    @Test
    public void test14325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14325");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0 0.0 0.0" + "'", str6, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14326");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14327");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0011111111111111111111111111111HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0         #          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0         792", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test14328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                     1001010010100101001010010100101001010010100101004 a10010100101001010010100101001010010100101001010011-4001401100a135#-1                                                                                     -1.0H0.0H0.0100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14329");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.Class<?> wildcardClass16 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35a-1a0a0" + "'", str13, "35a-1a0a0");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14330");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14331");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#-1#10#100#52#97" + "'", str17, "100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test14332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14332");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a-1a10a100a52a97" + "'", str15, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 -1 10 100 52 97" + "'", str19, "100 -1 10 100 52 97");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test14333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14333");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1A79h2hAA1hA1h1hhAA1 79h2hAA1hA1h1hhAA11AA79h2hAA1hA1h1hhAA1 79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA111AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA1A1AA79h2hAA1hA1h1hhAA1        79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1979h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1979h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1179h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1179h2hAA1hA1h1hhAA1a79h2hAA1hA1h1hhAA1AA179h2hAA1hA1h1hhAA1       79h2hAA1hA1h1hhAA1HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH979h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1AA1179h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1AA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1AA179h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1AA179h2hAA1hA1h1hhAA1hh79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1AA179h2hAA1hA1h1hhAA1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1a79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1a79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1179h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1a79h2hAA1hA1h1hhAA1179h2hAA1hA1h1hhAA1 79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA11h79h2hAA1hA1h1hhAA1 79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA11h79h2hAA1hA1h1hhAA1 79h2hAA1hA1h1hhAA1179h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA11h79h2hAA1hA1h1hhAA1 79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA11h179h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA11h79h2hAA1hA1h1hhAA1 79h2hAA1hA1h1hhAA1179h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1a79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1a79h2hAA1hA1h1hhAA1A79h2hAA1hA1h1hhAA1479h2hAA1hA1h1hhAA1179h2hAA1hA1h1hhAA1h79h2hAA1hA1h1hhAA1a", 149L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test14334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14334");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".0#-1.0-1.0#-1.0-1.0#-1.0-14aa100a0a-1a100a1a1", (float) 258);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 258.0f + "'", float2 == 258.0f);
    }

    @Test
    public void test14335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14335");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14336");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(811.0f, 811.0f, 500.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 500.0f + "'", float3 == 500.0f);
    }

    @Test
    public void test14337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14337");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test14338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14338");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(155.0d, (double) 905.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 905.0d + "'", double3 == 905.0d);
    }

    @Test
    public void test14339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14339");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test14340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14340");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1035#-1#0#0#35#-1#0#0100.035#-1#0#0135#-1#0#04 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1035#-1#0#0#35#-1#0#0100.035#-1#0#0135#-1#0#04 a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14341");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short22 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) ' ', 546);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100#0#-1#100#1#1" + "'", str24, "100#0#-1#100#1#1");
    }

    @Test
    public void test14342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14342");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test14343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14343");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4#AAAAAAAA", (double) 678.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 678.0d + "'", double2 == 678.0d);
    }

    @Test
    public void test14344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14344");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3867L, (float) 627L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3867.0f + "'", float3 == 3867.0f);
    }

    @Test
    public void test14345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14345");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                   hhhhhhhhhh                                                                                                                                                                                                                                                                                                   ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test14346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh4444435#-1#0#00.0a0.0a0.1-444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh4444435#-1#0#00.0a0.0a0.1-444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14347");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14348");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".0A0.0A0. aa4 a 35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## a.0A0.0A0. aa4");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("925001011-0014444444444444444444444444444444444444440.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"925001011-0014444444444444444444444444444444444444440.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14350");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 662, 3883);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3883 + "'", int3 == 3883);
    }

    @Test
    public void test14351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14351");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14352");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(10001000L, (long) 4326, 1052L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1052L + "'", long3 == 1052L);
    }

    @Test
    public void test14353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14353");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14354");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".00.00.-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0354-14040..A1...A1...A1...A1...A1...A1...A1...A1...35#-1#0#00.0A0.0A0.1-4444444 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14355");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 592, (float) 3883, (float) 1618L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3883.0f + "'", float3 == 3883.0f);
    }

    @Test
    public void test14356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14356");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test14357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14357");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 1061, 0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0" + "'", str9, "100.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0" + "'", str17, "100.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test14358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14358");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 492, 120);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041004-1" + "'", str17, "1041004-1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test14359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14359");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 627, 627);
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100a-1a10a100a52a97" + "'", str26, "100a-1a10a100a52a97");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "100#-1#10#100#52#97" + "'", str28, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test14360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14360");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 727, 227);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a-1a10a100a52a97" + "'", str14, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100a-1a10a100a52a97" + "'", str22, "100a-1a10a100a52a97");
    }

    @Test
    public void test14361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14361");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14362");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 1, (int) (byte) 1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) (short) 1, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35 -1 0 0" + "'", str20, "35 -1 0 0");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test14363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14363");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test14364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14364");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 149L, (long) 1071);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1071L + "'", long3 == 1071L);
    }

    @Test
    public void test14365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14365");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 1424, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14366");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(678, 627, 967);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 627 + "'", int3 == 627);
    }

    @Test
    public void test14367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14367");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 1051, (int) (byte) 1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#100#-1" + "'", str13, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a-1" + "'", str15, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a100a-1" + "'", str21, "10a100a-1");
    }

    @Test
    public void test14368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14368");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("        0.0a0.0a0.1-1a001       hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14369");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 100, 0);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10#100#-1" + "'", str21, "10#100#-1");
    }

    @Test
    public void test14370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14370");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (short) -1, 199);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test14371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                  a#4#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                  a#4#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35                                                                   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14372");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaa#479#25#001#01#1-#001aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaa#479#25#001#01#1-#001aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14374");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH#####.# #.# 44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14375");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14376");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0 -1.0" + "'", str4, "-1.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0#-1.0" + "'", str6, "-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0#-1.0" + "'", str9, "-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 -1.0" + "'", str12, "-1.0 -1.0");
    }

    @Test
    public void test14377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14377");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test14378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14378");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(487.0d, 0.0d, (double) 4330L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.0d + "'", double3 == 4330.0d);
    }

    @Test
    public void test14379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14379");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1#-1-1#-1-1#-1-14AA1111111111111111111111111111111111111111111AA-1A1A1A11111111111111111111111111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14380");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) 'a', 10);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test14381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14381");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) '4', (-1));
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 3867, 272);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14382");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100#-1#10#100#52#97#A-1.0A0.0A0.01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14383");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0A0.0A0.1-1a001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1.14.141.14.141.141.0.0a0.0a0.1-aHHHHHH", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test14384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14384");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 494, (int) (short) 0);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 1039, 210);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 0, 1068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100#-1#10#100#52#97" + "'", str26, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test14385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14385");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("H35#-1#0#4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14386");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14387");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1052.0f, (double) 662, (double) 1424.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 662.0d + "'", double3 == 662.0d);
    }

    @Test
    public void test14388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14388");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 3883, 114);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test14389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14389");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 699);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 699L + "'", long2 == 699L);
    }

    @Test
    public void test14390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14390");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100a0a-1a100a1a14#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#          100a1-1.0a0.0a0.0        35#-1#0#0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14391");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test14392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14392");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "4 A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4 A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test14393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14393");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 100, (int) 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0 0.0 0.0" + "'", str6, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test14394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14394");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14395");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                      35a-1a0a0                                                                      ", 111100103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111100103 + "'", int2 == 111100103);
    }

    @Test
    public void test14396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14396");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" 0.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 0.0 0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14397");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 1, (-1));
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0410.0" + "'", str17, "10.0410.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test14398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14398");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test14399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14399");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 132, 4330L, 1068L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 132L + "'", long3 == 132L);
    }

    @Test
    public void test14400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14400");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0100a10100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14401");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("444435#-1#0#00.0A0.0A0.1-4444444 a", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test14402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14402");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 227, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1.0#-1.0                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0                                                                                          \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14404");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A1-A001A01A....AA0297A01001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001A-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14405");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1.11100104E8f, (double) '4', 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.11100104E8d + "'", double3 == 1.11100104E8d);
    }

    @Test
    public void test14406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14406");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100a1" + "'", str6, "100a1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a1" + "'", str9, "100a1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
    }

    @Test
    public void test14407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14407");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 1072, (int) (short) 0);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14408");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444435#-1#0#00 0A0 0A0 1-4444444 a", 662.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 662.0d + "'", double2 == 662.0d);
    }

    @Test
    public void test14409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14409");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 0, 535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#1" + "'", str8, "100#1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 1" + "'", str13, "100 1");
    }

    @Test
    public void test14410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14410");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 0, 0);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test14411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14411");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("925001011-001444444444444444444444444444444444444444100 10                                          #####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14412");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.040.040.0" + "'", str10, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14413");
        float[] floatArray2 = new float[] { (-1), 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) 'a', (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 546, 177);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a0.0" + "'", str13, "-1.0a0.0");
    }

    @Test
    public void test14414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14414");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                            4#aaaaaaaa                             ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14415");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                          100a0a-1a100a1a1                                          10.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14416");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test14417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14417");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 535L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 535.0d + "'", double2 == 535.0d);
    }

    @Test
    public void test14418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14418");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(811, 494, 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 811 + "'", int3 == 811);
    }

    @Test
    public void test14419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14419");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 627.0d, (double) 694);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 694.0d + "'", double3 == 694.0d);
    }

    @Test
    public void test14420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14420");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 100, (int) (short) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 662, 492);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35#-1#0#0" + "'", str11, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test14421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14421");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test14422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14422");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 10041, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 0, 546);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test14423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14423");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35#-1#0#0" + "'", str13, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test14424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14424");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("        0.0A0.0A0.1-1a001       hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14425");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14426");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (short) 100, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 100, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14427");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 482.0f, (double) 155, (double) 546L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 546.0d + "'", double3 == 546.0d);
    }

    @Test
    public void test14428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14428");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) (short) 100, (int) (short) 1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 494, 132);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354-14040" + "'", str15, "354-14040");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "35#-1#0#0" + "'", str22, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test14429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14429");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0#0.0#0.0" + "'", str9, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 0.0 0.0" + "'", str11, "-1.0 0.0 0.0");
    }

    @Test
    public void test14430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14430");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh#########################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14431");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("##########00#10100                                           ", (float) 961);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 961.0f + "'", float2 == 961.0f);
    }

    @Test
    public void test14432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14432");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4326, (float) 10001000, (float) 494);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0001E7f + "'", float3 == 1.0001E7f);
    }

    @Test
    public void test14433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14433");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444401001010010100101001010010100101001010010100101001010010100101001014444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger3 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger5 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444401001010010100101001010010100101001010010100101001010010100101001014444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger[] bigIntegerArray6 = new java.math.BigInteger[] { bigInteger1, bigInteger3, bigInteger5 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray6);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigIntegerArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444010010100101001010010100101001010010100101001010010100101001010010144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444401001010010100101001010010100101001010010100101001010010100101001014444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str7, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444010010100101001010010100101001010010100101001010010100101001010010144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444401001010010100101001010010100101001010010100101001010010100101001014444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test14434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14434");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA40-0-00110-0-0010.0010-0-0010-0-001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a14 A4a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14435");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a-1a10a100a52a97" + "'", str17, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test14436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14436");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', (float) 111100103L, (float) 464);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.11100104E8f + "'", float3 == 1.11100104E8f);
    }

    @Test
    public void test14437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14437");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 179, 0);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 258, 149);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test14438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14438");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1, (-1));
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
    }

    @Test
    public void test14439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a10#100#-1h35#-1#0#a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-110135a-1a0a0.0a0.0a0. aaaaaa100#-1#10#100#52#974#aaaaaaaa3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh       010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010######################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a10#100#-1h35#-1#0#a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-110135a-1a0a0.0a0.0a0. aaaaaa100#-1#10#100#52#974#aaaaaaaa3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh       010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010######################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14440");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-444-4-444-4-444-4-444-4-444-4-444-4-444-4-444-4-444-4-44                                           01");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-444-4-444-4-444-4-444-4-444-4-444-4-444-4-444-4-444-4-44                                           01");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test14441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14441");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test14442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14442");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(4326.0f, (float) 229, (float) 500L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4326.0f + "'", float3 == 4326.0f);
    }

    @Test
    public void test14443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14443");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100a0a100a-1a0a10", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test14444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14444");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 229, 808);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test14445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14445");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                          100a0a-1a100a1a1                                          10.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.010.0a10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14446");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (byte) 10, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 0, 227);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test14447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14447");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1" + "'", str9, "100#1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1" + "'", str12, "100a1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test14448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14448");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2419, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14449");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 10041, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354-14040" + "'", str15, "354-14040");
    }

    @Test
    public void test14450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14450");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 200, (int) '4');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 0, (-1));
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100a-1a10a100a52a97" + "'", str25, "100a-1a10a100a52a97");
    }

    @Test
    public void test14451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14451");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 4330, 694);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test14452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14452");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10, (-1.0f), (float) 1059);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1059.0f + "'", float3 == 1059.0f);
    }

    @Test
    public void test14453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14453");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (short) 10, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 4322, 535);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14454");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                100 ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0a.a0aaa0a.a0aaa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a.a0aaa0a.a0aaa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14456");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100a0a-1a100a1a1#############################################AA4AAA#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14457");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14458");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 770, (long) (short) 10, 599L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 770L + "'", long3 == 770L);
    }

    @Test
    public void test14459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14459");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) '#', (int) '#');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.040.040.0" + "'", str11, "-1.040.040.0");
    }

    @Test
    public void test14460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14460");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1059.0f, 100.0f, (float) 210L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1059.0f + "'", float3 == 1059.0f);
    }

    @Test
    public void test14461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14461");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0#-1.0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14462");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 100#-1#10#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14463");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#100#-1" + "'", str9, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 100 -1" + "'", str11, "10 100 -1");
    }

    @Test
    public void test14464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14464");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(114.0f, (float) 487, 3.0100112E8f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 114.0f + "'", float3 == 114.0f);
    }

    @Test
    public void test14465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14465");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1A1A0A10A0A1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14466");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 001a01001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001a-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14467");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(229L, (long) 1052, (long) 67);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1052L + "'", long3 == 1052L);
    }

    @Test
    public void test14468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14468");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 10, 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', (int) '#', (int) (byte) -1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
    }

    @Test
    public void test14469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14469");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14470");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100a-1a10a100a52a97" + "'", str16, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test14471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14471");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 528, (float) 10100L, 770.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 528.0f + "'", float3 == 528.0f);
    }

    @Test
    public void test14472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14472");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #aHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!a10H35#-1#0#4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14473");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100A10", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14474");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4410.00.00.01a00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000a000 00a00a000a10ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14475");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 200, 3883L, (long) 1424);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3883L + "'", long3 == 3883L);
    }

    @Test
    public void test14476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14476");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a 4444444-1.0A0.0A0.00#0#1-#53.a.a.1A.a.a.1A.a.a.1A.a.a.1A.a.a.1A.a.a.1A.a.a.1A.a.a.1A.a.a04041-4530.01 0010.0A0.0A0.1-0.01 0010.0A0.0A0.1-0.1-.0a0.0a0.", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test14477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14477");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("2#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0AA0A1-A5311A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0010.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a10010a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test14478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14478");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0a.a0aAa0a.a0aAa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010aaa100a a10aaa10aaa100aaa-a1aahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14479");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short22 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        short short27 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short28 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short29 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100a0a-1a100a1a1" + "'", str24, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100404-141004141" + "'", str26, "100404-141004141");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 100 + "'", short28 == (short) 100);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 100 + "'", short29 == (short) 100);
    }

    @Test
    public void test14480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14480");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 492, (double) 1042.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14481");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a#479#25#001#01#1-#001             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#479#25#001#01#1-#001             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14482");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4330L, (long) 74, 699L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 74L + "'", long3 == 74L);
    }

    @Test
    public void test14483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14483");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("01a001444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444301001111     100a1-1.0A0.0A0.0        .0 0.0 35#-1#0#00.0a0.0a0.1-hhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14484");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) '#', (int) '#');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
    }

    @Test
    public void test14485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14485");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (short) -1, (-1));
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 67, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double23 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 132, (int) (short) 10);
        double double28 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.040.040.0" + "'", str22, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test14486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14486");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 200, (int) '4');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 0, (-1));
        int int24 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test14487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14487");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 0, (int) (byte) 0);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test14488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14488");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) '#', 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 727, (int) '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 1429, 808);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14489");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 310, (float) 630, 200.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 200.0f + "'", float3 == 200.0f);
    }

    @Test
    public void test14490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14490");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(74, 1, 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test14491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14491");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 100, 10);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041004-1" + "'", str14, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test14492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14492");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0.0A0.0A0.1-A10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010A100 10A10A100A-1A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14493");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14494");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A10#100#-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14495");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("010110-11", 662);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 662 + "'", int2 == 662);
    }

    @Test
    public void test14496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14496");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "354-14040" + "'", str11, "354-14040");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "354-14040" + "'", str13, "354-14040");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test14497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14497");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10041, 115, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10041 + "'", int3 == 10041);
    }

    @Test
    public void test14498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14498");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14499");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '4', (int) (byte) 1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#100#-1" + "'", str24, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
    }

    @Test
    public void test14500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest28.test14500");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-...", 1068);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1068 + "'", int2 == 1068);
    }
}

