package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09001");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.04-1.04-1.0432.04100.04-1.0" + "'", str16, "-1.04-1.04-1.0432.04100.04-1.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09002");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                            4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09003");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, 0, 360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360 + "'", int3 == 360);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09004");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str12, "0.0#100.0#1.0#-1.0#1.0#100.0");
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09005");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32a0a52" + "'", str7, "32a0a52");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3240452" + "'", str9, "3240452");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09006");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44.1-40.00140.2340.1-40.1-40.1--1.04-1.04-1.0432.04100.04-1.04444.1-40.00140.234", (double) 4596);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4596.0d + "'", double2 == 4596.0d);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09007");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1001, 483);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 380, 1);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 136, 51);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09008");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 80, 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str20, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09009");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) 386);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 386L + "'", long2 == 386L);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("2######");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2######\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09011");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a0a100a1a11-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a0a100a1a           444-1.0#-1                      444-1.0#-1                      444-1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09012");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0a1.0...                                                                                          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.                                                                                                                                                                                                                                                                                                                                                                                            ", 904);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 904 + "'", int2 == 904);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09013");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 520, 250.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 520.0f + "'", float3 == 520.0f);
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09014");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', (int) (short) 0, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', (int) '4', (int) (short) 10);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 10, 0);
        double double24 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double25 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09015");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(4596L, (long) 471, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4596L + "'", long3 == 4596L);
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09016");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09017");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 383, 1103.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1103.0d + "'", double3 == 1103.0d);
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09018");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                        .1-#0.001#0.23#0.1-#0.1-#0.1-4440.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-44400140.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-444140.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-4441.1-#0.001#0.23#0.1-#0.1-#0.1-444-.1-#0.001#0.23#0.1-#0.1-#0.1-44440.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-444140.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-44400140.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-4440AA A#A#AAAAAA A#A#.0A0.01A0.1A0.001A A#A#AAAAAA A#A#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1#0.1-#4155.54-1.54444.1-45.55145.4445.1-45.1-45.1-11#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1#0.1-#4155.54-1.54444.1-45.55145.4445.1-45.1-45.1-11#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09020");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                        ####a###a########################################                                                  ####a###a########################################                                                  ####a###a########################################                                                  ####a###a###################################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09021");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str15, "0.0a100.0a1.0a-1.0a1.0a100.0");
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09022");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 361, 192);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.041.0410.040.0" + "'", str9, "100.041.0410.040.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.0#-1.0#1.0#-1.0#1.0#1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0#-1.0#1.0#-1.0#1.0#1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09024");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str15, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09025");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 910, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 910L + "'", long3 == 910L);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09026");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 10, (int) (short) -1);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09027");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1 100 0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...                                                                                                                                                                                                                                                                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...                                                                                                                                                                                                                                                                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09029");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(251, (int) (byte) 0, 183);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 251 + "'", int3 == 251);
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09030");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', (int) (byte) 100, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 951, (int) (byte) -1);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32#0#52" + "'", str17, "32#0#52");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09031");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09032");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa---a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa--a-a-aaa-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09033");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1 100 0", (double) 3240452.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3240452.0d + "'", double2 == 3240452.0d);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09034");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 1001, 80);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09035");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("97.14111.143.21141111E9435.144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21444-1.0-1.0-324-14-14100410432-1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21444-1.0-1.0-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21444-1.0-1.0-324-14-14100410432-1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21444-1.0-1.0-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09037");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 324, (double) 292, (double) 1103L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1103.0d + "'", double3 == 1103.0d);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09038");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1504L, (double) 235.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09039");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09040");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(835.0d, (double) '#', 457.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09041");
        int[] intArray3 = new int[] { 92, 10, (byte) 1 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[92, 10, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "92a10a1" + "'", str5, "92a10a1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "92#10#1" + "'", str7, "92#10#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 92 + "'", int8 == 92);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "92a10a1" + "'", str11, "92a10a1");
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09042");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a a 4 4   A A A0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ################################################################################################################################################################################################################################################################################################0a.a04100a.a041a.a04a-a1a.a041a.a04100a.a", (long) 269);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 269L + "'", long2 == 269L);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09043");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str16, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09044");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".a.a-.", (double) 239);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 239.0d + "'", double2 == 239.0d);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(".0.0.00.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0.0.00.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09046");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                              32a0a52                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09047");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 1 10 1 ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09048");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 0, 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09049");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.Class<?> wildcardClass9 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09050");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 172L, 1479425.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09051");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) (byte) 1, 183);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str15, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.04-1.04-1.0432.04100.04-1.0" + "'", str17, "-1.04-1.04-1.0432.04100.04-1.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09052");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 0, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str15, "0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09053");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 507, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 172, 195);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 172");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09054");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                         25 0 23-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#10                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09055");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str12, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                             .-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                             04100-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.03...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                             .-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                             04100-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.03...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09057");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444444444441001", (long) 131);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131L + "'", long2 == 131L);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09058");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 483, 457);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 383, 262);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str14, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str25, "0.04100.041.04-1.041.04100.0");
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09059");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("32A0A52");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09060");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                              0#0.1-#.0                                             0.001#0.1#0.1-#0.1#0.001#0.0.1-#0.001#0.23#0.1-#0.1-#0.1-", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09061");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 509, (float) 365, (float) 1385);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 365.0f + "'", float3 == 365.0f);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09062");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1. ######.0#-1.0#32.0#100.0#-1. #-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-14#4#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09063");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 32, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 32 + "'", short3 == (short) 32);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09064");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 483, 457);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 383, 262);
        double double24 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str14, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09065");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("   -1.    ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09066");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(588, 248, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09067");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                             32A0A52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09068");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09069");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4', 665, 191);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a0a0a0" + "'", str10, "1a0a0a0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09070");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09071");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 550, 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32a0a52" + "'", str13, "32a0a52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32a0a52" + "'", str19, "32a0a52");
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09072");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 188, (long) 386, (long) 191);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 188L + "'", long3 == 188L);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09073");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                        a0a.a00140a.a140a.a1a-a40a.a140a.a00140a.a0", (long) 338);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 338L + "'", long2 == 338L);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09074");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ', (int) '#', (int) (byte) 0);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a', 163, 457);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 163");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 0 0 0" + "'", str17, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09075");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09076");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 1, (int) (byte) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09077");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 198, (int) (short) 10);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 10 + "'", byte19 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09078");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1A32A0A52A10A10 9752 97 97299 9752 32");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1A32A0A52A10A10 9752 97 97299 9752 32");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#1" + "'", str12, "10#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a1" + "'", str18, "10a1");
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09079");
        float[] floatArray0 = new float[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray0, ' ', 100, (int) 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09080");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10#1-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#30.04100.041.04-1.041.04100.0                     ..10#1-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09081");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa3240452aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4-1.04-1.0432.04100.04-1.44440.1-40.00140.2340.1-40.1-40.1--1.04-1.04-1.0432.04100.04-1.44444-1.04-1.04-1.0432.04100.04-1.44444444444444444444444444444444444444444444444444444444444444444444444-1.04-1.04-1.0432.04100.04-1.44440.1-40.00140.2340.1-40.1-40.1--1.04-1.04-1.0432.04100.04-1.44444-1.04-1.04-1.0432.04100.04-1.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09082");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 380, 137);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (byte) 10, (-1));
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 457, (int) ' ');
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte27 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 1" + "'", str17, "10 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 10 + "'", byte26 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 10 + "'", byte27 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10 1" + "'", str29, "10 1");
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09083");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str10, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 -1.0 -1.0 32.0 100.0 -1.0" + "'", str12, "-1.0 -1.0 -1.0 32.0 100.0 -1.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09084");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-143240452410410" + "'", str11, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 32 0 52 10 10" + "'", str14, "-1 32 0 52 10 10");
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09085");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 137, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "100.0#1.0#10.0#0.0                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 100.0#1.0#10.0#0.0                                                                                 ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09086");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("52 97 1000A1.0A-1.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("32#0#5232#-1#-1#100#10#32                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32#0#5232#-1#-1#100#10#32                           \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 1 0 974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 1 0 974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09089");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0#1.0#10.0#0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09090");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                           a4a4a4 4444                                           ", 196.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 196.0d + "'", double2 == 196.0d);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09091");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 188, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str11, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09092");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(137L, 3210110L, (long) 251);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 137L + "'", long3 == 137L);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09093");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("      a a a#############################################################################################################################################################################################################################################32 -1 -1 100 10 32383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 10138", 250L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 250L + "'", long2 == 250L);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09094");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09095");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("32#0#5                                                                                                                                                                                         520.0#100.0#1.0#-1.0#1.0#1a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09096");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float19 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 196, 339);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 196");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str15, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str18, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09097");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 233, 411);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 233");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09098");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("97.14111.143.21141111E9435.144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09099");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09100");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 0, 1103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09101");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str15, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str18, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str21, "0.0a100.0a1.0a-1.0a1.0a100.0");
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09102");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10#1" + "'", str14, "10#1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a1" + "'", str17, "10a1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09103");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 507, 100);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 10 1 100" + "'", str16, "10 1 10 1 100");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09104");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 172, (double) 222L, (double) 342L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 342.0d + "'", double3 == 342.0d);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09105");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(289, (int) 'a', 222);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09106");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 230, (int) (byte) -1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09107");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#32.1#32.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#32.1#32.1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09109");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 583, (int) (short) 1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09110");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ', (int) '#', (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray4, '#', 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "3210 110 1a3210 110 13210 110 1a3210 110 13210 110 1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 3210 110 1a3210 110 13210 110 1a3210 110 13210 110 1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09111");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("25 0 23", (float) 152);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 152.0f + "'", float2 == 152.0f);
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09112");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(51, 0, 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 119 + "'", int3 == 119);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09113");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 126, (long) 131, (long) 550);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 126L + "'", long3 == 126L);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09114");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.Class<?> wildcardClass7 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09115");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32 0 52" + "'", str14, "32 0 52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09116");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09118");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 318, 1L, 172L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 318L + "'", long3 == 318L);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09119");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09120");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 364, 101.0f, (float) 322L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09121");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 32, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09122");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi#97#.#04100#.#043#.#21041101#E#9435#.#0#!#32#A#0#A#5");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09123");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444", 242);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 242 + "'", int2 == 242);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09124");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("3210411...444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-32#0#50.04100.041.04-1.041.04100.0                                                                        ", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                       ##########################################################04.4041004.40414.4044-414.40414.4041004.40aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##########################################################04.4041004.40414.4044-414.40414.4041004.40aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09126");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 10, (int) (short) -1);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long22 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "32 -1 -1 100 10 32" + "'", str21, "32 -1 -1 100 10 32");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09127");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                -1-..-1111", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a101370.0#100.0#-1a32a0a52a10a10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09129");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str15, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09130");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("7925.0#.0#.0##0#.0#10 1 10 1 100                                                                 0.0#100.0#1.0#-1.0#1.0#1..0A1A100", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09131");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2090, (float) 51L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2090.0f + "'", float3 == 2090.0f);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09132");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 242.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 242.0d + "'", double3 == 242.0d);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4 4   a a a0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 4   a a a0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09134");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(583, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09135");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0 . 04100 . 041 . 04 - 1 . 041 . 04100 . 0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09136");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 364, 454);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 364");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4-1.0#32.0#100.0#-1.0                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4-1.0#32.0#100.0#-1.0                                                                                                                                                                                                                  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09138");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(910, 457, 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 910 + "'", int3 == 910);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09139");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09140");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09141");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09142");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 673, 248.0d, 1001.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1001.0d + "'", double3 == 1001.0d);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09143");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) 'a', 92);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 100, 195);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a1a10a1a100" + "'", str15, "10a1a10a1a100");
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09144");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#...97.0#100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09145");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32 -1 -1 100 10 32" + "'", str11, "32 -1 -1 100 10 32");
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09147");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi97.04100.043.21041101E9435.0!32A0A5204 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A044 4 A A A-4 4 A A A14 4 A10#1-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0                                                    00                    .0#.0#.0##0#.4 4 A A A041004 4 A A A.4 4 A A A04 4 A A A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09148");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a100101 1 0 9732-1.0#32.0#100.0#-1.#######################################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09149");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaa1041aaa A A   4 4", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09150");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1 0 0 0...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09151");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("########################################                          a###a                        ####");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09152");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#######################################################################################################04 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A044 4   A A A-4 4   A A A14 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A04 4   A A A                                                                        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09153");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1041#1 1 0 97#1041#1 132101523212-12-1-001-0132                           1041#1 1 0 97#1041#1 1 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09154");
        long[] longArray3 = new long[] { '4', 'a', 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 97, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 97 100" + "'", str5, "52 97 100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52 97 100" + "'", str9, "52 97 100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09155");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 562, 7925);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 562");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str14, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str16, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str18, "0.0#100.0#1.0#-1.0#1.0#100.0");
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09156");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '4', 101.0d, (double) 386L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 386.0d + "'", double3 == 386.0d);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09157");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09158");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09159");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#1" + "'", str12, "10#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09160");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 321041104, 101L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 321041104L + "'", long3 == 321041104L);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09161");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 7925, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 7925 + "'", short3 == (short) 7925);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09162");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, 195, 189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 195 + "'", int3 == 195);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09163");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09164");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("104144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4 4 4 4 4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 4 4 4 4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09166");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a1a10a1a100" + "'", str8, "10a1a10a1a100");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a1a10a1a100" + "'", str11, "10a1a10a1a100");
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09167");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 0 0 0" + "'", str8, "1 0 0 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1404040" + "'", str10, "1404040");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 0 0 0" + "'", str12, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09168");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 158, 251);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 158");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09169");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09170");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.", 368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 368 + "'", int2 == 368);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09171");
        float[] floatArray6 = new float[] { (byte) 0, 'a', 10, 507, 507L, 1001 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 606, 261);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 97.0, 10.0, 507.0, 507.0, 1001.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1001.0f + "'", float7 == 1001.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09172");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3.21041088E8f, (double) 3240452L, (double) 185L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 185.0d + "'", double3 == 185.0d);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09173");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 342, 105.0f, (float) 249);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 105.0f + "'", float3 == 105.0f);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09174");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("444-1.0#-1                      444-1.0#-1                      444-1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a100a0a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a11-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a100a0a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09175");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray4, '#', 0, 835);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09176");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0d), (double) 915, (double) 673);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09177");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) 32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09178");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a1.0a32#0#5111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09179");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09180");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                             32a0a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09181");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaa0aaaaaaaaaa0a   a a a a  a a aaaaa0aaaaaaaaaa0aa 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a", 261);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 261 + "'", int2 == 261);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09182");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0 A A  A A  A A AA A   A A  A000000000000000000000000000000000000000000000000000000000000000000000000-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0-1.0#-1.0#1.0A1.0A-1.0", 562);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 562 + "'", int2 == 562);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####444444444444444444444444444444444444444444444444444444444444444441-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.44444444444444444444444444444444444444444444444444444444444444444.1-30.00130.2330.1-30.1-30.1-444.02.02-.1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####444444444444444444444444444444444444444444444444444444444444444441-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1. 1 0 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####444444444444444444444444444444444444444444444444444444444444444441-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.44444444444444444444444444444444444444444444444444444444444444444.1-30.00130.2330.1-30.1-30.1-444.02.02-.1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####444444444444444444444444444444444444444444444444444444444444444441-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1. 1 0 97\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09184");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" #a #a  000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   01001## #A#A#A000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" #a #a  000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   01001## #A#A#A000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0000000   0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09186");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(550, 509, 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 137 + "'", int3 == 137);
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09187");
        double[] doubleArray6 = new double[] { 0L, (-1L), (byte) 1, (-1L), (short) 1, (short) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', (int) '4', (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 0, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, -1.0, 1.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0 -1.0 1.0 -1.0 1.0 1.0" + "'", str16, "0.0 -1.0 1.0 -1.0 1.0 1.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09188");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 1 100 0 1", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09189");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                        a1.0a-1.0 a a  a a  a a aa a   a a  a000000000000000000000000000000000000000000000000000000000000000000000000.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09190");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.4141004041E10d), (double) 483L, 172.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 483.0d + "'", double3 == 483.0d);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09191");
        double[] doubleArray3 = new double[] { 1, 1L, (-1L) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 657, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0a1.0a-1.0" + "'", str5, "1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09192");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(126L, (long) 1286, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1286L + "'", long3 == 1286L);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09193");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(".04.04.04404.04");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09194");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0011#.#0#A#1#.#0#A#-#1#.#0791#.#0#A#1#.#0#A#-#1#.#025", (double) 101.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.0d + "'", double2 == 101.0d);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09195");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (long) 368);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 368L + "'", long2 == 368L);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09196");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(222, 73, 172);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 222 + "'", int3 == 222);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09197");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#   4", (float) 93);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 93.0f + "'", float2 == 93.0f);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09198");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 383, (long) 606, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 606L + "'", long3 == 606L);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09199");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09200");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1 100 0", 422);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 422 + "'", int2 == 422);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09201");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 97.#.40..#.40#.4.0#.40#.40..#.00 0 . 97052 97 1000A1.0A-1.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09202");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09203");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4 4   A A A0444-1.0#-1.0#-1.0#32", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09204");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...       ", (float) 368);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 368.0f + "'", float2 == 368.0f);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09205");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 2450, (long) 835, (long) 457);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 457L + "'", long3 == 457L);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09206");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(509.0d, (double) 0, (double) 454);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 509.0d + "'", double3 == 509.0d);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09207");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09208");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1001, 483);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09209");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4.4041004.40414.4044-414.40414.4041004.4097.04100.043.21041101E9435.0-1.0a-1.0a-1.0a32.0a100.0a-1.004 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A044 4   A A A-4 4   A A A14 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A04 4   A A A                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09210");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09211");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 -1.0#-1.0#-1.0#32.0#100.0#-1.            32#0#50.1-444.0a.0a-.#0.1-#0.1-#0.23#0.001#aaaa44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09212");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a1.0a32#0#5111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                   444-1.0#-1.0#-1.0#32.0#100.0#-1                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                    444-1.0#-1.0#-1.0#32.0#100.0#-1                                    is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09214");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (byte) -1, 332);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09215");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4 4   A A A0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09216");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("97.0#100.0#3.21041101E9#35.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09217");
        float[] floatArray6 = new float[] { (byte) 0, 'a', 10, 507, 507L, 1001 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 97.0, 10.0, 507.0, 507.0, 1001.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1001.0f + "'", float7 == 1001.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0 97.0 10.0 507.0 507.0 1001.0" + "'", str9, "0.0 97.0 10.0 507.0 507.0 1001.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0 97.0 10.0 507.0 507.0 1001.0" + "'", str11, "0.0 97.0 10.0 507.0 507.0 1001.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0497.0410.04507.04507.041001.0" + "'", str13, "0.0497.0410.04507.04507.041001.0");
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09218");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str9, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str11, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str13, "100.0 1.0 10.0 0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.041.0410.040.0" + "'", str15, "100.041.0410.040.0");
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09219");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 93, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 288, (-1));
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str7, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100.041.0410.040.0" + "'", str19, "100.041.0410.040.0");
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                        hi97.04100.043.21041101E9435.0!.hi97.04100.043.21041101E9435.0!04hi97.04100.043.21041101E9435.0!.hi97.04100.043.21041101E9435.0!04hi97.04100.043.21041101E9435.0!.hi97.04100.043.21041101E9435.0!04404hi97.04100.043.21041101E9435.0!.hi97.04100.043.21041101E9435.0!04                                                                                                                                                                                                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi97.04100.043.21041101E9435.0!.hi97.04100.043.21041101E9435.0!04hi97.04100.043.21041101E9435.0!.hi97.04100.043.21041101E9435.0!04hi97.04100.043.21041101E9435.0!.hi97.04100.043.21041101E9435.0!04404hi97.04100.043.21041101E9435.0!.hi97.04100.043.21041101E9435.0!04\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09221");
        long[] longArray3 = new long[] { '4', 'a', 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 10, 0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 97, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 97 100" + "'", str5, "52 97 100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52 97 100" + "'", str9, "52 97 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09222");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(454, (int) (byte) 100, 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09223");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09224");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("      a a a#####################################################################################################################################################################################################################################################################################################################################################################0a.a04100a.a041a.a04a-a1a.a041a.a04100a.a0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09225");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -1.0 1.0-1.0 1.0 -   -1.0--1.0--1.0-01.0-100.0--", 2450.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2450.0f + "'", float2 == 2450.0f);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09226");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...                                                        .1-45.55145.4445.1-45.1-45.1-44444.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1.1-#0.001#0.23#0.1-#0.1-#0.1-#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-#.11#1-1-#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09227");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(835.0f, (float) 190, 368.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 835.0f + "'", float3 == 835.0f);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09228");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 242, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09229");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09230");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 105L, (float) 289L, (float) 507);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09231");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1001, 483);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09232");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str13, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str16, "0.0a100.0a1.0a-1.0a1.0a100.0");
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09233");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".#a.#a-.", 324.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 324.0d + "'", double2 == 324.0d);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09234");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100.0A1.0A10.0A0.0                                                                                                                                      ", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09235");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 32, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09236");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  -1.0#-1.0#-1.0#32.0#1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09237");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', (int) (byte) 100, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 361, 101);
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 411, 572);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 411");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32a0a52" + "'", str17, "32a0a52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09238");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 332, (int) (byte) 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.041.0410.040.0" + "'", str13, "100.041.0410.040.0");
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09240");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 7925, 368.0f, 101.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09241");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09242");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("104144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-44A-1.0A-1.0A32.0A100.0A-1.0", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09243");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("# #4#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# #4#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09244");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(565, 192, 844);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 844 + "'", int3 == 844);
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09245");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 10, (int) (byte) 1);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float22 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float23 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float24 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float25 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str16, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str27, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09246");
        long[] longArray1 = new long[] { 137 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 80, 309);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[137]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 137L + "'", long3 == 137L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 137L + "'", long4 == 137L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09247");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(904.0f, 2090.0f, (float) 844);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 844.0f + "'", float3 == 844.0f);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09248");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 250L, (float) 185, (float) 483L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 483.0f + "'", float3 == 483.0f);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09249");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 261, (double) 904.0f, (double) 288);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 904.0d + "'", double3 == 904.0d);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09250");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(321041104, 262, 507);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 321041104 + "'", int3 == 321041104);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09251");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 338);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 338.0d + "'", double2 == 338.0d);
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09252");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("##########################################################################################################################################1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                    ##########################################################################################################################################", 515);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 515 + "'", int2 == 515);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09253");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', (int) (byte) 10, 1365);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09254");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09255");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 835, (long) (short) 100, 904L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 904L + "'", long3 == 904L);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09256");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0a1" + "'", str6, "0a1");
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09257");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("37137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137137");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.713713713713714E151d + "'", double1 == 3.713713713713714E151d);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09258");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09259");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32a0a52" + "'", str7, "32a0a52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09260");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09261");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 198, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32#0#52" + "'", str16, "32#0#52");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32a0a52" + "'", str18, "32a0a52");
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09262");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09263");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a a 4 4   A A A0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ################################################################################################################################################################################################################################################################################################0a.a04100a.a041a.a04a-a1a.a041a.a04100a.a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09264");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 507, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09265");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, 606, 700);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09266");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#0.1-#0.1-a0.1a                                                                  0011#.#0#a#1#.#0#a#-#1#.#0791#.#0#a#1#.#0#a#-#1#.#025");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09267");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 904.0f, (double) 1365.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1365.0d + "'", double3 == 1365.0d);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09268");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(483L, (long) 250, (long) 4596);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4596L + "'", long3 == 4596L);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09269");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09270");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(162, 515, 261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 515 + "'", int3 == 515);
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09271");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(509, 368, 483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 368 + "'", int3 == 368);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09272");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09273");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("97.04100.043.21041101E9435.0-1.0a-1.0a-1.0a32.0a100.0a-1.004 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A044 4   A A A-4 4   A A A14 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A04 4   A A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####97.04100.043.21041101E9435.0-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09274");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(458, 249, 588);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 249 + "'", int3 == 249);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09275");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str17, "0.0 100.0 1.0 -1.0 1.0 100.0");
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09276");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 196, (int) (byte) 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str14, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str23, "0.0 100.0 1.0 -1.0 1.0 100.0");
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09277");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09278");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(504, 318, 339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 318 + "'", int3 == 318);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09279");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 100, 92);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        java.lang.Class<?> wildcardClass20 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09280");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                   5 0 23");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0 1                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09282");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3240452" + "'", str8, "3240452");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09283");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 454, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09284");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!32#0#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09285");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 0, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str15, "0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09286");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09287");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 357, 288);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str14, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09289");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444 4a4a4a444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09290");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09291");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) 262, (double) 364.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 364.0d + "'", double3 == 364.0d);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09292");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 1001, 80);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09293");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 -1.0#-1.0#-1.0#32.0#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 1103.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1103.0d + "'", double2 == 1103.0d);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09294");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 368, (double) 357.0f, (double) 240L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 368.0d + "'", double3 == 368.0d);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09295");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09296");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                32#a#5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09297");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(261, 0, 454);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09298");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 251.0f, (double) 1103.0f, (double) 126L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1103.0d + "'", double3 == 1103.0d);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09299");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, (int) (byte) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 10, 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09300");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10a11097", (double) 457L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 457.0d + "'", double2 == 457.0d);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09301");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444-1                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09302");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09303");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                        32104110");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.210411E7d + "'", double1 == 3.210411E7d);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09304");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(105L, 100L, (long) 80);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 105L + "'", long3 == 105L);
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09305");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 338, (double) 17925, 250.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 250.0d + "'", double3 == 250.0d);
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09306");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) 10, (int) (byte) -1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041" + "'", str14, "1041");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10 1" + "'", str20, "10 1");
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09307");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 7925, (long) 562);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7925L + "'", long3 == 7925L);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09308");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 126L, 196L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09309");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###############################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09311");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 0 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa1 1 0 97100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                       10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa1 1 0 97100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                       10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09312");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                         -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09313");
        int[] intArray3 = new int[] { (byte) 10, 10, (short) -1 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 0, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, -1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10a10a-1" + "'", str5, "10a10a-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#10#-1" + "'", str7, "10#10#-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09314");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', 162, 360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360 + "'", int3 == 360);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441.0a1.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09316");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a-1.0a-1.0a32.0a100.0a-1.03-1.0a-1.0a-1.0a32.0a100.0a-1.02-1.0a-1.0a-1.0a32.0a100.0a-1.01-1.0a-1.0a-1.0a32.0a100.0a-1.00-1.0a-1.0a-1.0a32.0a100.0a-1.04-1.0a-1.0a-1.0a32.0a100.0a-1.01-1.0a-1.0a-1.0a32.0a100.0a-1.01-1.0a-1.0a-1.0a32.0a100.0a-1.0.-1.0a-1.0a-1.0a32.0a100.0a-1.0.-1.0a-1.0a-1.0a32.0a100.0a-1.0.-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09317");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09318");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 137, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1" + "'", str13, "10 1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444-1.0#-1.0#-1.0#32.0#100.0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444-1.0#-1.0#-1.0#32.0#100.0#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09320");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32a-1a-1a100a10a32" + "'", str15, "32a-1a-1a100a10a32");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09321");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#-1.0#32.0#100.0#-1.###10a10a-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09322");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 339, 0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09323");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("9241041", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09324");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09325");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str17, "100.0 1.0 10.0 0.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str20, "100.0#1.0#10.0#0.0");
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09326");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444.#.40..#.40#.4.0#.40#.40..#.000.974444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09327");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(51, 0, 711);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 711 + "'", int3 == 711);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09328");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09329");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1-                                                                                          ...0.1a0.1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09330");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1353L, 92L, (long) 665);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 92L + "'", long3 == 92L);
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09331");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 657, (long) 334, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09332");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1. ...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09333");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##############################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444254#4# #A#A#A04#4# #A#A#A23", 915L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 915L + "'", long2 == 915L);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09334");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0#0.1-#.0                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0#0.1-#.0                                                                                                                                                                                            is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09336");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(550L, 0L, 322L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 550L + "'", long3 == 550L);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                    \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09338");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', 93, 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 4596, (int) ' ');
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long22 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09339");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041" + "'", str14, "1041");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a1" + "'", str16, "10a1");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09340");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 198, (int) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 195, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10 1" + "'", str24, "10 1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09341");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 126);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126 + "'", int2 == 126);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09342");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#0#52" + "'", str8, "32#0#52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3240452" + "'", str10, "3240452");
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09343");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 0, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 360, 322);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str15, "0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09344");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 17925, 2090);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09345");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, 51L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09346");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("545.55145.1-4-1.4155.54.54-1.54-1.54#-1.0#1-1.545.55145.1-4-1.4155.54.54-1.54-1.541-1.5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09347");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', 0, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09348");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 195, 195);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double23 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 131, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 134, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 134");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str20, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str22, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09349");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 342, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 1286, 88);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09350");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) 7925);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09351");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 936, (float) 583L, 2090.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2090.0f + "'", float3 == 2090.0f);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09352");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) -1, (short) 32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09353");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(172L, (long) 910, 332L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 910L + "'", long3 == 910L);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09354");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 383L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 383L + "'", long2 == 383L);
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09355");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.#-1.0#04444444444444444444444444444444444444444444444444444444444444444444 4A4A4A444444444444444444444444444444444444444444444444444444444444444 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09356");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 188, 127);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#1#10#1#100" + "'", str17, "10#1#10#1#100");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09357");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-1...0a1a1003210411041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09358");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 126, 188.0f, (float) 562);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 562.0f + "'", float3 == 562.0f);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09359");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 1 10 1 100" + "'", str9, "10 1 10 1 100");
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09360");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 127, 0);
        java.lang.Class<?> wildcardClass13 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09361");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(3240452.0d, 0.0d, (double) 951);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09362");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (short) 1, (int) (byte) -1);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 0, 906);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09363");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 951, (float) 262, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09364");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 342, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09365");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (short) 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str7, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str13, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97.0 100.0 3.21041101E9 35.0" + "'", str15, "97.0 100.0 3.21041101E9 35.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97.0#100.0#3.21041101E9#35.0" + "'", str17, "97.0#100.0#3.21041101E9#35.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 3.21041101E9f + "'", float18 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str20, "97.04100.043.21041101E9435.0");
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1#0#0#0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#0#0#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09367");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str7, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97.0#100.0#3.21041101E9#35.0" + "'", str9, "97.0#100.0#3.21041101E9#35.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97.0 100.0 3.21041101E9 35.0" + "'", str11, "97.0 100.0 3.21041101E9 35.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09368");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                  0.0 100...                                                                                                                                                                                                                                                                                                                                                                                 0.0 100...                                                                                                                                                                                                                                                                                                                                              ###################################################################HI!###################################################################", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09369");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 365, 240L, 4596L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 240L + "'", long3 == 240L);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09370");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 80, (long) 906, (long) 568);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 906L + "'", long3 == 906L);
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09371");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("52 9752 9752 97 97299 9752 -1.0#-1.0#-1.0#32.0#100.0#-1.#####################   -1.0--1.0--1.0-01.0-100.0--                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09372");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#100.0#-1.###4444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#100.0#-1.###4444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09374");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09375");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09376");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1001, 483);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 380, 1);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 628, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 127, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09377");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 261, 198.0f, (float) 235);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 198.0f + "'", float3 == 198.0f);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09378");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', (-1), 904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09379");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 105, 0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(".04.04.044a1.0a-1.0          ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".04.04.044a1.0a-1.0          ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09381");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("444529752975297972999752-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 198);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 198 + "'", int2 == 198);
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09382");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#1#10#1#100", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09383");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Aa10a10a-1Aa10a10a-1Aa10a10a-1Aa10a10a-1Aa10a10a-1Aa10a10a-1Aa10a10a-1Aa10a10a-1Aa10a10a-1Aa10a10a-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".04100.041.04-1.041.04100.0aaa1041aaa.04100.041.04-1#a#a aaaaaa#a#a a100.0a1.0a10.0a0.#a#a aaaaaa#a#a aa#####################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09385");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09386");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09387");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 342, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, 0);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09388");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 195, 195);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double23 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str20, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str22, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str25, "0.0 100.0 1.0 -1.0 1.0 100.0");
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09389");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09390");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a1.0a32#0#5111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1.0a32#0#5111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09392");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-143240452410410" + "'", str11, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-143240452410410" + "'", str14, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09393");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) -1, (short) 7925);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 7925 + "'", short3 == (short) 7925);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09394");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(" 4 4  4 4  4 4 44 4   4 4  4000000000000000000000000000000000000000000000000000000000000000000000000", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09395");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 32, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09396");
        long[] longArray3 = new long[] { '4', 'a', 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 198, (int) (short) -1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 97, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 97 100" + "'", str5, "52 97 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09397");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                         -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09398");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("A                                                                                          A                                                                                       A4A4A4 4444################################3205");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09399");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("##########################################################################################################################################1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                    ######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09400");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 332, (int) (short) -1);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str21, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str23, "0.0a100.0a1.0a-1.0a1.0a100.0");
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09401");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(136.0f, 1.0f, 2090.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09402");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 844, 1286);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 844");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09403");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551451001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001#-1.0#1-1.54-1.54-1.5444.54155.54-1.44445.1-45.5514");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09404");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 262, 190);
        java.lang.Class<?> wildcardClass14 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09405");
        short[] shortArray5 = new short[] { (byte) -1, (short) 1, (byte) 100, (short) 0, (short) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', (int) '#', 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 1, 100, 0, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#1#100#0#1" + "'", str7, "-1#1#100#0#1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1a100a0a1" + "'", str9, "-1a1a100a0a1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-14141004041" + "'", str12, "-14141004041");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09406");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4a4a aaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09407");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(251.0f, (float) 1001, (float) 951);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 251.0f + "'", float3 == 251.0f);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09408");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 711, (double) 835, (double) 361.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 835.0d + "'", double3 == 835.0d);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09409");
        double[] doubleArray6 = new double[] { 0L, (-1L), (byte) 1, (-1L), (short) 1, (short) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', (int) '4', (int) (byte) -1);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 509, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, -1.0, 1.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0#-1.0#1.0#-1.0#1.0#1.0" + "'", str17, "0.0#-1.0#1.0#-1.0#1.0#1.0");
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09410");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09411");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1001, 483);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 380, 1);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09412");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.041.0410.040.0" + "'", str9, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09413");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32a0a52" + "'", str13, "32a0a52");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32a0a52" + "'", str15, "32a0a52");
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09414");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("class [Ljava.lang.String;aclass [Baclass [Ljava.lang.String;aclass [Ljava.lang.String;aclass [Baclass [Ljava.lang.String;", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09415");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(910.0f, (float) 10, (float) 162);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09416");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#14-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#14-1.0#-1.0#-1.0#32.0#14-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#14-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1 -1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1 -1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1 -1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1 -1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1 -1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#14-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#14-1.0#-1.0#-1.0#32.0#14-1.0#-1.0#-1.0#32.0#1-1.0#-1.0#-1.0#32.0#14                                                                                                                                                                         -1.0#-1.0#-1.0#32.0#100.0#-1.0                                                                                                                                                                                                                                                                                                                                                  -1.0#-1.0#-1.0#32.0#100.0#-1.0                                                                  0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09417");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 100, 92);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', 422, 507);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 422");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi97.04100.043.21041101E9435.0!32A0A5204 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A044 4 A A A-4 4 A A A14 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A04 4 A A A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi97.04100.043.21041101E9435.0!32A0A5204 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A044 4 A A A-4 4 A A A14 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A04 4 A A A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09419");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(289L, 1410040L, 1286L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1410040L + "'", long3 == 1410040L);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09420");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09421");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09422");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 7925, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 7925 + "'", short3 == (short) 7925);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09423");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 368, 251);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09424");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str12, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str14, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09425");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 0, 245);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09426");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1404040" + "'", str7, "1404040");
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09427");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0", (double) 368);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 368.0d + "'", double2 == 368.0d);
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09428");
        short[] shortArray5 = new short[] { (byte) -1, (short) 1, (byte) 100, (short) 0, (short) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 1, 100, 0, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#1#100#0#1" + "'", str7, "-1#1#100#0#1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1a100a0a1" + "'", str9, "-1a1a100a0a1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09429");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444410#10#-1444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09430");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("7", (long) 915);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09431");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 192L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 192L + "'", long2 == 192L);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09432");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 515, 262L, (long) 383);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 515L + "'", long3 == 515L);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09433");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09434");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(368L, (long) 0, 7925L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7925L + "'", long3 == 7925L);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09435");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 10, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0#1" + "'", str9, "0#1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "041" + "'", str13, "041");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0a1" + "'", str16, "0a1");
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09436");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str9, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str11, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str13, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str16, "100.0 1.0 10.0 0.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str18, "100.0#1.0#10.0#0.0");
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09437");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.1-#0....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.", (short) 32);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 32 + "'", short2 == (short) 32);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.a10.0a1.0a11097100.0a0.a10.0a1.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".a10.0a1.0a11097100.0a0.a10.0a1.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09439");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(348.0d, (double) 289, 444.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 444.0d + "'", double3 == 444.0d);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi !");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi !\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09441");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(127, 0, 1353);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1353 + "'", int3 == 1353);
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09442");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) '4', (int) (short) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 137, 134);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 2450, 369);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100" + "'", str18, "100");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09443");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 332);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 332L + "'", long2 == 332L);
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09444");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 332, (int) (short) -1);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 361, 134);
        double double23 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str25, "0.0 100.0 1.0 -1.0 1.0 100.0");
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09445");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 550, (long) 187, (long) 185);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 185L + "'", long3 == 185L);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09446");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(92, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09447");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 93L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93L + "'", long2 == 93L);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09448");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".04.04.04404.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09449");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 198, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                                                        ##1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                         ##1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#1" + "'", str10, "10#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1" + "'", str12, "10a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 1" + "'", str19, "10 1");
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09450");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 378, 0.0f, (float) 483L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09451");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1. ######.0#-1.0#32.0#100.0#-1. #-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-14#4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09452");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 198, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32a0a52" + "'", str16, "32a0a52");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32 0 52" + "'", str20, "32 0 52");
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09453");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("32", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 32 + "'", short2 == (short) 32);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09454");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444444444444444444444444444444444444444444444      a a a44444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444    \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09455");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09456");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09457");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 507, (int) (byte) 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 332, 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1041" + "'", str20, "1041");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09458");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#   4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09459");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 9744452 9752 9752 97 97299 975");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09460");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32#0#52" + "'", str12, "32#0#52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32a0a52" + "'", str14, "32a0a52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09461");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 507, (int) (byte) 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 378, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 127, 93);
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.toString(byteArray2, ".04100.041.04-1.041.04100.0aaa1041aaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .04100.041.04-1.041.04100.0aaa1041aaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09462");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1353, 4596L, (long) 4596);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1353L + "'", long3 == 1353L);
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09463");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("97 32 -1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09464");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 904, (long) 628, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 904L + "'", long3 == 904L);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09465");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 588, 3.21041088E8f, 368.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.21041088E8f + "'", float3 == 3.21041088E8f);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09466");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 198, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 895, 92);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#1" + "'", str10, "10#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1" + "'", str12, "10a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44452 9752 9752 97 97299 9752 -1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09468");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 198, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32a0a52" + "'", str16, "32a0a52");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32a0a52" + "'", str20, "32a0a52");
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09469");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(".1-A0.1A0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1-A0.1A0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09470");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                        4 4   A A                                                                                          ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09471");
        double[] doubleArray6 = new double[] { 0L, (-1L), (byte) 1, (-1L), (short) 1, (short) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', (int) '4', (int) (byte) -1);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, -1.0, 1.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09472");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaa0aaaaaaaaaa0a   a a a a  a a aaaaa0aaaaaaaaaa0aa 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09473");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 17925, 895);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32#0#52" + "'", str14, "32#0#52");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09474");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09475");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi#97#.#04100#.#043#.#21041101#E#9435#.#0#!#32#A#0#A#52                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09476");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#79 0 1 1#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09477");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                      ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09478");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 32, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 32 + "'", short3 == (short) 32);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09479");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("137");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09480");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1.0A1.0...                                                                                          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09481");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("14 4     ", 342.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 342.0f + "'", float2 == 342.0f);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09482");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 0, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str15, "0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str17, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09483");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 342, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 10 + "'", short19 == (short) 10);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09484");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 137, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09485");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                     0.04100.041.04-1.041.04100.0                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09486");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("          a   a..................................................................         a       a        79      a       a         5");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09487");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 0, (-1));
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09488");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 1, (float) 342L, (float) 137L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09489");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09490");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0                                                                                         ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09491");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97.04100.043.21041101E9435.0-1.0a-1.0a-1.0a32.0a100.0a-1.0044AAA.44AAA0410044AAA.44AAA04144AAA.44AAA0444AAA-44AAA144AAA.44AAA04144AAA.44AAA0410044AAA.44AAA044AAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09492");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 348);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 348L + "'", long2 == 348L);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09493");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 100, 100);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 0, 454);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09494");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 92, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09495");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(379.0f, 137.0f, 3.210411E31f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.210411E31f + "'", float3 == 3.210411E31f);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09496");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 507, 100);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 162, 312);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 162");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 10 1 100" + "'", str16, "10 1 10 1 100");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09497");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                             -1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1504L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1504L + "'", long2 == 1504L);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09498");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 1001, 80);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09499");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                             0.#-1.0#0                    -1.0#-1.0#-1.0#32.0#100.0#0.0#100.0#1.0#-1.0#1.0#1..0A1A100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 386L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 386.0f + "'", float2 == 386.0f);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest18.test09500");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                 001-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}

