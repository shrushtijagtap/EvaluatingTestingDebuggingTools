package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0##010##0#0##0050##010##0#0##005#0##0##010##0#0##0050##0#0##-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001 0 ", 327);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 327 + "'", int2 == 327);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1081, 942, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 559L, (float) 4091, (float) 3280);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4091.0f + "'", float3 == 4091.0f);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a0a10" + "'", str13, "10a0a10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("# 4                                                 100 1 0 -1 10", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, (int) (byte) 10);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 1573, (-1));
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1a100" + "'", str9, "1a100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1#100" + "'", str11, "1#100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0A10.0A52.0A1-1.0A10.0A52.0A10.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 993, 604);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0#-1" + "'", str9, "0#-1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100, 840.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3637, 998L, (long) 85);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 85L + "'", long3 == 85L);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444440a0a10...a52.0a1a0.25a..10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 2362, 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                              # 4", (double) 3373);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3373.0d + "'", double2 == 3373.0d);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        long[] longArray6 = new long[] { 1, (short) 1, 62L, (byte) 0, 62L, 10L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 1040410, 1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 1, 62, 0, 62, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 23, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100.a52.0a10.0a0.1--1.0a0.01a0.25a10.25A0.01A0.1-1A0.25A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#A52.0A10.0A...0.1--1.0-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.a52.0a10.0a0.1--1.0a0.01a0.25a10.25A0.01A0.1-1A0.25A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#A52.0A10.0A...0.1--1.0-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 134, 1573.0f, (float) 1501L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 134.0f + "'", float3 == 134.0f);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 780, (double) 4096L, 1212.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 780.0d + "'", double3 == 780.0d);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100.010#0#10");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 559, (-1));
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 715, (int) ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str15, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        long[] longArray6 = new long[] { 1, (short) 1, 62L, (byte) 0, 62L, 10L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 1040410, 1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 1040410, 146);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 233, 558);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 233");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 1, 62, 0, 62, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 62L + "'", long12 == 62L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a1a62a0a62a10" + "'", str14, "1a1a62a0a62a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "14146240462410" + "'", str16, "14146240462410");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0#4096.0#10.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a0.0" + "'", str12, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0#100.0#0.0" + "'", str14, "0.0#100.0#0.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1422L, (float) 3996L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3996.0f + "'", float3 == 3996.0f);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("32 0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3996L, (double) 450.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a4#0.001a0.25a0.01a0.1-1.1-A1.--1040410A10.0001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#1#1#1-#0101404001#1-#", 526.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 526.0f + "'", float2 == 526.0f);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("--.-A--.-A52.-A---.-1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA04231-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"--.-A--.-A52.-A---.-1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA04231-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ...a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1-.---a-.25a-.--a-.--");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("00101#0#01-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (byte) 100, 0);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 327, 165);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 1 0 -1 10" + "'", str9, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 526L, 14100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 14100.0d + "'", double3 == 14100.0d);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                              0.1--1.0...a0.01a0.25a#0#100.001                                                                                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.1--1.0...a0.01a0.25a#0#100.001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 'a', 0.0d, (double) 780);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 780.0d + "'", double3 == 780.0d);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1573, 659, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("Aaaa#aa#a#a#aa#aaa4a4aaaa4a4AaaaaAaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0 0 10 -aa0.0 10.010#-1#1#1#-1#100", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0404104-1#0#10#0#1.1A0.25A0.01A0.1--110#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0041404-1410#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("410A0A10#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 62, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0410.0452.04100.0" + "'", str15, "-1.0410.0452.04100.0");
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 165.0f, (float) 146);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 85, 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 937, 775);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 3", (double) 62);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.0d + "'", double2 == 62.0d);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                             ...0#0#...                                            4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 451);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 451 + "'", int2 == 451);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 0, 1573);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3240" + "'", str12, "3240");
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 840L, (float) 488, 394.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 394.0f + "'", float3 == 394.0f);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 0, (int) (byte) 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 4219, 4091);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str21, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400...a52.0a1-a10.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-13240AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-10A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 4395, 3637);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 10.0" + "'", str12, "0.0 10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(" #4# ####40.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 0, 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0#-1" + "'", str12, "0#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a-1" + "'", str14, "0a-1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 0, (int) (byte) 1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) ' ', (int) ' ');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14-141041" + "'", str11, "14-141041");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "14-141041" + "'", str13, "14-141041");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1a-1a10a1" + "'", str15, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 4096, 165);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#1#0#-1#10" + "'", str17, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100a1a0a-1a10" + "'", str24, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 0, 574);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-141" + "'", str7, "-141");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a10...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0 10.0 52.0 100.0-A10....A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A10A0A10#AA", (long) 568);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 568L + "'", long2 == 568L);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...A52.0A1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1A0.25A0.01A0.1--1.0......a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-141" + "'", str7, "-141");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1" + "'", str9, "-1a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-141" + "'", str11, "-141");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1a1" + "'", str14, "-1a1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) 10, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 659, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        long[] longArray6 = new long[] { 1, (short) 1, 62L, (byte) 0, 62L, 10L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 1040410, 1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 1, 62, 0, 62, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 62L + "'", long12 == 62L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 62L + "'", long13 == 62L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 62L + "'", long14 == 62L);
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-4-4--4--1a.a1a-aAa1a.a--a1040410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-4-4--4--1a.a1a-aAa1a.a--a1040410\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#0#444444#0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A", (long) 525);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 525L + "'", long2 == 525L);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(565L, 0L, (long) 189);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 565L + "'", long3 == 565L);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001a0.25a0.01a0.1--1.0a10.0a52.0a                                                               ", (long) 555);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 555L + "'", long2 == 555L);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 526, 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         -1.0 10.0 52.0 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1...", 568);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 568 + "'", int2 == 568);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 146, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040410" + "'", str11, "1040410");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 0 10" + "'", str15, "10 0 10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#0#10" + "'", str17, "10#0#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a0a10" + "'", str19, "10a0a10");
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 21, 1314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0a-1" + "'", str9, "0a-1");
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 823, 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        long[] longArray5 = new long[] { 10L, 1, (-1), 0, (-1L) };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 1, -1, 0, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1#1#1#-1#100" + "'", str10, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#1#1#-1#100" + "'", str12, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 -1 1 1 -1 100" + "'", str14, "10 -1 1 1 -1 100");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 -1 1 1 -1 100" + "'", str19, "10 -1 1 1 -1 100");
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.A.25A.A.-A.25A.A.-.A.25A.A.-...52.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, 0.0d, (double) 478);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("A1.25A1.1-A1.-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        short[] shortArray5 = new short[] { (byte) 100, (short) 10, (short) 0, (short) 0, (byte) 10 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, 10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', 775, 525);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 2500, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', (int) (byte) 0, 916);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 64, 4046);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 472, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.04100.040.0" + "'", str12, "0.04100.040.0");
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.#Aa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.-1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.#Aa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.-1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.#Aa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.-1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.#Aa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.-1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.#Aa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.-1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.#Aa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.-1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.#Aa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.-1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.1a.a1a0aAa1a.a00a1.-.-1.#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400...a52.0a1-a10.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-13240AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-10A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A", (long) 1422);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1422L + "'", long2 == 1422L);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4046, 349, 3986);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 349 + "'", int3 == 349);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 10, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#0#10" + "'", str12, "10#0#10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 0 10" + "'", str19, "10 0 10");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10 0 10" + "'", str22, "10 0 10");
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        short[] shortArray6 = new short[] { (short) 100, (short) 1, (byte) 1, (short) -1, (byte) 100, (short) -1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 770, 4510);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 770");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 1, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...-A10404101A.A1A-AaA1A.A--A104041041A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A1040410#aA1A.A--A10404101A.A1A-AaA1A.A--A104041041A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A1040410#aA1A.A--A10404101A.A1A-AaA1A.A--A104041041A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-Aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100, 0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("25a0.01a0.1--1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("###########################################################################################################################", 724);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 724 + "'", int2 == 724);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.04444444444444444444444444A52.0A10.0A0.1--1.0A0.01A0.25A444444444444440#0#100.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.11-A1.25A1.1-A1.-4444444444444444444444444440#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 559.0f, (float) 803);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 803.0f + "'", float3 == 803.0f);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str15, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str17, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10a0a#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#1010a0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10a0a#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#1010a0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("410a0a10#####################", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 4089, 190);
        short short24 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', (int) (byte) 0, 729);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040410" + "'", str11, "1040410");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 0 10" + "'", str15, "10 0 10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#0#10" + "'", str17, "10#0#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1040410" + "'", str19, "1040410");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...a52.0a1...a52.0a1...a52.0a1...a", 954L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 954L + "'", long2 == 954L);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040410" + "'", str11, "1040410");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 1 0 -1 10" + "'", str9, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1a0a-1a10" + "'", str12, "100a1a0a-1a10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 1 0 -1 10" + "'", str14, "100 1 0 -1 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100#1#0#-1#10" + "'", str16, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#-1#1#1#-1#10-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0", (double) 1314);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1314.0d + "'", double2 == 1314.0d);
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(724.0f, (float) 4510L, 4114.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4510.0f + "'", float3 == 4510.0f);
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 100, (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1" + "'", str9, "-1 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001 0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                  #0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10                  ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                  #0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10                  ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                          1A0.25A0.01A0.1-1A0.25A0.01A0.1-                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                          1A0.25A0.01A0.1-1A0.25A0.01A0.1-                           \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1302L, (double) 604L, 233.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 233.0d + "'", double3 == 233.0d);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 559, (-1));
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0410.0452.04100.0" + "'", str15, "-1.0410.0452.04100.0");
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!iha--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a140140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a140140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a140140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a140140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a140140401a--a.a1aAa-a1a.a10140401a--a.a1aAa-a1a.a10.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#0#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-#0#0#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaa0 23");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 958.0f, (double) 574, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 958.0d + "'", double3 == 958.0d);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("A10.10a0a100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A1.11-A1.25A1.1-A1.-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 547, 478);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0", 954);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 954 + "'", int2 == 954);
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 62, (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 550, 233);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.001a0.25a0.01a0.1-100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1 -1 10 11001001001001001001001001001001001001001001");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) (byte) 100, (int) (byte) 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 998, (int) (byte) 0);
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#0#10" + "'", str9, "10#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1040410" + "'", str22, "1040410");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10....");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(308, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4     #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4     #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a3...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0", (double) 942);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 942.0d + "'", double2 == 942.0d);
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("  4     #0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0410.0452.04100.0" + "'", str9, "-1.0410.0452.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0410.0452.04100.0" + "'", str11, "-1.0410.0452.04100.0");
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 565, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str15, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0410.0452.04100.0" + "'", str21, "-1.0410.0452.04100.0");
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 189, 308L, (long) 1422);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 189L + "'", long3 == 189L);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (byte) 10, (int) (short) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 4017, 702);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "04-1" + "'", str12, "04-1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("###################################", 4017);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4017 + "'", int2 == 4017);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', 3373.0f, (float) 544L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#0#10" + "'", str12, "10#0#10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 0 10" + "'", str15, "10 0 10");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 0 10" + "'", str19, "10 0 10");
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 10, (int) (short) 1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 488, 478);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 32-1 3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("     -1 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     -1 32\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("110A0A1010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10A0A1010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                               ", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 10, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#0#10" + "'", str12, "10#0#10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a0a10" + "'", str19, "10a0a10");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1040410" + "'", str21, "1040410");
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) 23);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str9, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 23, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0aA0.25A0...", 1.100101E7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.100101E7f + "'", float2 == 1.100101E7f);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 0, 394);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 100, (-1));
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 993, 1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a1a0a-1a10" + "'", str11, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100#1#0#-1#10" + "'", str22, "100#1#0#-1#10");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10041404-1410" + "'", str24, "10041404-1410");
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0...A52.0A110#0#100.001#0.25#0...10#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0", (double) 4091);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4091.0d + "'", double2 == 4091.0d);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3996, 38.0f, (float) 657);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3996.0f + "'", float3 == 3996.0f);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("AAAAAAAAAAA4A4AAAA4A4AAA#AA#A#A#AA#AAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 544, (float) 525, (float) 190);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 544.0f + "'", float3 == 544.0f);
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.01-1.010.052.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-132-1.0A10.0A52.0A100.0                                                                                                                                                                                                                                                                                                                                                                                        -1.0a10.0a52.0a1-1.0a10.0a52.0a1                                                                    ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.04100.040.0" + "'", str13, "0.04100.040.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  14-141041", 2362);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2362 + "'", int2 == 2362);
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                     444444444444a4444a4444a44444444444444444444444444444444444444444444444444444a4444a44444a0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10....                                                                                                                                                                  10.0 0.0a0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10....                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#0#100.001a0.25a0.01a0.1--1.0...                                                                    10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#100.001a0.25a0.01a0.1--1.0...                                                                    10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A0.25A0.01A0.1--1.0...0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10a0a10#44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a0.25a0.01a0.1--1.0...                                                            ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.25a0.01a0.1--1.0...                                                            ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 1 0 -1 10" + "'", str12, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                 32 0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3240" + "'", str8, "3240");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32a0" + "'", str14, "32a0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A52.0A1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1A0.25A0.01A0.1--1.0...                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A52.0A1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1A0.25A0.01A0.1--1.0...                                                                             is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 558, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float23 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float24 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str14, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str20, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str22, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 100.0f + "'", float23 == 100.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) 'a', (int) '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 840, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 189, 116);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 327);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 327 + "'", int2 == 327);
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(993, 565, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.010.025A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.0 aa aaa#a1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25A0.01A0.1-1A0.25");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100A1A0A-1A10A-1.0A10.0A52.0A100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100A1A0A-1A10A-1.0A10.0A52.0A100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A A A A A A A A A A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        float[] floatArray7 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray7);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray7);
        java.lang.Class<?> wildcardClass10 = floatArray7.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray13 = (java.lang.Class<?>[]) classArray12;
        wildcardClassArray13[0] = wildcardClass2;
        wildcardClassArray13[1] = wildcardClass10;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray13);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray13);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class [Ljava.lang.String;class [F" + "'", str18, "class [Ljava.lang.String;class [F");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class [Ljava.lang.String;class [F" + "'", str19, "class [Ljava.lang.String;class [F");
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" ### # ##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ### # ##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1#-1#10#1" + "'", str9, "1#-1#10#1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) 109);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109L + "'", long2 == 109L);
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0#10.0" + "'", str12, "0.0#10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  0101a0a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 0, (int) (short) 1);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double21 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0a10.0" + "'", str13, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0.0 10.0" + "'", str20, "0.0 10.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(62.0f, 476.0f, (float) 1665L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1665.0f + "'", float3 == 1665.0f);
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0 10.0" + "'", str7, "0.0 10.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 10, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#0#10" + "'", str12, "10#0#10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a0a10" + "'", str19, "10a0a10");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10a0a10" + "'", str22, "10a0a10");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10a0a10" + "'", str24, "10a0a10");
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 873, 770);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.25A0.01A0.1-1A0.25A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#A52.0A10.0A...0.1--1.0-", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str12, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str18, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str21, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a10.100100.0010.250.010.1-...0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A10......0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 524, 1314.0d, (double) 394);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 394.0d + "'", double3 == 394.0d);
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a1104041010#-1#1#1#-1#100a52.0a10...a0a104041010#-1#1#1#-1#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 4089, 1501);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A10.10a0a100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (double) 525);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 525.0d + "'", double2 == 525.0d);
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Aa1a.a1a-aAa1a.a--a104041010.0 559.0 1040410.0 574.0 559.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 233.0f, (double) 4360, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1916, 3637L, 118L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3637L + "'", long3 == 3637L);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 559, (int) 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 958, (-1));
        short short21 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1#1001--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
        double[] doubleArray5 = new double[] { 10.0d, 559, 1040410, 574, 559.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 559.0, 1040410.0, 574.0, 559.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10.0 559.0 1040410.0 574.0 559.0" + "'", str7, "10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10.0#559.0#1040410.0#574.0#559.0" + "'", str9, "10.0#559.0#1040410.0#574.0#559.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1040410.0d + "'", double10 == 1040410.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (byte) 10, 10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 474, 937);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 474");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 32" + "'", str14, "-1 32");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 724, 327);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0#10.0" + "'", str11, "0.0#10.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a10.0" + "'", str14, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0.0 10.0" + "'", str22, "0.0 10.0");
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a0a10a-10.0A0.001A0.0", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            0.001a0.25a0.01a0.1-##############################################################001#1-#1#1#1-#0101404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (int) (short) 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4     #...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 4096, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.04100.040.0" + "'", str10, "0.04100.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0 100.0 0.0" + "'", str17, "0.0 100.0 0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0a100.0a0.0" + "'", str19, "0.0a100.0a0.0");
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(780.0f, 38.0f, (float) 1755);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 38.0f + "'", float3 == 38.0f);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0a0a10a-1" + "'", str7, "0a0a10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0404104-1" + "'", str11, "0404104-1");
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3240" + "'", str8, "3240");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32a0" + "'", str11, "32a0");
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 0, (int) (byte) 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str21, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str23, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 0 10" + "'", str15, "10 0 10");
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 298, 715);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 298");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test14738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14738");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.0a100.0a0.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.0a100.0a0.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14739");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14740");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) (byte) 100, (int) (byte) 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#0#10" + "'", str9, "10#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test14741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14741");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 233, 1952.0d, (double) 958L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1952.0d + "'", double3 == 1952.0d);
    }

    @Test
    public void test14742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14742");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', (int) (short) 10, (-1));
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 2500, 1302);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test14743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14743");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10a0a10#44");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14744");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 429, 298);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14745");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) '#', 0);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0" + "'", str12, "32 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test14746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14746");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("32a00-.010.052.0100.0-1.010.052.010a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.32a0100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010-.010.052.0100.0-1.010.052.010a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.32a00-.010.052.0100.0-1.010.052.010a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14747");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test14748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14748");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test14749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14749");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.001A0.25A0.01A0.1--1.0A10.0A52.0A", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test14750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14750");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14751");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1040410" + "'", str14, "1040410");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test14752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14752");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (short) 100, 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test14753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14753");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14754");
        short[] shortArray6 = new short[] { (short) 100, (short) 1, (byte) 1, (short) -1, (byte) 100, (short) -1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 775, 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 1, 1, -1, 100, -1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a1a1a-1a100a-1" + "'", str9, "100a1a1a-1a100a-1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test14755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14755");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 100, (int) (short) 10);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test14756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14756");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4091, 1081, 4114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4114 + "'", int3 == 4114);
    }

    @Test
    public void test14757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14757");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                             ...0#0#...                                            4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (long) 233);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 233L + "'", long2 == 233L);
    }

    @Test
    public void test14758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14758");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14759");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 10, (int) (short) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 604, 1040410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 604");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "04-1" + "'", str9, "04-1");
    }

    @Test
    public void test14760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14760");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#-1#1#1#-1#100" + "'", str11, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "104-141414-14100" + "'", str13, "104-141414-14100");
    }

    @Test
    public void test14761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14761");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-4444444444444444444444#40444404444044444044440444404444444440444404444044444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                4444444444444444444444#40444404444044444044440444404444444440444404444044444444444444444444444444                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14762");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str9, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str13, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str15, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test14763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14763");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-444L) + "'", long1 == (-444L));
    }

    @Test
    public void test14764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14764");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" 444 4a4#440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.01A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A104041041A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A1040410");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14765");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0#10.0" + "'", str10, "0.0#10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0410.0" + "'", str12, "0.0410.0");
    }

    @Test
    public void test14766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14766");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0.001A0.0a0a0a10a-10.0A0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14767");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 525L, (float) 942);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 942.0f + "'", float3 == 942.0f);
    }

    @Test
    public void test14768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14768");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################-1.0A10.0A52.0A100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                              # 4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                              # 4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14770");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14771");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test14772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14772");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14773");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#0#10" + "'", str16, "10#0#10");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a0a10" + "'", str19, "10a0a10");
    }

    @Test
    public void test14774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14774");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 4510, 2500);
        short short23 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040410" + "'", str11, "1040410");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 0 10" + "'", str15, "10 0 10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#0#10" + "'", str17, "10#0#10");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 10 + "'", short23 == (short) 10);
    }

    @Test
    public void test14775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14775");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 123L, 958.0f, (float) 558);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 123.0f + "'", float3 == 123.0f);
    }

    @Test
    public void test14776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14776");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 780, (float) (byte) 1, (float) 483);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test14777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14777");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 526, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float22 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str14, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0410.0452.04100.0" + "'", str20, "-1.0410.0452.04100.0");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
    }

    @Test
    public void test14778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14778");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0", (double) 1055L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1055.0d + "'", double2 == 1055.0d);
    }

    @Test
    public void test14779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14779");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 604, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0410.0452.04100.0" + "'", str19, "-1.0410.0452.04100.0");
    }

    @Test
    public void test14780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14780");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1.0#97.0#32.0#100.0#0.0#1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14781");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 1040410, 574);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 659, 0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1040410" + "'", str16, "1040410");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test14782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14782");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) (byte) 100, (int) (byte) 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 998, (int) (byte) 0);
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#0#10" + "'", str9, "10#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10a0a10" + "'", str22, "10a0a10");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test14783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14783");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("00#1#0#-1#", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14784");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14785");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 659, (float) 109L, 1665.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 109.0f + "'", float3 == 109.0f);
    }

    @Test
    public void test14786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14786");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 4089, 604);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 1040410, 3996);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 -1" + "'", str5, "0 -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "04-1" + "'", str15, "04-1");
    }

    @Test
    public void test14787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14787");
        int[] intArray6 = new int[] { ' ', 958, 558, 559, 'a', 574 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) (byte) 0, 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 958, 558, 559, 97, 574]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 958 + "'", int7 == 958);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32 958 558 559 97 574" + "'", str13, "32 958 558 559 97 574");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32 958 558 559 97 574" + "'", str15, "32 958 558 559 97 574");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 958 + "'", int16 == 958);
    }

    @Test
    public void test14788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14788");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10526.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14789");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A-a10.100100.0010.250.010.1-1a10.100100.0010.250.010.1-.a10.100100.0010.250.010.1-0410a10.100100.0010.250.010.1-.a10.100100.0010.250.010.1-0452a10.100100.0010.250.010.1-.a10.100100.0010.250.010.1-04100a10.100100.0010.250.010.1-.a10.100100.0010.250.010.1-0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10.0a1.1-A1.--1040410A10");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14790");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1a0a-1a10" + "'", str13, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test14791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14791");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 10.0" + "'", str12, "0.0 10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a10.0" + "'", str16, "0.0a10.0");
    }

    @Test
    public void test14792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14792");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0#100.0#0.00.0#100.0#0.00.0#100.0#0.00.0#...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14793");
        double[] doubleArray6 = new double[] { 1.0f, 'a', ' ', 100.0f, 0L, 1 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 702, (int) (byte) 0);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0, 32.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a97.0a32.0a100.0a0.0a1.0" + "'", str9, "1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14794");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1#3210a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10#0#1010a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14795");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                 10a0a10#aa", 525L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 525L + "'", long2 == 525L);
    }

    @Test
    public void test14796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14796");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("230#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14797");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-10.1--1.0...A0.01A0.25A#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-A52.0A1-1.0A10.0A52.0A", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14798");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str15, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str17, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0410.0452.04100.0" + "'", str20, "-1.0410.0452.04100.0");
    }

    @Test
    public void test14799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14799");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 4657, 1212);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14800");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 100, 0.0f, 840.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test14801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14801");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test14802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14802");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0410.0452.04100.0" + "'", str14, "-1.0410.0452.04100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str16, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test14803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14803");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-A-42--A-4-A-A-A.1A-A-2A-A2 AAA51.A-52 2A-52-A-51.A-52--A- 2A-52-A-51.A-52 2A-52-A-51.A-5AAA51.A-52 2A-52-A-51.A-52--A- 2A-52-A-51.A-52 2A-52-A-51.A-5AAA51.A-52 2A-52-A-51.A-52--A- 2A-52-A-51.A-52 2A-52-A-51.A-5AAA51.A-52 2A-52-A-51.A-52--A- 2A-52-A-51.A-52 2A-52-A-51.A-5AAA51.A-52 2A-52-A-51.A-52--A- 2A-52-A-51.A-52 2A-52-A-51.A-5AAA51.A-52 2A-52-A-51.A-52--A- 2A-52-A-51.A-52 2A-52-A-51.A-5AAA51.A-52 2A-52-A-51.A-52--A- 2A-52-A-51.A-52 2A-52-A-51.A-5AAA51.A-52 2A-52-A-51.A-52--A- ----5A---AA---5A--5225--A5---AA---A5----");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14804");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 -1 10 1" + "'", str11, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test14805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14805");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) '4', (int) (short) 1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str15, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str17, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test14806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14806");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.0#10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0#10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14807");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("41100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14808");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14809");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#0", 1501L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1501L + "'", long2 == 1501L);
    }

    @Test
    public void test14810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14810");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010110A0A1010");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14811");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 23, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 23 + "'", short3 == (short) 23);
    }

    @Test
    public void test14812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14812");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test14813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14813");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 472, 0L, (long) 165);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14814");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14815");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (short) 0, 1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test14816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14816");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (byte) 100, (-1));
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 146, 4034);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 146");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10041404-1410" + "'", str13, "10041404-1410");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test14817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14817");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4046, (float) 450L, (float) 118L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4046.0f + "'", float3 == 4046.0f);
    }

    @Test
    public void test14818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14818");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test14819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14819");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1040410-1.0 10.0 52.0 100.0-1.0 10.0 52.0 A10.100100.0010.250.010.1-1.0 10.0 52.0 100.0-1.0 10.0 52.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14820");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) '4', (int) (short) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 1040410, 3920);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14821");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1329L, (float) 298, 4034.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 298.0f + "'", float3 == 298.0f);
    }

    @Test
    public void test14822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14822");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1755, 702, 3240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 702 + "'", int3 == 702);
    }

    @Test
    public void test14823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14823");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 574, 558);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 1314, 177);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14824");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 840, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 812, 525);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test14825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14825");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("04a41004.4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14826");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 118, 205);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 118");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void test14827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14827");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(118L, (long) 1980, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14828");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1#1#1#-1#100" + "'", str10, "10#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test14829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14829");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110.....110.....110.....110.....110...110.....110.....110.....110.....110....111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1110.....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14830");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14831");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2500, 296, 488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 296 + "'", int3 == 296);
    }

    @Test
    public void test14832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14832");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 558, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.Class<?> wildcardClass24 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str14, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str20, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0410.0452.04100.0" + "'", str23, "-1.0410.0452.04100.0");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test14833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14833");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 3240, 1952);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 177, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a1a0a-1a10" + "'", str11, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test14834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14834");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a0a10" + "'", str13, "10a0a10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test14835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14835");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 189, (long) 547, (long) 190);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 189L + "'", long3 == 189L);
    }

    @Test
    public void test14836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14836");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("404#41004.40014a404.4254a404.4014a404.414--414.4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaa10414-1404-10a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaa10414-1404-10a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14838");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 0 10" + "'", str15, "10 0 10");
    }

    @Test
    public void test14839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14839");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 2362, (double) 4046.0f, (double) 958);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 958.0d + "'", double3 == 958.0d);
    }

    @Test
    public void test14840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14840");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("104-141414-14", 942.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 942.0f + "'", float2 == 942.0f);
    }

    @Test
    public void test14841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14841");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A10.10a0a100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14842");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         -1.0410.0452.04");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14843");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
    }

    @Test
    public void test14844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001                                                ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001                                                ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14845");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A1.1-A1.--1040410-1.0 10.0 52.0 100.0-1.0 10.0 52.0 A10.10a0a100.001a0.25a0.01a0.1-1.0 10.0 52.0 100.0-1.0 10.0 52.0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1.1-A1.--1040410-1.0 10.0 52.0 100.0-1.0 10.0 52.0 A10.10a0a100.001a0.25a0.01a0.1-1.0 10.0 52.0 100.0-1.0 10.0 52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14846");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3240, 0, 729);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3240 + "'", int3 == 3240);
    }

    @Test
    public void test14847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14847");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 4100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4100.0f + "'", float2 == 4100.0f);
    }

    @Test
    public void test14848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14848");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 724);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 724L + "'", long2 == 724L);
    }

    @Test
    public void test14849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14849");
        long[] longArray6 = new long[] { 1, (short) 1, 62L, (byte) 0, 62L, 10L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 1040410, 1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 1040410, 146);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 1, 62, 0, 62, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 62L + "'", long12 == 62L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a1a62a0a62a10" + "'", str14, "1a1a62a0a62a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "14146240462410" + "'", str16, "14146240462410");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 1 62 0 62 10" + "'", str22, "1 1 62 0 62 10");
    }

    @Test
    public void test14850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14850");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 916, (long) 38, (long) 998);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 998L + "'", long3 == 998L);
    }

    @Test
    public void test14851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14851");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0404104-1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test14852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14852");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-A1.--1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14853");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 100, (int) (byte) 10);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test14854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14854");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 23, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14855");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 998L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14856");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("040");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 32 + "'", number1, 32);
    }

    @Test
    public void test14857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14857");
        long[] longArray5 = new long[] { 10, (-1), 62, (short) 1, (-1L) };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, -1, 62, 1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 62L + "'", long6 == 62L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 62L + "'", long7 == 62L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test14858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14858");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14859");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 476, 189);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14860");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 474, 0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 1" + "'", str13, "-1 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14861");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 4360.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4360.0f + "'", float2 == 4360.0f);
    }

    @Test
    public void test14862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14862");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14863");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 526, (int) (byte) 1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test14864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14864");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10#0#1", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test14865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14865");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14-141041" + "'", str11, "14-141041");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "14-141041" + "'", str13, "14-141041");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1a-1a10a1" + "'", str15, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test14866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14866");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test14867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14867");
        double[] doubleArray6 = new double[] { 1.0f, 'a', ' ', 100.0f, 0L, 1 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0, 32.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a97.0a32.0a100.0a0.0a1.0" + "'", str9, "1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0#97.0#32.0#100.0#0.0#1.0" + "'", str12, "1.0#97.0#32.0#100.0#0.0#1.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14868");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 559, (int) (short) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 233, 100);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a-1a10a1" + "'", str7, "1a-1a10a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a-1a10a1" + "'", str13, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test14869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14869");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10.0 559.0 1040410.0 574.0 559.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14870");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, 558);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14871");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("410a0a10#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"410a0a10#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14872");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1422L, 476.0f, 954.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 476.0f + "'", float3 == 476.0f);
    }

    @Test
    public void test14873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14873");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 10, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#0#10" + "'", str12, "10#0#10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a0a10" + "'", str19, "10a0a10");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10a0a10" + "'", str22, "10a0a10");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test14874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14874");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14875");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14876");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1303, (long) 4732, (long) 2657);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4732L + "'", long3 == 4732L);
    }

    @Test
    public void test14877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14877");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-10a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a", 196);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 196 + "'", int2 == 196);
    }

    @Test
    public void test14878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14878");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 4096, 165);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 555, (int) (short) 23);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#1#0#-1#10" + "'", str17, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test14879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14879");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 100, (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 558, 451);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a1a0a-1a10" + "'", str11, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 1 0 -1 10" + "'", str18, "100 1 0 -1 10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100a1a0a-1a10" + "'", str20, "100a1a0a-1a10");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test14880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14880");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 10, (int) (short) 1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str18, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test14881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14881");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1#-1#10#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14882");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14883");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 558, (double) 4732L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4732.0d + "'", double3 == 4732.0d);
    }

    @Test
    public void test14884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14884");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0000a.000..000a.00a##a00.a000..000.a0000", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14885");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0410.0" + "'", str14, "0.0410.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test14886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14886");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-...a52.0a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14887");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 780, 1);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 -1 10 1" + "'", str11, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test14888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14888");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test14889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA1.1-A1.--#0#A1.1-A1.--#100#.#001#A#0#.#25#A#0#.#01#A#0#.#1#--#1#.#0#A#10#.#0#A#52#.#0#A#100#.#010#A1.1-A1.--#0#A1.1-A1.--#10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA1.1-A1.--#0#A1.1-A1.--#100#.#001#A#0#.#25#A#0#.#01#A#0#.#1#--#1#.#0#A#10#.#0#A#52#.#0#A#100#.#010#A1.1-A1.--#0#A1.1-A1.--#10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14890");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test14891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14891");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("104041010#-1#1#1#-1#100", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test14892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14892");
        int[] intArray6 = new int[] { ' ', 958, 558, 559, 'a', 574 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 656, 550);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 958, 558, 559, 97, 574]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 958 + "'", int7 == 958);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 958 + "'", int8 == 958);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test14893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14893");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 565, 559);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1#1#1#-1#100" + "'", str10, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#1#1#-1#100" + "'", str12, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-141414-14100" + "'", str14, "104-141414-14100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
    }

    @Test
    public void test14894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14894");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a0a10...a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0a10.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14895");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                                                         00                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.0-1.010.052.0100.001#0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14896");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(524, 0, 4657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4657 + "'", int3 == 4657);
    }

    @Test
    public void test14897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14897");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1324.A.25A.A.--.A.A52.A.4.A.25A.A.--.A.A52.A.4.A.25A.A.--.A.A52.A.4.A.25A.A.--.A.A52.A.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14898");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a...0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a10...100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a10.0a52.0a100.0100a1a0a-1a10a-1.0a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14899");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 659, 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 659 + "'", int3 == 659);
    }

    @Test
    public void test14900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14900");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1#0#01#0#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#      -1.0A10.0A52.0A100.0      1#0#01#0#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14901");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0a0.25a0.01a0.1--1.0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0a0.25a0.01a0.1--1.0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14902");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 4360, 4089);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0410.0" + "'", str16, "0.0410.0");
    }

    @Test
    public void test14903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14903");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 100, (-1));
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 993, 1);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a1a0a-1a10" + "'", str11, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test14904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14904");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1a10a-1a1", (long) 823);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 823L + "'", long2 == 823L);
    }

    @Test
    public void test14905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14905");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 1952, 134);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 1422, 4034);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1422");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0404104-1" + "'", str7, "0404104-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14906");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("30.0 10.010#-1#1#1#-1#100 0.0 10.010#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14907");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0101001000.0.0101001000.100.0.001.0.0.0.0..0.0.0.01.0.0.0.1.00.1.0.0.0.10.0.0.0..0.0.0.0.100.0.010.0101001000.0.0101001000.1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14908");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (byte) 10, 10);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 4360, (int) (short) 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1a32" + "'", str20, "-1a32");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test14909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14909");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 23, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14910");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 840, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
    }

    @Test
    public void test14911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14911");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4657, 659, 780);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 659 + "'", int3 == 659);
    }

    @Test
    public void test14912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14912");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 574.0f, 0.0d, (double) 451L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 574.0d + "'", double3 == 574.0d);
    }

    @Test
    public void test14913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14913");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4     #0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14914");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 1, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 823, 189);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long22 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1a1" + "'", str21, "-1a1");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test14915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14915");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-      0.001A0.25A0.01A0.1-      #0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-1414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-141001414-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14916");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) (byte) 100, (int) (byte) 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 1, (int) (short) 1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#0#10" + "'", str9, "10#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
    }

    @Test
    public void test14917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14917");
        double[] doubleArray5 = new double[] { 10.0d, 559, 1040410, 574, 559.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 559.0, 1040410.0, 574.0, 559.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10.0 559.0 1040410.0 574.0 559.0" + "'", str7, "10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test14918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14918");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0.001A0.25A0.01A0.1-      #0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14919");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) '4', (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str14, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str16, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test14920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14920");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(715.0f, 450.0f, (float) 897);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 897.0f + "'", float3 == 897.0f);
    }

    @Test
    public void test14921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14921");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14922");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("040");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test14923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14923");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1010#-1#1#1#-1#1004041010404A1.1-A1.--10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14924");
        long[] longArray2 = new long[] { 109, 100L };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 954, 115);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[109, 100]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test14925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14925");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test14926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14926");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A1.1-A1.--1040410A10.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14927");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double23 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.04100.040.0" + "'", str13, "0.04100.040.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0#100.0#0.0" + "'", str15, "0.0#100.0#0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0 100.0 0.0" + "'", str17, "0.0 100.0 0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0 100.0 0.0" + "'", str19, "0.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0.0#100.0#0.0" + "'", str22, "0.0#100.0#0.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
    }

    @Test
    public void test14928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14928");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 0, (int) (byte) 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
    }

    @Test
    public void test14929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14929");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test14930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14930");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 0, (int) (short) 1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1#-1#10#1" + "'", str9, "1#-1#10#1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1a-1a10a1" + "'", str16, "1a-1a10a1");
    }

    @Test
    public void test14931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14931");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10a0a10#4410.001A0.25");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14932");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444104041010#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14933");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("011a0.25a0.01a0.1-1a0.25a0.01a0.1-#1a0.25a0.01a0.1-1a0.25a0.01a0.1-01a0.25a0.01a0.1-1a0.25a0.01a0.1-#1a0.25a0.01a0.1-1a0.25a0.01a0.1-01A10.100100.0010.250.010.1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test14934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14934");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(550, 3373, 715);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3373 + "'", int3 == 3373);
    }

    @Test
    public void test14935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14935");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 0, (int) (byte) 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float22 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str21, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
    }

    @Test
    public void test14936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14936");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a0a10" + "'", str13, "10a0a10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1040410" + "'", str16, "1040410");
    }

    @Test
    public void test14937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14937");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1.100101E7f, 574.0f, (float) 1755);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.100101E7f + "'", float3 == 1.100101E7f);
    }

    @Test
    public void test14938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14938");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.Class<?> wildcardClass12 = shortArray3.getClass();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14939");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.1--1.0.....A52.0A1100100.0010.250.010.1--1.010.052.0100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14940");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...-1.0A10.0A52.0A0.040.00140.0#     4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14942");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.210#0#10a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test14943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14943");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 3240, 568);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0" + "'", str10, "32 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "3240" + "'", str14, "3240");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test14944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14944");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aAAA#AA#A#A#AA#AAA4A4AAAA4A4aAAAAaAAAAA", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14945");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(689, 872, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test14946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14946");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 574, (int) (short) -1);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test14947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14947");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 298, 1314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 298");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1040410" + "'", str14, "1040410");
    }

    @Test
    public void test14948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14948");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14949");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("3240320.001a0.25a0.01a0.1441.0a10.0a52.0a100.0324032");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".001a0.25\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

