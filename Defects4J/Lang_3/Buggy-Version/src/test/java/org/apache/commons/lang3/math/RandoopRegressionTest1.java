package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00501");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a1a-1a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00502");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0000", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00503");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("!4ih4!4ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!4ih4!4ih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00504");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(13, 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00505");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(29.0f, (float) 130, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 130.0f + "'", float3 == 130.0f);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00506");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("\r1.0a10.0a-1.0", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00507");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4# # ######");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4# # ######");
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
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00508");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00509");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 35, (long) 23, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00510");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00511");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.010.0-1.##.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.010.0-1.##.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00512");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00513");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 17, (long) 7, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00514");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) (short) 100, (long) 23);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 23L + "'", long3 == 23L);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00515");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a1041001041001041001041.010.0-1.0a1041001041001041001041.010.0-1.0a1041001041001041001041.010.0-1.0a1041001041001041001041.010.0-1.0a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00516");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00517");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00518");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, (double) 104100, 23.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00519");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, (long) 97, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00520");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1, 3.0f, (float) 90);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 90.0f + "'", float3 == 90.0f);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00521");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1#35#100#10#-1#0", (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00522");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 0, (float) 7, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 7.0f + "'", float3 == 7.0f);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00523");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(104100, 29, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104100 + "'", int3 == 104100);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00525");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "104100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 104100");
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
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00526");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.04100.04-1.040.0", (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00527");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00528");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1aa4a435.0                               HI!HI!");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00529");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("143541004104-140HI! 10 100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00530");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 81, (float) 0L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 81.0f + "'", float3 == 81.0f);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.010....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.010....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00532");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00533");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 7, (long) 140, 4L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4L + "'", long3 == 4L);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00534");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 13, 571);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
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
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00535");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00536");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1#0.1-0.010.1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1#0.1-0.010.1");
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
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00537");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("3 353 353\n", (double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00538");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), 100.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00539");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2, 110, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00540");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1aa4a435.0                               HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1aa4a435.0                               HI!HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00541");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("15#100#10#-1#0HI! 10 100.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00542");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi100a100a1a-1a100", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00543");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00544");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1 0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00545");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44 4 4#4#4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44 4 4#4#4#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00546");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a4a 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00547");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4100.04-1.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4100.04-1.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00549");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 110, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 25, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00550");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, 0, 104100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00551");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) (byte) 100, (float) 17L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00552");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#35#444#44#-4#4hi!44444.ii  0 000.00.  0 00  0 00  0 0\r#35#444#44#-4#4hi!44444.ii  0 000.00.  0 00  0 00  0 0\r#35#444#44#-4#4hi!44444.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00553");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00554");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                            00  0 0\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                            00  0 0?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00555");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a10a100a97a97a35                                                                                  ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00556");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 9, 301L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00557");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" .     !ih # -#  #   #53# ", (double) 571);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 571.0d + "'", double2 == 571.0d);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00558");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1.0a10.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1.0a10.0a-1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00559");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, ".1.010.0-1.1.010.0-1.1.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .1.010.0-1.1.010.0-1.1.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00560");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00561");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00562");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                    \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00564");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aa4a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa4a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00565");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 0, (long) 33, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 33L + "'", long3 == 33L);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00566");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(30, 16, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00567");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, 301L, (long) 6);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6L + "'", long3 == 6L);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00568");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) -1, (float) 23, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00569");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1#35#100#10#-1#01#35...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00570");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 3, (long) 6);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6L + "'", long3 == 6L);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00571");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                 ", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00572");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a4a 4", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.010.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00574");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("00  0 0\r", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00575");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 23, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00576");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("\r", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00577");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, 571, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00578");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01 0...10#-1#0", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00579");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(52.0f, (float) 6, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00580");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("143541004104-1401#35#100#10#-1#0hi! 10 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00581");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 83, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 83");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#10#100#97#97#35" + "'", str11, "-1#10#100#97#97#35");
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("##.#4###.#4##.#4#.#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#.#4###.#4##.#4#.#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00583");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00584");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00585");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1aa4a435.0                               HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00586");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1 0...10#-1#010a100a100a1a-1a100", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00587");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00588");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.010.0-1", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00589");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00590");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 301, (long) 571, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00591");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4a a a#a#a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4a a a#a#a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00592");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                            a 4 4\r\r\r\r\r\r\r\r\r\r", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00593");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00594");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1041001041001041001041.010.0-1.0tring;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00595");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00596");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r", (float) 14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00597");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3.0f, (double) 90, (double) 6);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0d + "'", double3 == 3.0d);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00598");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100aa4a4hi!hi!aa4a4aa4a44aa4a4\r");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00599");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00600");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a 4 4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00601");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 130, 3L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 130L + "'", long3 == 130L);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00602");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00603");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1a35a100a10a-1a0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00604");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("143541004104-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00605");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00606");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(100L, (long) 140, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00607");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a10000  0 0?hi100a100a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00608");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.010.0-1.##.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00609");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("97a100a1a0a100a3", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00610");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 14, (double) 29.0f, (double) 29);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 29.0d + "'", double3 == 29.0d);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00611");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1 0...1..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 0...1..\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00612");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 104100.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104100.0d + "'", double3 == 104100.0d);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00613");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".1.010.0-1.1.010.0-1.1.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00614");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 14, (long) 110, 301L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00615");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00616");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00617");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("\r4a4aa4a4 aa4a4hi!hi!aa4a400aa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00618");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00619");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444hi! 10 100.0", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00620");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi! 10 100.01#35#100#10#-1#0                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! 10 100.01#35#100#10#-1#0                                                                         is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00621");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI! 10 100.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00622");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("143541004104-140");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00623");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 43, 0L, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00624");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00625");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "97");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 97");
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
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00626");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("16.0#1.01a0.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00627");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) (byte) 10, 104100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00628");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 7.0f, (double) 0L, (double) 130);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 130.0d + "'", double3 == 130.0d);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00629");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1#35#100#10#-1#0\r                                               aa4a4                                                52.010.0-1.0-1.010.052.00#-");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00630");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(17, 16, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00631");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00632");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 83, 301);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 83");
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
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00633");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1aa4a435.0                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1aa4a435.0                                is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00634");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100a1a-1a100", (float) 140L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 140.0f + "'", float2 == 140.0f);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00635");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3L, (float) 9L, (float) 7);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 9.0f + "'", float3 == 9.0f);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00636");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00637");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("   !i1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!i1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00638");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(3L, 2L, (long) 2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00639");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("              hi!               ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00640");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (byte) 1, (int) (byte) -1);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 90, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 90");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00641");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 1, 29);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00642");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a1a-1a", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00643");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) ' ', (int) (short) 1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 52.0f + "'", float17 == 52.0f);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00644");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("16.0#1.01a0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00645");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("97.041.041.04-1.041.04-1.0", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00646");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1041001041001041001041.010.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00647");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00648");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 90L, 0.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00649");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00a4444aaa44444a4444aa44444a4444hia4444!a4444hia4444!a4444aaa44444a4444aa44444a4444 a4444aaa44444a4444aa444444a4444aaa44444a4444aa44444a4444", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00650");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '4', 24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 10, 301);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00651");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00652");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-14104100497497435");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00653");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("              -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00654");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00655");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00656");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00657");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00658");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0#10.0#-1.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00659");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi! 10 1a-", 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00660");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00661");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 16, 0.0d, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00662");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(33, 7, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00663");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0a10.0a-1.0" + "'", str13, "1.0a10.0a-1.0");
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00664");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi! 10 100.hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00665");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(104100L, (long) (short) 100, 14L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00666");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!10100.hi!hi!", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00667");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00668");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                    a-", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("16.0A1.0001a1-a1a001a001a010#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"16.0A1.0001a1-a1a001a001a010#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00670");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" a4a4a#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00671");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 30, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 16.0f + "'", float6 == 16.0f);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00672");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00673");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00674");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 32, 104100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00675");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("143541004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"143541004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00676");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00677");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00678");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1-a", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00679");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!10100.hi!hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00680");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00681");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                             ...10#-1#0                                             ", (double) 47.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 47.0d + "'", double2 == 47.0d);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00682");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 1, (double) 32, (double) 130.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 130.0d + "'", double3 == 130.0d);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00683");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3L, (double) 90L, (double) 14L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.0d + "'", double3 == 90.0d);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00684");
        org.apache.commons.lang3.math.NumberUtils numberUtils0 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils numberUtils1 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils[] numberUtilsArray2 = new org.apache.commons.lang3.math.NumberUtils[] { numberUtils0, numberUtils1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(numberUtilsArray2);
        org.junit.Assert.assertNotNull(numberUtilsArray2);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00685");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(130, (int) '#', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00686");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("00  0 0\r1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01 0...10#-1#0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00687");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi! 10 100.0hi! 10 100.0h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! 10 100.0hi! 10 100.0h is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00688");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00690");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hia!ahia!1#35#100#10#-1#0HI! 10 100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00691");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(32.0f, (float) 43, (float) 30);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 30.0f + "'", float3 == 30.0f);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00692");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("97ii  0 000.00.  0 00  0 00  0 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aa4a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa4a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00694");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a100a100a1a-1a100", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00695");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, 0.0d, (double) 37);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00696");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (double) 29.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444444E129d + "'", double2 == 4.444444444444444E129d);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00697");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(35L, (long) 24, 17L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00698");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00699");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00700");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00701");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00702");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 0, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00703");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 32, (float) 10L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00704");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00705");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0i!hi! 10.0 1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00706");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 5, 104100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00707");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("   !ih    ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00708");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00709");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 13, (long) 11, 17L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 17L + "'", long3 == 17L);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00710");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 37, (float) 33L, (float) 140);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 140.0f + "'", float3 == 140.0f);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00711");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 14, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 1.0 0.0" + "'", str12, "-1.0 1.0 0.0");
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00712");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4L, (long) 16, (long) 14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4L + "'", long3 == 4L);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4                                                a4a                                                              aa4a4                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4                                                a4a                                                              aa4a4                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00714");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a1a-1a", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00715");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4aa4a4\r", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00716");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00717");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (-1L), 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00718");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 0, 1L, (long) 53);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 53L + "'", long3 == 53L);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00719");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, (double) 100L, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00720");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 0, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00721");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00722");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("!IH!IH                                                                                              ", (double) 16.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.0d + "'", double2 == 16.0d);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00723");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00724");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                               aa4a4                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00725");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1.010.0-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00726");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00727");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 571, (long) 301, (long) 24);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24L + "'", long3 == 24L);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00728");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, (int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00729");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("  04 00 04 00 04 00 04 .0 0.0  .0  04 00 04 00 04 00 04 .0 0.0  .0  04 00 04 00 04 00 04 .0 0.0  .0  04 00 04 00 04 00 04 .0 0.0  .0 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00730");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4              -1a10a100a97a97a35                                                                                  4              ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00731");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1 0...1...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00732");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a10", 104100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104100 + "'", int2 == 104100);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00733");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00734");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("143541004104-140HI!a1a-1a10a1a-1a100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00735");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1A10A100A97A97A35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1A10A100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00736");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("010#-1#0a001a001a1a1-a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"010#-1#0a001a001a1a1-a001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00737");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(14, 0, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00738");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("40-1aa4a4hi100a100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"40-1aa4a4hi100a100a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00739");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), (float) 301L, (float) 47L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00740");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, (double) 25, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00742");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 107, 35.0d, (double) 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.0d + "'", double3 == 107.0d);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00743");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00744");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1#35#100#10#-1#0hi!10100.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00745");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00746");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1A1A1A97A97A1#", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00747");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("ii  01 0...1..00.00.  0 00  0 00  0 0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00748");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00749");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                             ...10#-1#0                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00750");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00751");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4444444444        0#-1#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444        0#-1#");
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
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00752");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00753");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00754");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00755");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00756");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(37, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00757");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("16.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#0", (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00758");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.001a1-a1a01a1-a1a!IH041-401400145341");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00759");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00760");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("        0#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00761");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00762");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 53L, 29.0f, (float) 104100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 29.0f + "'", float3 == 29.0f);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00763");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 110, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray2, ".0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00764");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2, 35.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00765");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (byte) 1, (int) (byte) -1);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1#35#100#10#-1#0hi!10100.016.0#1.01a0.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1#35#100#10#-1#0hi!10100.016.0#1.01a0.");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00766");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 47, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "00  0 0\r1#35#100#10#-1#01#35#100#1...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 00  0 0?1#35#100#10#-1#01#35#100#1...");
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
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00767");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1#35#100#10#-1#0hi! 10 100.0", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00768");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001a1-a1a01a1-a1a!IH041-401400145341", 47L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47L + "'", long2 == 47L);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00769");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 2, 81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("041hi! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"041hi! 10 100.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00771");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1), (double) 10L, (double) 9.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00772");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00773");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("140", (float) 23L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 140.0f + "'", float2 == 140.0f);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00774");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaa...", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00775");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1#0.1-0.010.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00776");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 9, 107.0d, (double) 104100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3 == 9.0d);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00777");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00778");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi  ih!!ih!i.hi!hi  ih!!ih!i.hi!hi  ih!!ih!ih!h!!.h!hi  ih!!ih!i.hi!hi  ih!!ih!i.hi!hi  ih!!ih!i.i00ai00aia.iai00", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00779");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(23, (int) (short) 100, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00780");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("01A01A1-53A79A79A001A01A1-0.00101!ih0#1-#01#001#53#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00781");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00782");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" #35#   #  #- # hi!     . 1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-", (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00783");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("041hi! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"41hi! 10 100.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00784");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00785");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 104100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104100.0d + "'", double2 == 104100.0d);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00786");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a-1HI! 10 100.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00787");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(571, (int) (byte) 1, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 571 + "'", int3 == 571);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00788");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00789");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aa4a4hi!hi!aa4a4 aa4a44aa4a4\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa4a4hi!hi!aa4a4 aa4a44aa4a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00790");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1#35#100#10#-1#0HI! 10 100.0143541004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00791");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00792");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 43);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43L + "'", long2 == 43L);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00793");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00795");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 53, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00796");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4     # # #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00797");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######143541004104-14# # ######", 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 79 + "'", int2 == 79);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00798");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("         ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00799");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi! 10 100.0hi! 10 100.0h");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00800");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!ih.!h!.!-h.!hi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!i-100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00801");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00802");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 110, (int) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1.0#10.0#-1.0" + "'", str22, "1.0#10.0#-1.0");
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00803");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00804");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 0, 104100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104100 + "'", int3 == 104100);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00805");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00806");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("   !i1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   !i1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00807");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00808");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (-1), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00809");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a#4#4", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00810");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00811");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00812");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1a101 35 100 10 -1 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a101 35 100 10 -1 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4a4 aa4a44aa4a4\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4a4 aa4a44aa4a4?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00814");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("52.0#10.0#-1.0#-1.0#10.0#52.00#-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00815");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("         AA4A4         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         AA4A4         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00816");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 47, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "hi!10100.hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!10100.hi!hi!");
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
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00817");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 130.0f, (double) 24L, (double) 23L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 130.0d + "'", double3 == 130.0d);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00818");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4, 6, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00819");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) ' ', (int) (short) 1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 0, 0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 52.0f + "'", float17 == 52.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "52.0410.04-1.04-1.0410.0452.0" + "'", str19, "52.0410.04-1.04-1.0410.0452.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00820");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("97a100a1a0a100a3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97a100a1a0a100a3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00821");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 81, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00822");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 35, 571);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00823");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a100.0a-1.0a0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00824");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("40-1aa4a4hi100a100a1a-1a100", (double) 83);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.0d + "'", double2 == 83.0d);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00825");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00826");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 110, (float) (short) -1, (float) 3L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 110.0f + "'", float3 == 110.0f);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00827");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 301, 97.0f, 29.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 29.0f + "'", float3 == 29.0f);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00828");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 10, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-140" + "'", str16, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00829");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a-1HI! 10 100.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00830");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0 10.0 -1.0", (double) 140);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 140.0d + "'", double2 == 140.0d);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00831");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 81, (float) 25, 29.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 25.0f + "'", float3 == 25.0f);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00832");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!", (double) 571);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 571.0d + "'", double2 == 571.0d);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00833");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("--1.0a100.0a-1.0a0.01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: --1.0a100.0a-1.0a0.01 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00834");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1-#0        ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00835");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("        0#-110a100a100a1a-1a10010a100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#-110a100a100a1a-1a10010a100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00836");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 110.0f, (double) 2, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 110.0d + "'", double3 == 110.0d);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00837");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00838");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1#35#100#10#-1#01#35...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#100#10#-1#01#35...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00839");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00840");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00841");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00842");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', (int) (byte) 0, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(".010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00844");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi100a100a1a-1a100", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00845");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1", (long) 49);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00846");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("16.0 1.0######################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00847");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("ng.String;a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [Ljass [Cclacl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00848");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00849");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 4L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00850");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("# # #");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00851");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00852");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("!IH!IH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!IH!IH\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00853");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00854");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 100, (float) 571, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 571.0f + "'", float3 == 571.0f);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00855");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0, 100.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00856");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("00000000000000000000000000000000000000000000000aa4a4000000000000000000000000000000000000000000000000100#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00857");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("101010101010101010101010101010101010101010101010101010101010101044 4 4#4#4#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00858");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("\r", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00859");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(5, 2, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00860");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(90L, (long) 10, (long) 47);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 90L + "'", long3 == 90L);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00861");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100L, (float) 1, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00862");
        org.apache.commons.lang3.math.NumberUtils numberUtils0 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils numberUtils1 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils[] numberUtilsArray2 = new org.apache.commons.lang3.math.NumberUtils[] { numberUtils0, numberUtils1 };
        org.apache.commons.lang3.math.NumberUtils[][] numberUtilsArray3 = new org.apache.commons.lang3.math.NumberUtils[][] { numberUtilsArray2 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(numberUtilsArray3);
        org.junit.Assert.assertNotNull(numberUtilsArray2);
        org.junit.Assert.assertNotNull(numberUtilsArray3);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00863");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a#4#4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00864");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', 24L, 33L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24L + "'", long3 == 24L);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00865");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                   HI4!4HI4!                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                   HI4!4HI4!                        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00866");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("7a100a1a0a100a3", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00867");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi! aa aaaaaa##aaa#aa#aa#a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00868");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                               aa4a4                                                ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00869");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("        0#-1#0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00870");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 14, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
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
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00871");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00872");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal bigDecimal3 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal bigDecimal5 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal[] bigDecimalArray6 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal3, bigDecimal5 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(bigDecimalArray6);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimalArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35.035.035.0" + "'", str7, "35.035.035.0");
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00873");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) (short) 0, (long) 31);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31L + "'", long3 == 31L);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00874");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00875");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00876");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00877");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                       100a1a-1a100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00878");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) ' ', (int) (byte) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 7, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 35 100 10 -1 0" + "'", str16, "1 35 100 10 -1 0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00879");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0i!hi! 10.0 1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0i!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00880");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 110.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 110.0d + "'", double2 == 110.0d);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00881");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3a35" + "'", str9, "3a35");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00882");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 0, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00883");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("!IH!IH");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00884");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 4, (long) 43, 4L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 43L + "'", long3 == 43L);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00885");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97A100A1A0A100A3", 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00886");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00887");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("143541004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1#35#100#10#-1#0hi!10100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00889");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0 100.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00890");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("16.0 1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00891");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                            A 4 4\r\r\r\r\r\r\r\r\r\r", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00892");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 33, 140);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00893");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 79, (long) 39, (long) 16);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 16L + "'", long3 == 16L);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00894");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00895");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 39, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (byte) 0, 25);
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
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00896");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00897");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00898");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00899");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                       hia!ahia!", (double) 49L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.0d + "'", double2 == 49.0d);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00900");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00901");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(32.0f, (float) (short) 10, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00902");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) (byte) 1, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str17, "52.0a10.0a-1.0a-1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 52.0f + "'", float20 == 52.0f);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00903");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1.0#2.0#10.0#16.0#3.0#2.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00904");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".     !ih # -#  #   #53#                                                  #35#   #  #- # hi!     . ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".     !ih # -#  #   #53#                                                  #35#   #  #- # hi!     . \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00905");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(29, 30, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00906");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1#35#100#10#-1#0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00907");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("40");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.0d + "'", double1 == 40.0d);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00908");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 90, (double) '4', (double) 24);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.0d + "'", double3 == 90.0d);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00909");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 0, 95);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00910");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100.0f, (double) 83, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00911");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00912");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1L), 97.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00913");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!ih.!h!.!-h.!hi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!i-100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00914");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 9, (double) 16L, (double) 130);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 130.0d + "'", double3 == 130.0d);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00915");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Ii  0 000.00.  0 00  0 00  0 0\rhia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00916");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("52.44444444444444444444444444444444444144444444444444444444444444444444444.444444444444444444444444444444444441.444444444444444444444444444444444441.44444444444444444444444444444444444144444444444444444444444444444444444.4444444444444444444444444444444444452.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00917");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(".     !ih # -#  #   #53#                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00918");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi! 10 100.0hi! 10 100.0h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10 100.0hi! 10 100.0h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00919");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 16, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a97a97a35" + "'", str11, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00920");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-14104100497497435");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00921");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("001a1-a1a001a00", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00922");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(14, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00923");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) (short) 0, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str14, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 52.0f + "'", float15 == 52.0f);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00924");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1-a", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00925");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa410043541");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00926");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (-1), 0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00927");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(130.0f, 29.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 130.0f + "'", float3 == 130.0f);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00928");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 47, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00929");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaa1", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00930");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI! 10 100.", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00931");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3.0f, (double) 9L, (double) 53L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0d + "'", double3 == 3.0d);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00932");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444444 0#-1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444 0#-1#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00933");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4                                                A4A", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00934");
        int[] intArray3 = new int[] { 6, 30, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[6, 30, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00935");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 7, (double) 24L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.0d + "'", double3 == 24.0d);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00936");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), 47.0f, (float) 43);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 47.0f + "'", float3 == 47.0f);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00937");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(301L, (long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00938");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("143541004104-140");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00939");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("!IH!IH");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00940");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(24, 7, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00942");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(3.0f, (float) 23, (float) 130);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 130.0f + "'", float3 == 130.0f);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00943");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 110.0f, 0.0d, 47.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 110.0d + "'", double3 == 110.0d);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00944");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("##########################################################################################################################################################################################################################################################################################################0#-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00945");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 16, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00946");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("H#35#H!!#H!#-H#!H#35#H!!#H!#-H#!H#35#H!!#H!#H#!H!#!-H#!H#35#H!!#H!#-H#!H#35#H!!#H!#-H#!H#35#H!!#H!#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"H#35#H!!#H!#-H#!H#35#H!!#H!#-H#!H#35#H!!#H!#H#!H!#!-H#!H#35#H!!#H!#-H#!H#35#H!!#H!#-H#!H#35#H!!#H!#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00947");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00948");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.010.0-1.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00949");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00950");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00951");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 32, 0.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00952");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00953");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 6L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00954");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00955");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hia!ahia!1#35#100#10#-1#0HI! 10 100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00956");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("041hi! 10 100.1#0.1-0.010.11#0.1-0.010.11#0.1-0.010.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00958");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00959");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 17.0f, 35.0d, 16.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00960");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100A-1A1A100A100A041-4010", (double) 11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00961");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(7, 29, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00962");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 0, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-140" + "'", str16, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1#35#100#10#-1#0" + "'", str18, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00963");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                       hia!ahia!1#35#100#10#-1#0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00964");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("3 3544444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00965");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00966");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (byte) 1, (int) (byte) -1);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1a0" + "'", str24, "1a0");
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00967");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(40.0d, (double) '#', 571.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00968");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (byte) 100, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00969");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00970");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341", (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00971");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("15#100#10#-1#0HI! 10 100.0", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00972");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(130L, (long) 79, (long) 47);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 130L + "'", long3 == 130L);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00973");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 97, 83);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) -1, 271);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00974");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" .     !ih # -#  #   #53# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  .     !ih # -#  #   #53#  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00976");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 9, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00977");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00978");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(47L, 0L, 4L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00979");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa400145341");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00980");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3435" + "'", str11, "3435");
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00981");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 0, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00982");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("  100aa4a4hi!hi!aa4a4aa4a44aa4a4\r  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00983");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(90L, (long) 29, (long) 33);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 29L + "'", long3 == 29L);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00984");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a", (long) 29);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29L + "'", long2 == 29L);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00985");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (byte) 100, (int) (short) 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
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
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00986");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00987");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(104100.0d, (double) 90, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00988");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1A1A1A97A97A1#hia-1A1A1A97A97-1#10#100#97#97#35-1A1A1A97A97A1#hia-1A1A1A97A97A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00989");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".     !ih # -#  #   #53#                       ", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00990");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00991");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00992");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00993");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', (float) 29, (float) 107);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 107.0f + "'", float3 == 107.0f);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00994");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00995");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "\ra#4#4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ?a#4#4");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00996");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("        0#-1#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00997");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) 23, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00998");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Ii  0 000.00#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test00999");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.01.0#10.0#-1.0", (double) 7.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.0d + "'", double2 == 7.0d);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test01000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

