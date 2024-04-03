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
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '4', 24);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1a0" + "'", str18, "1a0");
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04002");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float26 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str19, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str21, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str23, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str25, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 16.0f + "'", float26 == 16.0f);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(".1-0.010.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04004");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (short) 100, (int) ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1410" + "'", str15, "-1410");
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04005");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04006");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0A10.0A-1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04007");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                         hi!             -           #- #              -                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04008");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 100, (int) '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', (int) (short) -1, 571);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04009");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 824, 140);
        double double22 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0a10.0a-1.0" + "'", str17, "1.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04011");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hia!ahia!1#35#100#10#-1#0HI! 10 10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04012");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04013");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (short) 14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 14 + "'", short2 == (short) 14);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04014");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 35, 1878.0f, 109.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1878.0f + "'", float3 == 1878.0f);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04015");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-140" + "'", str16, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1#35#100#10#-1#0" + "'", str18, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04016");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 807, (long) 1087, (long) 76);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 76L + "'", long3 == 76L);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04017");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 571L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 571.0f + "'", float3 == 571.0f);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04018");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h1 0...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04019");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("52.44444444444444444444444444444444444144444444444444444444444444444444444.444444444444444444444444444444444441.444444444444444444444444444444444441.44444444444444444444444444444444444144444444444444444444444444444444444.4444444444444444444444444444444444452.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04020");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.00#-1#01#35#100#10#-1#0hi! 10 100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04021");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 174, 52);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04022");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger bigInteger3 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger bigInteger5 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger bigInteger7 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger bigInteger9 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray10 = new java.math.BigInteger[] { bigInteger1, bigInteger3, bigInteger5, bigInteger7, bigInteger9 };
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Number[]) bigIntegerArray10);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigIntegerArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11111" + "'", str11, "11111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11111" + "'", str12, "11111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11111" + "'", str13, "11111");
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04023");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04024");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 10, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04025");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04026");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(810, 17, 571);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 810 + "'", int3 == 810);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04027");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4 A 4 HI ! HI ! AA 4 A 4   AA 4 A 44 AA 4 A 4 \r");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04028");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) ' ', (int) (byte) -1);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 113, 47);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1a35a100a10a-1a0" + "'", str21, "1a35a100a10a-1a0");
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04029");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 110, (-1));
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 1111111111, 71);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04030");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 47, 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.041.040.0" + "'", str12, "-1.041.040.0");
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04031");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 0, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str14, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str16, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str22, "1.0 2.0 10.0 16.0 3.0 2.0");
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04032");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-14104100497497435");
        java.math.BigInteger[] bigIntegerArray2 = new java.math.BigInteger[] { bigInteger1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-14104100497497435");
        java.math.BigInteger[] bigIntegerArray5 = new java.math.BigInteger[] { bigInteger4 };
        java.math.BigInteger[][] bigIntegerArray6 = new java.math.BigInteger[][] { bigIntegerArray2, bigIntegerArray5 };
        java.math.BigInteger[][][] bigIntegerArray7 = new java.math.BigInteger[][][] { bigIntegerArray6 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray7);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigIntegerArray2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigIntegerArray5);
        org.junit.Assert.assertNotNull(bigIntegerArray6);
        org.junit.Assert.assertNotNull(bigIntegerArray7);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04033");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) 'a', 1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4', 14, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04034");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97a100a1a0a100a3", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04035");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aa4a4                                                52.010.0-1.0-1.010.052.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04036");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 140, 90);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray3, " # ######");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:  # ######");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#1#100" + "'", str13, "10#1#100");
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04037");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 44L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 44L + "'", long3 == 44L);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04038");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 110, (-1));
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 12, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04039");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 52, 0);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04040");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double24 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double25 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0a10.0a-1.0" + "'", str21, "1.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1.0a10.0a-1.0" + "'", str23, "1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04041");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1041004100414-14100", 174.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 174.0f + "'", float2 == 174.0f);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("class [C#class [Ljava.lang.String;#class [Ljava.lang.String;#class [Ljava.lang.String;#class [Ljava.lang.String;#class [Ljava.lang.String;0#-1#010...10#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#00001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [C#class [Ljava.lang.String;#class [Ljava.lang.String;#class [Ljava.lang.String;#class [Ljava.lang.String;#class [Ljava.lang.String;0#-1#010...10#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#01#-1#10#100#35#00001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04043");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str14, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 52.0f + "'", float15 == 52.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 52.0f + "'", float16 == 52.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 52.0f + "'", float17 == 52.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str19, "52.0a10.0a-1.0a-1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "52.0410.04-1.04-1.0410.0452.0" + "'", str22, "52.0410.04-1.04-1.0410.0452.0");
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04044");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 107, 11);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 31, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04045");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 16.0f + "'", float6 == 16.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16.0#1.0" + "'", str8, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "16.0#1.0" + "'", str10, "16.0#1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04046");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A105.0-1A10", 2665);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2665 + "'", int2 == 2665);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04047");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Ii  0 000.00.  0 00  0 00  0 0\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Ii  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04048");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 49, 3L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04049");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97ii  0 000.00.  0 00  0 00  0 0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04050");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) 40, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04051");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 40L, (float) 440L, 156.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 440.0f + "'", float3 == 440.0f);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04052");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 91, (double) 76L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 91.0d + "'", double3 == 91.0d);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04053");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 123);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 123.0f + "'", float2 == 123.0f);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04054");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1111111111", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04056");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a100a1a-1a100" + "'", str16, "10a100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04057");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("####1#35#100#10#-1#0hi! 10 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###1#35#100#10#-1#0hi! 10 100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04058");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04059");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04060");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 819, 76);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3435" + "'", str9, "3435");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04061");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1.0 10.0 -1.0i!hi!              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!1.0 10.0 -1.0i!hi!              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!1.0 10.0 -1.0i!hi!              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!1.0 10.0 -1.0i!hi!              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-                                                                          1435410041.0 10.0 -1.0i!hi!              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!1.0 10.0 -1.0i!hi!              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!1.0 10.0 -1.0i!hi!              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!1.0 10.0 -1.0i!hi!              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04062");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 14, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04063");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 71, (long) 301, (long) 82);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 71L + "'", long3 == 71L);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04064");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04065");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1#35#100#10#-1#0hi!10100.0-1A10A100A97A97A35-1A10A10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04066");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) (short) 10, 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.04100.04-1.040.0" + "'", str11, "-1.04100.04-1.040.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a100.0a-1.0a0.0" + "'", str14, "-1.0a100.0a-1.0a0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.04100.04-1.040.0" + "'", str16, "-1.04100.04-1.040.0");
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.10.1-#0.01#0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04068");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1-a...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04069");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str13, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 16.0f + "'", float14 == 16.0f);
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04070");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  HI! 10 100.0143541004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04071");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(123.0f, (float) 17L, (float) (short) 14);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 123.0f + "'", float3 == 123.0f);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04072");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float21 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str20, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 16.0f + "'", float21 == 16.0f);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04073");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 64, 20);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-140" + "'", str16, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1#35#100#10#-1#0" + "'", str18, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04074");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("--1.0a100.0a-1.0a0.01", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04075");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', (float) 59L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 5.0f + "'", float3 == 5.0f);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04076");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) ' ', (int) (byte) -1);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04077");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...4444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04078");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(" #35#   #  #- # hi!     . lass [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04079");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04080");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 107, 125L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 125L + "'", long3 == 125L);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04081");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3 35" + "'", str13, "3 35");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "3 35" + "'", str16, "3 35");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04082");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double24 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0a10.0a-1.0" + "'", str21, "1.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1.0a10.0a-1.0" + "'", str23, "1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1.0#10.0#-1.0" + "'", str26, "1.0#10.0#-1.0");
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04084");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(531, 102, 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04086");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 130, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long23 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 35 100 10 -1 0" + "'", str16, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "143541004104-140" + "'", str22, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04087");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04088");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 107, 11);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 31, (int) (byte) 1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "140" + "'", str22, "140");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1#0" + "'", str24, "1#0");
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04089");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("H1401H!!1H!1.H1!H1401H!!1H!1.H1!H1401H!!1H!1H1!H!", (byte) 14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 14 + "'", byte2 == (byte) 14);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04090");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 28, 27);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3#35" + "'", str11, "3#35");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("         1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#                            16.0A1.0001a1-a1a001a001a010#-1#0aa4a4hi!hi!aa4a4 aa4a44aa4a4\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#                            16.0A1.0001a1-a1a001a001a010#-1#0aa4a4hi!hi!aa4a4 aa4a44aa4a4?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04092");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 0, 0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3 35" + "'", str13, "3 35");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "3 35" + "'", str16, "3 35");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04093");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04094");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04095");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (short) 10, 7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04096");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                           ... a-                                                            ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04097");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04098");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(103.0d, (double) 174, (double) 79);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 174.0d + "'", double3 == 174.0d);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04099");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaa52.0#10.0#-1.0#-1.0#10.0#52.00#-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04100");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 91, 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04101");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("...44444444444...", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("###################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04103");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 14 hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04104");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 47, 35);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double23 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.041.040.0" + "'", str20, "-1.041.040.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0 1.0 0.0" + "'", str22, "-1.0 1.0 0.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04105");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 24, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04106");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04107");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(514, 560, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04108");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 8, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3#35" + "'", str11, "3#35");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04109");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                             .     !ih # -#  #   #53#                       hia!ahia!", (long) 83);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 83L + "'", long2 == 83L);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04110");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 37, 2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a100a1a-1a100" + "'", str15, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a100a100a1a-1a100" + "'", str21, "10a100a100a1a-1a100");
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04111");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 514, 34);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3#35" + "'", str11, "3#35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04112");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...041001041.010.0-1.0a1041001041001041001041.010...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04113");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 66, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04114");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 14, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                              1#35#100#10#-1#0hi!4104100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#100#10#-1#0hi!4104100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04116");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######14354100...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04117");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#101#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04118");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04119");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 95, (int) (byte) 10);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 35 100 10 -1 0" + "'", str18, "1 35 100 10 -1 0");
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04120");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) (byte) 14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 14 + "'", short3 == (short) 14);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04121");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("###############################################aaaaaaaaaaaaaaaaaa", 104100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104100.0d + "'", double2 == 104100.0d);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04122");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) 14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 14 + "'", short3 == (short) 14);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04123");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10-1013510010-10135100101-a                         ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04124");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04125");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04126");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("##.#4###.#4##.#4#.#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04127");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 6, 71L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 71L + "'", long3 == 71L);
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04128");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1 0...10#-1#0                                                140                                                 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04129");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.Class<?> wildcardClass15 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 0" + "'", str14, "1 0");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04130");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 19, 0.0d, (double) 46);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("3 353 353");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3 353 353\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04132");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(66, 1111111111, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04133");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 106, (float) 385, (float) 514);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 106.0f + "'", float3 == 106.0f);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04134");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0a10.0a-1.0" + "'", str7, "1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04135");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (long) 25);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25L + "'", long2 == 25L);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04136");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...10#-1#04444444444444444444444                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04137");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 11, 391);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04138");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("####1#ii  0 000.00.  0 01#35#100##                            1 0 00  0 00  0 0####1#ii");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04139");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("!ih!ih", 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04140");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                       ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04141");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 110, 29);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 301, 35);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 32, 0);
        float float25 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 82, (int) (short) -1);
        float float30 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str10, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04142");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 16.0f + "'", float9 == 16.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 16.0f + "'", float10 == 16.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 16.0f + "'", float11 == 16.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04143");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 176, (long) 10, (long) 59);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 176L + "'", long3 == 176L);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04144");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1#040hi! aa aaaaaa##aaa#aa#aa#ahi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!ih.!h!.!-h.!hi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!i-100a100a1a-1a100", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04145");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 30L, (double) 140, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04146");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 142, 3.0d, (double) 87);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 142.0d + "'", double3 == 142.0d);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04147");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 371, 52);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str14, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str16, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04148");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 79, (double) 66, (double) 53.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 79.0d + "'", double3 == 79.0d);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04149");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04150");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) ' ', (int) (short) 1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 84, 15);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 52.0f + "'", float17 == 52.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04151");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 47, 35);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double22 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.041.040.0" + "'", str21, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04152");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                    1#35#100#10#-1#0hi!10100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04153");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0 10 143541004104-1401#35#100#10#-1#0HI!");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04154");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 81, 47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 0, 81);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04155");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, (long) 176);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04156");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("[Ljava.lang.String; [Ljava.lang.String;class [Ljava.lang.String;class 1041001041001041001041.010.0-1.0tring;clas");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04157");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(124, 85, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 85 + "'", int3 == 85);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04158");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1#35#                                       hia!ahia!A44AA4A4\r");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04159");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!10100.01435410044444444444444444010#-1#0A001A001A1A1-A00");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04160");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, 43L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04161");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float24 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str19, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str21, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str23, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04162");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("cl4ss [Ccl4ss [Lj4v4.l4ng.String;cl4ss [Lj4v4.l4ng.String;cl4ss [Lj4v4.l4ng.String;cl4ss [Lj4v4.l4ng.String;cl4ss [Lj4v4.l4ng.String;");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04163");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("16.0#1.01a0", (byte) 14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 14 + "'", byte2 == (byte) 14);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04164");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("!IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       !IH       !IH     1#35#100#10#-1#01#35...", 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04165");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 25, (long) (-1), (long) 1878);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1878L + "'", long3 == 1878L);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04166");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(".041.040.0                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...............a4...............16.0a1.0001a1-a1a001a001a010#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04168");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 0" + "'", str20, "1 0");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04169");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (byte) 100, (int) (byte) 100);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 100 100 1 -1 100" + "'", str10, "10 100 100 1 -1 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04170");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1#35#100#10#-1#0" + "'", str14, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-140" + "'", str16, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1a35a100a10a-1a0" + "'", str19, "1a35a100a10a-1a0");
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04171");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100aa4a4hi!hi!aa4a4 aa4a44aa4a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04172");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                               a100a100a1a-1a100", 112);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04173");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 35, (int) (byte) 0);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 106, 296);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 106");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04174");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("   ", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04175");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (byte) 100, (int) (short) 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 824, 128);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 3825, 140);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".     !ih # -#  #   #53#                       hia!ahia!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".     !ih # -#  #   #53#                       hia!ahia!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04177");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("16.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04178");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 14, (float) 79, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14.0f + "'", float3 == 14.0f);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04179");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 16.0f + "'", float10 == 16.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "16.0a1.0" + "'", str14, "16.0a1.0");
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04180");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04181");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04182");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04183");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04184");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) (short) 100, (-1));
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 79, (int) (byte) 10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0a0a-1a-1a1a1" + "'", str18, "0a0a-1a-1a1a1");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04185");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A4a4a4a4aa-1HI! 10 100.a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04186");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hia!ahia!1#35#100#10#-1#0HI! 10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04187");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(65, 33, 405);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04188");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 64);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 64.0f + "'", float2 == 64.0f);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04189");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(110, 12, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 110 + "'", int3 == 110);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04190");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04191");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a100.0a-1.0a0.01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a1.010.0-1.01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04192");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 50, 7.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04193");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0 10.0 -1.0" + "'", str17, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0 10.0 -1.0" + "'", str19, "1.0 10.0 -1.0");
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04194");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04195");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04196");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 556, (double) 25.0f, (double) 393);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 556.0d + "'", double3 == 556.0d);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04197");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1#0" + "'", str21, "1#0");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04198");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a-1HI! 10 100.                                                00aa4a4hi!hi!aa4a4aa4a44aa4a4                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04199");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 23, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 103, 58);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1" + "'", str13, "100a-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04200");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 22, (long) 117, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 117L + "'", long3 == 117L);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04201");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1004-1" + "'", str11, "1004-1");
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04202");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a100a97a97a35" + "'", str13, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04203");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...  #- # hi!     . lass ...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04204");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str13, "52.0a10.0a-1.0a-1.0a10.0a52.0");
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04205");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("97ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.00000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04206");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "a4444class4 4[4Ljava4.4lang4.4String4;4class4 4[4Ljava4.4lang4.4String4;4class4 4[4Ljava4.4lang4.4String4;4class4 4[4C4                 ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a4444class4 4[4Ljava4.4lang4.4String4;4class4 4[4Ljava4.4lang4.4String4;4class4 4[4Ljava4.4lang4.4String4;4class4 4[4C4                 ");
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04207");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!ih.!h!.!-h.!hi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!i-100a100a1a-1a100.     !ih # -#  #   #53#                       ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100.a a4a4a#041hi! 10 100.4 a4a4a#041hi! 10 100.4 a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100.a a4a4a#041hi! 10 100.4 a4a4a#041hi! 10 100.4 a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04209");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1a0" + "'", str6, "1a0");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".     !ih # -#  #   #53#                       hia!ahia!hi! 10 100.0hi! 10 100.0h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".     !ih # -#  #   #53#                       hia!ahia!hi! 10 100.0hi! 10 100.0h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04211");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 95, (float) 6L, 123.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 123.0f + "'", float3 == 123.0f);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04212");
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
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 37, 11);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04213");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1A10A#-1A10A#-1A10A#-1-1.041.040.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04214");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001ih 0 0 00001a1-a1a001a001i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04215");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                         -1aa4a435.0                                                                                            ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04216");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1#35#100#10#-1#0" + "'", str12, "1#35#100#10#-1#0");
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04217");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1a10a100a97a97a35aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04218");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 64, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04219");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi                            a 4 4                            a 4 4                            a 4 ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04220");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04221");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.04141E7f, 47.0f, (float) 3570);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 47.0f + "'", float3 == 47.0f);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04222");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1410.0f), (double) 531, (double) 5.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 531.0d + "'", double3 == 531.0d);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04223");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0 10 143541004104-1401#35#100#10#-1#0HI!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04224");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a10");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a10");
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04225");
        org.apache.commons.lang3.math.NumberUtils numberUtils0 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils numberUtils1 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils numberUtils2 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils[] numberUtilsArray3 = new org.apache.commons.lang3.math.NumberUtils[] { numberUtils0, numberUtils1, numberUtils2 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(numberUtilsArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) numberUtilsArray3, "                                        4a4 aa4a44aa4a4\r16.0A1.");
        org.junit.Assert.assertNotNull(numberUtilsArray3);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04226");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 20, 28L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28L + "'", long3 == 28L);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04227");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0410.04-1.0" + "'", str8, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04228");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 174, (double) '#', (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04229");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 306, 306);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04230");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04231");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 560, 0.0f, (float) 44L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04232");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("!IH!IH");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04233");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0#10.0#-1.0" + "'", str11, "1.0#10.0#-1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0 10.0 -1.0" + "'", str13, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04234");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04235");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aa4a4aa4a4aa4a4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04236");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04237");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(150, 14, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04238");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("01A01A1-53A79A79A001A01A1-0.00101!ih0#1-#01#001#53#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04239");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 113, 59);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "3a35" + "'", str18, "3a35");
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04240");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(90, 3570, 391);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3570 + "'", int3 == 3570);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04241");
        double[] doubleArray3 = new double[] { (short) -1, (short) 100, '4' };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 3, (int) (byte) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 52.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0 100.0 52.0" + "'", str9, "-1.0 100.0 52.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#100.0#52.0" + "'", str11, "-1.0#100.0#52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04242");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi! 10 100.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04243");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 110, 29);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str10, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "52.0#10.0#-1.0#-1.0#10.0#52.0" + "'", str18, "52.0#10.0#-1.0#-1.0#10.0#52.0");
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04244");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04245");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi! 10 100. #4#4###############################################!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04246");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 514, (double) 23L, (double) 17L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.0d + "'", double3 == 17.0d);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04247");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 14, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 14 + "'", byte3 == (byte) 14);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04248");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("143541004\r1041001041001041001041.010.0-1.0tring;clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;\r#4#4", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04249");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 819, 271.0d, 102.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 819.0d + "'", double3 == 819.0d);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04250");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 176, 385);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 176");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3 35" + "'", str13, "3 35");
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04251");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("00aa4a4hi!h16.0a1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00aa4a4hi!h16.0a1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04253");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04254");
        float[] floatArray1 = new float[] { 35 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[35.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35.0" + "'", str3, "35.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35.0" + "'", str6, "35.0");
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44 4 4#4#4#4            -1A10A#-1A10A#-1A10A#-1-1.041.040.0           a4a                                                              aa4a4                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44 4 4#4#4#4            -1A10A#-1A10A#-1A10A#-1-1.041.040.0           a4a                                                              aa4a4                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04256");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAAAAAAA                                                                 ", (long) 111);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 111L + "'", long2 == 111L);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04257");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04258");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 405, 385);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "140" + "'", str11, "140");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04259");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-110L), (double) (-1), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-110.0d) + "'", double3 == (-110.0d));
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04260");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(40.0d, (double) 652, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04261");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi4!4hi4!                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4hi4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04262");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 440, (float) (byte) 100, (float) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04263");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 125, 3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0#10.0#-1.0" + "'", str11, "1.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#10.0#-1.0" + "'", str14, "1.0#10.0#-1.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0#10.0#-1.0" + "'", str20, "1.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04264");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a10.0a-1.0hi4!4hi4!", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04265");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 64, 0);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str12, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 16.0f + "'", float14 == 16.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04266");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04267");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(320, 560, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04268");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(82, 102, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04269");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".0a10.0a-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04270");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 16.0f + "'", float4 == 16.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "16.0#1.0" + "'", str6, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16.0#1.0" + "'", str8, "16.0#1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04271");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (short) 40);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 40 + "'", short2 == (short) 40);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04272");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str19, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str21, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str23, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str25, "1.0a2.0a10.0a16.0a3.0a2.0");
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04273");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 16.0f + "'", float18 == 16.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str20, "1.0 2.0 10.0 16.0 3.0 2.0");
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04274");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-A 4 410-1013510010-10135100101-", (double) 144);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 144.0d + "'", double2 == 144.0d);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04275");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (byte) 100, (int) (short) 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 90, 0);
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 25, 2);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1" + "'", str25, "-1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04276");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.001a1-a1a01a1-a1a!IH041-40140014534");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04277");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) (short) 4, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "143541004104-140" + "'", str13, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04278");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".     !IH # -#  #   #53#", (float) 1225L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1225.0f + "'", float2 == 1225.0f);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04279");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04280");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                      hi ! hi !");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04281");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 824, 23);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str13, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str19, "1.0#2.0#10.0#16.0#3.0#2.0");
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04282");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1.042.0410.0416.043.042.0                                         -1A10A100A97A97A35                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04283");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".0a10.1#0.61");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("  1.0#2.0#10.0#16.0#3.0#2.0   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"  1.0#2.0#10.0#16.0#3.0#2.0   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04285");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("2.0410.04-1.04-1.0410.045216.0#1.0", 82.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 82.0f + "'", float2 == 82.0f);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04286");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 40, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04287");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 81, 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 32, (int) (byte) 1);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04288");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04289");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1111111111, 440, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04290");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04291");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04292");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                               4                                                4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                               4                                                4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04293");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1.010.0-1.##.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04294");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("01a1-a1a001a001a01   !IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       !IH       !IH        !IH       !IH       !IH       !IH    ...", 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04295");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("52.0410.04-1.04-1.0410.0452.000a4444a52.0410.04-1.04");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04296");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a!ahia!1#35#100#10#-1#000001#35#100#10#-1#01hi! 10 100.a!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#A                                                                        #AA#AA#AAA#HI! AA AAAAAA#-1A10A", (double) 48);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.0d + "'", double2 == 48.0d);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04297");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 66, 514L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04298");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 514, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0 10.0 -1.0" + "'", str8, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-14100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-14100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04300");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 44, 11);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "140" + "'", str19, "140");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "140" + "'", str21, "140");
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04301");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 -1" + "'", str8, "100 -1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04302");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) ' ', (int) (byte) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 35 100 10 -1 0" + "'", str16, "1 35 100 10 -1 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04303");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#35#   #  #- # hi!     . 1#35#100#10#-1#01#35#100#10#-3597.0a1.0a1.0a-1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04304");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04305");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04306");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 104, (long) (byte) 14, 14L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04307");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2, 37.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 37.0f + "'", float3 == 37.0f);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04308");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 53, 653);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 653 + "'", int3 == 653);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04309");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("00a4444aaa44444a4444aa44444a4444hia4444!a4444hia4444!a4444aaa44444a4444aa44444a4444 a4444aaa44444a4444aa444444a4444aaa44444a4444aa44444a4444\r", (double) 42.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.0d + "'", double2 == 42.0d);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04310");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(401, 52, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04311");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04312");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, 0, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04313");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                    1-#0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04314");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".041.040.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04315");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) (short) 10, 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', 18, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04316");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(301.0f, (float) 34, (float) 42);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 34.0f + "'", float3 == 34.0f);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04317");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(156, 28, 401);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 401 + "'", int3 == 401);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04318");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04319");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 104100, (int) (byte) 0);
        float float22 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 16.0f + "'", float22 == 16.0f);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04320");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "a-1HI! 10 100.a-1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a-1HI! 10 100.a-1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10414100" + "'", str10, "10414100");
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04321");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 52, 13);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04322");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                100a1a-1a100                                                                ", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04323");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04325");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 43, 32);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long25 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-140" + "'", str16, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1#35#100#10#-1#0" + "'", str18, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1a35a100a10a-1a0" + "'", str24, "1a35a100a10a-1a0");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04326");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 14, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04327");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 4, (short) (byte) 14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 14 + "'", short3 == (short) 14);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04328");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04329");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 4, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04330");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0#10.0#-1.0" + "'", str16, "1.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04331");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) 40);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 40 + "'", short3 == (short) 40);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04332");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) (byte) 1, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) '4', 7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 53, 10414100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04334");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04335");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10L, (float) 281, (float) 16);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04336");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(82, 58, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04337");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 95, (int) (byte) 10);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04338");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h10...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0...10#-1#0", 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04339");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "140" + "'", str20, "140");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04340");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04341");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1041001041001041001041.010.0-1.0tring;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04342");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1####133333333333333333333333333333333333333333333333aaaaa33333333333333333333333333333333333333333333333352-1#1-1##-1##-1#1-152-11##444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04343");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("!ih!ih.00101!ih");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04344");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04345");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (short) 100, (int) ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04346");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                 1.010.0-1.##.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.                                       143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          class [Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04347");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(6, 107, 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 133 + "'", int3 == 133);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04348");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                         97 100 1 0 100 3                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04349");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 107, 18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 0, 1111111111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str13, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04350");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 40);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 40 + "'", short2 == (short) 40);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04351");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("9741004140410043", 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04352");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04353");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (short) 10, 7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 87, 77);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04354");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("04", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04355");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04356");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 29.0d, (double) 150);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 150.0d + "'", double3 == 150.0d);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04357");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04358");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 176, (double) 32, (double) 106L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04359");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) (short) 100, (-1));
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 79, (int) (byte) 10);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04360");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-44!!4444444a10.0a-1.0hi4!4hi4!", (short) 14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 14 + "'", short2 == (short) 14);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04361");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(106, 144, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 144 + "'", int3 == 144);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04362");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(15.0f, (float) 30, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 30.0f + "'", float3 == 30.0f);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444aaa44444a4444aa44444a4444hia4444!a4444hia4444!a4444aaa44444a4444aa44444a4444 a4444aaa44444a4444aa444444a4444aaa44444a4444aa44444a4444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44aaa4444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04364");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04365");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("!ahia!a                             .     !ih # -#  #   #53#                       hi");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04366");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 0, 5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 29, (int) (short) 1);
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-1" + "'", str16, "143541004104-1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04367");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("         1-#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04368");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("52.0#10.0#-1.0#-1.0#10.0#52.0-1A10A100A97A97A35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04369");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("143541004104-140HI!a1a-1a10a1a-1a100.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04370");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1#35#10HI! AA AAAAAA##AAA#AA#AA#A97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("00aa4a4hi!hi!aa4a4aa4a44aa4a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa4a4hi\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04372");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1, (long) 571, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 571L + "'", long3 == 571L);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04373");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, 113);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04374");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04375");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04376");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04377");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) 14, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04378");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" #35#   #  #- # hi!     . 1#35#100#10#-1#01#35#100#10#-3597.041.041.04-1.041.04-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04379");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float22 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str19, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str21, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 16.0f + "'", float22 == 16.0f);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04380");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04381");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 1, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04382");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52.0410.04-1.04-1.0410.0452.0" + "'", str11, "52.0410.04-1.04-1.0410.0452.0");
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04383");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04384");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(106, 49, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04385");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 907, (double) 90L, (double) 807);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.0d + "'", double3 == 90.0d);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04386");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 1225, (int) (byte) 10);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str14, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str16, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04387");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 28, (double) 1L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04388");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aa", 577);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 577 + "'", int2 == 577);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04389");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4a4aa44a4aa4a4aa!ih!ih4a4aa001001a1-a1a001a001a010#1-#01...01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04390");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04391");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04392");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04393");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 391, 390);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str19, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str21, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04394");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 0, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04395");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 0, 0);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float24 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str14, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str16, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str23, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04396");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#1.0#0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04397");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04398");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a97a97a35" + "'", str11, "-1a10a100a97a97a35");
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04399");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(27.0d, (double) 3.0f, (double) 16);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.0d + "'", double3 == 27.0d);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04400");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("AaaaaaaaAA4A4                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04401");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 130, 32);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 15, (int) (byte) -1);
        long long22 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1a35a100a10a-1a0" + "'", str16, "1a35a100a10a-1a0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaa52.0#10.0#-1.0#-1.0#10.0#52.00#-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaa52.0#10.0#-1.0#-1.0#10.0#52.00#-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04403");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                             .     !ih # -#  #   #53#                       hia!ahia!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04404");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1a10a100a97a97a35                                                                                  ", (float) 39);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.0f + "'", float2 == 39.0f);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04405");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04406");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 100, (int) '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) '#', 16);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1a10a100a97a97a35" + "'", str22, "-1a10a100a97a97a35");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1 10 100 97 97 35" + "'", str24, "-1 10 100 97 97 35");
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04407");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1#0" + "'", str16, "1#0");
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04408");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(31.0f, (float) 907, (float) 4L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.0f + "'", float3 == 4.0f);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("    a 4 4\r\r\r\r\r\r\r\r\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    a 4 4??????????\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04410");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 110, (int) (short) 100);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "140" + "'", str16, "140");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "140" + "'", str19, "140");
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04411");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("!IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       !IH       !IH        !IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       !IH       !IH", (long) 77);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 77L + "'", long2 == 77L);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04412");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double21 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.Class<?> wildcardClass22 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0 10.0 -1.0" + "'", str17, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0410.04-1.0" + "'", str20, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04413");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(34, 907, 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34 + "'", int3 == 34);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04414");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 45, (long) 150);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 150L + "'", long3 == 150L);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04415");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 81, 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 32, (int) (byte) 1);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) '4', 296);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04416");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1aa4a435.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04417");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("###########");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04418");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("###################################################################################", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("01A01A1-53A79A79A001A01A1-0.00101!IH0#1-#01#001#53#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1A01A1-53A79A79A001A01A1-0.00101!IH0#1-#01#001#53#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04420");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4 # # ########1#ii  0 000.00.  0 00  0 00  0 0###########################################################################################################################################################################################################################################################.1.010.0-1.1.010.0-1.1.", 3825L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3825L + "'", long2 == 3825L);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04421");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                   HI4!4HI4!                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI4!4HI4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04422");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("541004104-140HI!a1a-1a10a1a-1a100.0", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04423");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 405, 142);
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
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04424");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a10...", (double) 123);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 123.0d + "'", double2 == 123.0d);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04425");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1A10A#4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04426");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0#10.0#-1.0" + "'", str11, "1.0#10.0#-1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0 10.0 -1.0" + "'", str13, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04427");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04428");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, 45, 112);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04429");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04430");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("00aa4a4hi!hi!aa4a4 aa4a44aa4a4\r", (float) 84);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 84.0f + "'", float2 == 84.0f);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04431");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(390, 2665, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04432");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("####1#ii  0 000.00.  0 01#35#100##                            1 0 00  0 00  0 0####1#ii");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04433");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444497ii  0 000.00.  0 00  0 00  0 0\r                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04434");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(531, 9, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 531 + "'", int3 == 531);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04435");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04436");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 0, 144);
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
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 16.0f + "'", float11 == 16.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04437");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 42, (float) 1, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04439");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 95, 5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 1225, 37);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1a0" + "'", str6, "1a0");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a0" + "'", str13, "1a0");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04440");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(" a4a4a#041hi! 10 100.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04441");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04442");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 104, (double) 320, (double) 85);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 320.0d + "'", double3 == 320.0d);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04443");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (byte) 100, (int) (byte) 100);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 100 100 1 -1 100" + "'", str10, "10 100 100 1 -1 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 100 100 1 -1 100" + "'", str19, "10 100 100 1 -1 100");
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04444");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04445");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04446");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("97ii  0 000.00.  0 00  0 00  0 0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04447");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, (long) 37, (long) 514);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 37L + "'", long3 == 37L);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04448");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 37, 2);
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a100a1a-1a100" + "'", str15, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04449");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 47, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1a0" + "'", str20, "1a0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1a0" + "'", str22, "1a0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04450");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04451");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444401A01A1-53A79A79A001A01A1-0.00101!ih0#1-#01#001#53#1", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04452");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 25L, (double) 1.04141E7f, (double) 19);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 19.0d + "'", double3 == 19.0d);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04453");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(" #4#4###############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04454");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 16.0f + "'", float6 == 16.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16.0#1.0" + "'", str8, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "16.0#1.0" + "'", str10, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "16.0a1.0" + "'", str12, "16.0a1.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04455");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(111, 113, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 113 + "'", int3 == 113);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04456");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("h#35#h!!#h!#-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#h#!h!#!-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04457");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04458");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04459");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04460");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(87, 180, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 180 + "'", int3 == 180);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04461");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1a35##.#4###.#4##.#4#.#1a35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04462");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 47, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "140");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 140");
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 0" + "'", str18, "1 0");
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04463");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 0" + "'", str20, "1 0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 0" + "'", str22, "1 0");
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04464");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 100 100 1 -1 100" + "'", str16, "10 100 100 1 -1 100");
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1A10A#4444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A10A#4444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04466");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("3#353#353#353#353#353#353#353#353#353#353#353#353#353#353#353#1403#353#353#353#353#353#353#353#353#353#353#353#353#353#353#353#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04467");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (short) -1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
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
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04468");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1a-1HI! 10 100.a               ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04469");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi4a4aa4a44aa4a416.0a1.0", (double) 21.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.0d + "'", double2 == 21.0d);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04470");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 320, (long) 296, (long) 180);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 320L + "'", long3 == 320L);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04471");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 150, (-110));
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04472");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("        -1A", (long) 556);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 556L + "'", long2 == 556L);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04473");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(47L, 11111L, (long) 556);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11111L + "'", long3 == 11111L);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04474");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) (byte) 10, (int) (short) -1);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str13, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52.0#10.0#-1.0#-1.0#10.0#52.0" + "'", str15, "52.0#10.0#-1.0#-1.0#10.0#52.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str23, "52.0a10.0a-1.0a-1.0a10.0a52.0");
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04475");
        float[] floatArray1 = new float[] { 3L };
        float float2 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[3.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04476");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("3#35                                             ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04477");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (byte) 100, (int) (short) 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 824, 128);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04478");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1-a...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...a1a-1a    ...", (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04479");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 0 -1 -1 1 1" + "'", str11, "0 0 -1 -1 1 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0a0a-1a-1a1a1" + "'", str13, "0a0a-1a-1a1a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0a0a-1a-1a1a1" + "'", str15, "0a0a-1a-1a1a1");
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                            a 4 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a 4 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04481");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str20, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04482");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 81, 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 32, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1" + "'", str19, "-1");
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04483");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 26.0f, 174.0d, (double) 6.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.0d + "'", double3 == 6.0d);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04484");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        0#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        0#-1#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        0#-1#0aaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04485");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "0000                                                  16.0A1.0001a1-a1a001a001a010#-1#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0000                                                  16.0A1.0001a1-a1a001a001a010#-1#");
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaa2.0410.04-1.04-1.0410.0452aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaa2.0410.04-1.04-1.0410.0452aa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04487");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("35#   #  #- # hi!     . l#ss [Ccl#ss [Lj#v#.l#ng.String;cl#ss [Lj#v#.l#ng.String;cl#ss [Lj#v#.l#ng.String;cl#ss [Lj#v#.l#ng.String;cl#ss [Lj#v#.l#ng.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04488");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04489");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aa4a4                                                52.010.0-1.0-1.010.052.00#-0 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10 0 -1 -1 1 10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04490");
        double[] doubleArray3 = new double[] { (short) -1, (short) 100, '4' };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 3, (int) (byte) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 52.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0#100.0#52.0" + "'", str9, "-1.0#100.0#52.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04491");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(23, 104, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04492");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                            a 4 4\r\r\r\r\r\r\r\r\r\r", (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("40hi! aa aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"40hi! aa aaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04494");
        double[] doubleArray3 = new double[] { (short) -1, (short) 100, '4' };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 3, (int) (byte) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 47, 9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) 'a', 33);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 52.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0 100.0 52.0" + "'", str17, "-1.0 100.0 52.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.04100.0452.0" + "'", str19, "-1.04100.0452.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04495");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(125, 1815, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04496");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 0" + "'", str17, "1 0");
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04497");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04498");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4143541004                                               4                                                4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("####1#ii  0 000.00.  0 00  0 00  0 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"####1#ii  0 000.00.  0 00  0 00  0 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest8.test04500");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 21, (long) 335, 3825L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 21L + "'", long3 == 21L);
    }
}

