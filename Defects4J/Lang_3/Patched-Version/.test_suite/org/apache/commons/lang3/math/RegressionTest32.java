package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '#', 1164.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, (-1.41041038524416E14d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.41041038524416E14d) + "'", double3 == (-1.41041038524416E14d));
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.00.0", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 817, 300);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 797, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 300, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 'a', (float) 817L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 817.0f + "'", float3 == 817.0f);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3145, 186L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" 4 4#", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("  1.040.  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10#97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#97\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1004100414-1414-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1004100414-1414-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', (int) (short) 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 186, (int) '4');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray5, '4');
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10a0a10a100a1" + "'", str9, "10a0a10a100a1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1040410410041" + "'", str19, "1040410410041");
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a-1a1a10a1a10a1a-1a100i!   hi! hi!1.0 0.0            ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(100.0d, (double) (byte) 1, (double) 3145);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4768, 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 300, 1341);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 300");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100414041004524-1" + "'", str11, "100414041004524-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#100#52#-1" + "'", str13, "100#1#0#100#52#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("!ih!ih!ih!ih!ih!ih!ih01 001 1 1- 1 79");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!   hi! hi!1.0 0.0            ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("ahi!ahi!a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97414-1414100410" + "'", str11, "97414-1414100410");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97#1#-1#1#100#10" + "'", str14, "97#1#-1#1#100#10");
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a10a100a100", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 10, (long) 1, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 3145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3145L + "'", long2 == 3145L);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 100, (int) '4');
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100414041004524-1" + "'", str11, "100414041004524-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#100#52#-1" + "'", str13, "100#1#0#100#52#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100414041004524-1" + "'", str20, "100414041004524-1");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(300, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(" !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH hi!   hi! hi!1.0 0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               11 1 1- 001011 1 1- 00111 1 1- 0011-1 1 1- 00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 909, (double) 813);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 909.0d + "'", double3 == 909.0d);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        double[] doubleArray3 = new double[] { 0, (short) 1, 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 10, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52 -1hi! hi! hi!100 1 0 100 52100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ih !ih  Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! ", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 1164, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        long[] longArray4 = new long[] { 'a', (short) 0, 1, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (-1), 3145);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("Hii0H0i0Hii0!h0!H", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 300, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) ' ', 813);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, (double) (-1), (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444hhh4444", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 575, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 575L + "'", long3 == 575L);
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("i! hi! hi!1.0 0.0hi!   hi! hi!1.0 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (short) 1, (int) (short) 1);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.0 35.0 -1.0 -1.                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0 35.0 -1.0 -1.                                                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a10.0a0.0a-1.0" + "'", str15, "0.0a10.0a0.0a-1.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "10#97");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10#97");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 -1 1 10 1" + "'", str13, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', (int) (short) 1, 1341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1341 + "'", int3 == 1341);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1164, (int) (short) 1);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1004-14141041" + "'", str13, "1004-14141041");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!   hi! hi!1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!   hi! hi!1.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Hii4H4i4Hii4!h4!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Hi!   hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100 -1 1 1-1100 -1 1 11100 -1 1 110100 -1 1 11");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 -1 1 1-1100 -1 1 11100 -1 1 110100 -1 1 11\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10#0#10#100#1Hii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHi");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, 4768.0d, 1164.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4768.0d + "'", double3 == 4768.0d);
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444-44-###");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100414041004524-1!ih !ih  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100414041004524-1!ih !ih   is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1HI!aHI!aHI!1.0a0.0100a1a0a100a52a-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...i!100 1 0 100 52 -1hi!   hi! ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                         hi!hi!hi!1.00.0                                          hi!hi!   hi! hi!hi!   hi! hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", (long) 797);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 797L + "'", long2 == 797L);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "ih !ih  Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ih !ih  Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100414041004524-1!ih !ih ", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHII4H4I4HII4!H4!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHII4H4I4HII4!H4!H is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, ' ', '4', (byte) 10, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 100 32 52 10 10" + "'", str9, "1 100 32 52 10 10");
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, 100, 10, 1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.040.0" + "'", str6, "1.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 909, 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.040.0" + "'", str6, "1.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 100, (float) 3145, (float) 797L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("97A1A-1A1A100A10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0#10.0#0.0#-1.0" + "'", str11, "0.0#10.0#0.0#-1.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', (int) (short) 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 186, (int) '4');
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10a0a10a100a1" + "'", str9, "10a0a10a100a1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1a10a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a10a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 1 0 100 52 -1" + "'", str12, "100 1 0 100 52 -1");
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1004100414-1414-1", (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hi!   hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("class [Ljava.lang.CharSequence;class [Sclass [S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"cl\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 0.0", (float) 300);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 300.0f + "'", float2 == 300.0f);
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi! hi! hi!1.0 0.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110hi!hi!hi!1.00.010-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110hi!hi!hi!1.00.010-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, (-1));
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97#1#-1#1#100#10" + "'", str15, "97#1#-1#1#100#10");
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hii4H4i4Hii4!h4!H");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (byte) 100, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, (-1));
        int int26 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1a10a1a-1a100i!   hi! hi!1.0 0.0            ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                             hi!hi!                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a100a100" + "'", str13, "-1a10a100a100");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100a1a0a100a52a-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("!ih !ih   ", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, 1.0d, (double) 817L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2443, (float) 0L, 300.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2443.0f + "'", float3 == 2443.0f);
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 909, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (byte) 0, (double) (-1.41041039E14f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a-1a-1a-1a1" + "'", str12, "10a-1a-1a-1a1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-14-14-141" + "'", str14, "104-14-14-141");
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10a0a10a100a1100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1", 4768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4768 + "'", int2 == 4768);
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', (int) (byte) 100, (int) (byte) 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("class [Ljava.lang.CharSequence;class [Sclass [S", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1a.a0a a0a.a0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 10, 1164, 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1164 + "'", int3 == 1164);
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 186L, (-1.41041038524416E14d), (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 186.0d + "'", double3 == 186.0d);
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1004-14141041" + "'", str13, "1004-14141041");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("!ih !ih  Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih !ih  Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                            1.0 0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (byte) 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97 1 -1 1 100 10" + "'", str13, "97 1 -1 1 100 10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97#1#-1#1#100#10" + "'", str15, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 1164, (int) (byte) 0);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97414-1414100410" + "'", str11, "97414-1414100410");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) (byte) 100, (int) (short) -1);
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!   hi! hi!1.0 0.0", (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 300, (int) (byte) 100);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97a1a-1a1a100a10" + "'", str9, "97a1a-1a1a100a10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97a1a-1a1a100a10" + "'", str12, "97a1a-1a1a100a10");
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH...", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               10A0A10A100A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a444#4#4a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        int[] intArray2 = new int[] { '#', (byte) -1 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (short) 0, 2443);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi !     hi !   hi ! hi !     hi !   hi ! hi !     hi !   hi ! hi !     hi !   hi ! hi !     hi !   hi ! hi !     hi !   hi ! hi !     hi !   hi ! hi !     hi !   hi ! hi !     hi !   hi ! hi !     hi !   hi !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (short) 100, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, 1.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(2443, 4768, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4768 + "'", int3 == 4768);
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100 100 1 -1 1 -1", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH...100 -1 1 1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 100, (double) (byte) -1, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("52-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (int) (byte) 10, (int) (byte) -1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 797, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) '4', 813);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97414-1414100410" + "'", str11, "97414-1414100410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97#1#-1#1#100#10" + "'", str13, "97#1#-1#1#100#10");
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (short) 1, (int) (short) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', 1164, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4', (int) (byte) 1, 0);
        double double21 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double22 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double23 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double24 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 900, (double) 300, (double) 186);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 186.0d + "'", double3 == 186.0d);
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 1, (byte) -1, (short) 1, (short) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 100, (-1));
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 1, -1, 1, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#100#1#-1#1#-1" + "'", str8, "100#100#1#-1#1#-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1004100414-1414-1" + "'", str10, "1004100414-1414-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.Class<?> wildcardClass15 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a100a100" + "'", str13, "-1a10a100a100");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2443, (double) (-1), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2443.0d + "'", double3 == 2443.0d);
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a10a1" + "'", str13, "100a-1a1a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a-1a1a10a1" + "'", str15, "100a-1a1a10a1");
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(100.0f, (-1.41041039E14f), (float) 909L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.41041039E14f) + "'", float3 == (-1.41041039E14f));
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#-1#-1#1" + "'", str12, "10#-1#-1#-1#1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a-1a-1a-1a1" + "'", str19, "10a-1a-1a-1a1");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...i!100 1 0 100 52 -1hi!   hi! ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 358, (double) 0L, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 817, 100);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0#0.0" + "'", str11, "1.0#0.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("!ih!ih!ih!ih!ih!ih!ih01i001i1i1-i1i79hII4h4I4hII4!H4!h", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 100, 0);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100#100#1#       !ih!ih!ih!ih!ih!ih!ih       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100#100#1#       !ih!ih!ih!ih!ih!ih!ih        is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 1, (-1));
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100#1#0#100#52#-1" + "'", str16, "100#1#0#100#52#-1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      -1a10a100a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a10a100a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 0, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#-1#1#10#1" + "'", str12, "100#-1#1#10#1");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1.00.0Hi!hi!hi!1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1.0f, (float) 4768, (float) 909L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4768.0f + "'", float3 == 4768.0f);
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1                               hi!hi!hi!1.00.0                                          hi!hi!   hi! hi!hi!   hi! hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100#100#1#-!IH !IH   !IH!IH !IH   !IH!IH 100#100#1#-", 2443);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2443 + "'", int2 == 2443);
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        short[] shortArray4 = new short[] { (short) 0, (short) 0, (byte) 0, (byte) 10 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0#0#0#10" + "'", str7, "0#0#0#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("414041004524-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 797, (int) (short) 1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a-1a-1a-1a1" + "'", str12, "10a-1a-1a-1a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1a10a100a100" + "'", str19, "-1a10a100a100");
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 1253, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0#0.0" + "'", str6, "1.0#0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 1, (-1));
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 1 0 100 52 -1" + "'", str14, "100 1 0 100 52 -1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100#1#0#100#52#-1" + "'", str16, "100#1#0#100#52#-1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Hii4H4i4Hii4!h4!H");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi! h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, (double) 'a', (double) 358);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 358.0d + "'", double3 == 358.0d);
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', 0, (int) (byte) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (short) 0, (-1));
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#');
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#35.0#-1.0#-1.0" + "'", str19, "1.0#35.0#-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 813, 3145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', (int) (short) -1, 1253);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100414041004524-1" + "'", str11, "100414041004524-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#100#52#-1" + "'", str13, "100#1#0#100#52#-1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a1a0a100a52a-1" + "'", str17, "100a1a0a100a52a-1");
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 4768, (long) ' ', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 186, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) '4', (int) (byte) 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 0.0" + "'", str5, "1.0 0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("i! hi! hi!1.0 0.0hi!   hi! hi!1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hia!aahia!aahia!a1a.a0aa0a.a0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hia!aahia!aahia!a1a.a0aa0a.a0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100#100#1#-!IH !IH   !IH!IH !IH   !IH!IH 100#100#1#-", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#97");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', (int) (byte) 100, (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#-1#1#10#1" + "'", str17, "100#-1#1#10#1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), 300, 797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 797 + "'", int3 == 797);
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(763, 0, 575);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (byte) 100, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("!IH !IH   !IH!IH !IH   !IH!IH ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test16197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16197");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (byte) 100, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 100, 358);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16199");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 -1 -1 -1 1" + "'", str11, "10 -1 -1 -1 1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test16200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16200");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4768, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4768 + "'", int3 == 4768);
    }
}

