package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test15501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("97#1#-1#1#100#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97#1#-1#1#100#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15502");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15503");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15504");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15505");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!hi!hi!1.00.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!1.00.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15506");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!   hi! hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15507");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15508");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (int) (byte) 10, (int) (byte) -1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15509");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(817, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15510");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15511");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                            1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15512");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15513");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (-1.41041039E14f), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15514");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "    #");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:     #");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15515");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100 -1 1 1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15516");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15517");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100.0f, (double) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15518");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, (long) (short) 100, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15519");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.0f, (float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15520");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-141041041404100", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-141041041404100L) + "'", long2 == (-141041041404100L));
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15521");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!   hi! ", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15522");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!   hi! hi!1.0 0.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15523");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1", (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15524");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444444444444444444444444444444444444444444497#1#-1#1#100#10", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15525");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15526");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("!ih !ih   !ih!ih !ih   !ih!ih ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15527");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#11", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15528");
        float[] floatArray2 = new float[] { (short) 0, 0.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15529");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) (-1L), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15530");
        float[] floatArray2 = new float[] { (short) 1, (-1.0f) };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100#100#1#-!IH !IH   !IH!IH !IH   !IH!IH 100#100#1#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#100#1#-!IH !IH   !IH!IH !IH   !IH!IH 100#100#1#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15532");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15533");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(10L, (long) '4', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15534");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (-1L), (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15535");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#11");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15536");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, 0.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15537");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Hi!   hi! hi!1.0 0.0            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15538");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, 0.0d, (double) 817L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15539");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15540");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15541");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97a1a-1a1a100a10" + "'", str9, "97a1a-1a1a100a10");
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15542");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi! hi! hi!1.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! hi! \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15543");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15544");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Hii4H4i4Hii4!h4!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hii4H4i4Hii4!h4!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15545");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-141041041404100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15546");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0#0.0", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15547");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, (int) (short) 0, 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 300 + "'", int3 == 300);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15549");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 1, (float) '#', (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("!ih!ih!ih!ih!ih!ih!ih01 001 1 1- 1 79");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih!ih!ih!ih!ih!ih!ih01 001 1 1- 1 79\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15551");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100#100#1#-!IH !IH   !IH!IH !IH   !IH!IH 100#100#1#-", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15552");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1.040.", (long) 817);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 817L + "'", long2 == 817L);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15553");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, (int) (byte) 10, 1164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15554");
        long[] longArray3 = new long[] { (byte) -1, ' ', 1L };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 32, 1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15555");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1.0 35.0 -1.0 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15556");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (short) 1, 1164);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.040.0" + "'", str6, "1.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15557");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 1, (byte) -1, (short) 1, (short) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 1, -1, 1, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#100#1#-1#1#-1" + "'", str8, "100#100#1#-1#1#-1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15558");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10a-1a-1a-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15559");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100 1 0 100 52 -");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100 1 0 100 52 - is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15560");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1L, (long) ' ', (long) 817);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 817L + "'", long3 == 817L);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15561");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!hi!hi!1.00.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15562");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10A0A10A100A1", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15563");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0 0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15564");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1004100414-1414-1!ih!ih!ih!ih!ih!ih!ih01 001 1 1- 1 79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15565");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15566");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("!IH !IH   !IH!IH !IH   !IH!IH ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15567");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi! hi!");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15568");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("97 1 -1 1 100 10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15569");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("!ih !ih   !ih!ih !ih   !ih!ih ", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15570");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 10, 0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15571");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15572");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1", 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15573");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) (byte) -1, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15574");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("!IH !IH   !IH!IH !IH   !IH!IH ", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15575");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15576");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) -1, 0.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15577");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15578");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" hi!hi!   hi! hi!hi!   hi! hi!", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15579");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hII4h4I4hII4!H4!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hII4h4I4hII4!H4!h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15580");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.0#0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0#0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15581");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, 817.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15582");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100 -1 1 1-1100 -1 1 11100 -1 1 110100 -1 1 11", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100 -1 1 10 1!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 -1 1 10 1!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15584");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a10.0", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15585");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), (long) 817, (long) 797);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 817L + "'", long3 == 817L);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15586");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#1#0#100#52#-1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15587");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("i!   hi! hi!1.0 0.0            100 -1 1 1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15588");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 817, 100.0f, (float) 817L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15589");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-1.41041039E14f), (float) (short) 1, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.41041039E14f) + "'", float3 == (-1.41041039E14f));
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15590");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15591");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 0, (float) 'a', (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15592");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) (byte) -1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15593");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15594");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15595");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1164, (double) (-1.0f), (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1164.0d + "'", double3 == 1164.0d);
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15596");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) 186, 1164.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1164.0d + "'", double3 == 1164.0d);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15597");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                            1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                            1.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15598");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100 -1 1 1-1100 -1 1 11100 -1 1 110100 -1 1 11");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15599");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15600");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               10A0A10A100A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               10A0A10A100A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15601");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15602");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!   hi! hi!1.0 0.0            ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("ahi!ahi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ahi!ahi!a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15604");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("ahi!ahi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ahi!ahi!a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15605");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15606");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a-1a1a10a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15607");
        short[] shortArray5 = new short[] { (byte) 100, (byte) 10, (short) 0, (byte) 1, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.Class<?> wildcardClass7 = shortArray5.getClass();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, 10, 0, 1, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15608");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#-1#1#10#1" + "'", str12, "100#-1#1#10#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100#-1#1#10#1" + "'", str14, "100#-1#1#10#1");
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15609");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100#1#0#100#52#-1", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15610");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("i4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15611");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 817, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 817 + "'", int3 == 817);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15612");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15613");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 1, (float) (-1), (float) 817L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 817.0f + "'", float3 == 817.0f);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15614");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4   # # a###########################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4   # # a########################################### is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15616");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("97a1a-1a1a100a10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15617");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(817.0d, (double) '#', (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15618");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(817L, 0L, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15619");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15620");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15621");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15622");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 186, 1L, (long) 797);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15623");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                            1.0 0.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15624");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("97414-1414100410");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15625");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!   hi! hi!1.0 0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15626");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15627");
        float[] floatArray2 = new float[] { (short) 0, 0.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.Class<?> wildcardClass5 = floatArray2.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15628");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("i!   hi! hi!1.0 0.0            100 -1 1 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15629");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, ' ', '4', (byte) 10, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15630");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', (float) 817, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15631");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("!ih !ih   ", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15632");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15633");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 100L, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15634");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, '#');
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10a0a10a100a1" + "'", str9, "10a0a10a100a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#0#10#100#1" + "'", str11, "10#0#10#100#1");
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15635");
        int[] intArray2 = new int[] { (short) 10, 'a' };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) (byte) 0, (int) (short) -1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15636");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15637");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15638");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 0.0" + "'", str5, "1.0 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: !ih!ih!ih!ih!ih!ih!ih is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100a-1a1a10a14   # # a100a-1a1a10a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a-1a1a10a14   # # a100a-1a1a10a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15641");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97414-1414100410" + "'", str11, "97414-1414100410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97414-1414100410" + "'", str13, "97414-1414100410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97a1a-1a1a100a10" + "'", str15, "97a1a-1a1a100a10");
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15642");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, (long) 10, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15643");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!   hi! hi!1.0 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15644");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100#100#1#-1#1#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#100#1#-1#1#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15645");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15646");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "4   # # a###########################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4   # # a###########################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#-1#1#10#1" + "'", str12, "100#-1#1#10#1");
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15647");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15648");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1164.0f, (float) 186, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1164.0f + "'", float3 == 1164.0f);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15649");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15650");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15651");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0#0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15652");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15653");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a-1a-1a-1a1" + "'", str12, "10a-1a-1a-1a1");
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15654");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               10A0A10A100A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15655");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15656");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444497#1#-1#1#100#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444444497#1#-1#1#100#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15657");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) -1, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15658");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15659");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 797, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 797 + "'", int3 == 797);
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15660");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(100.0f, 0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15661");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) '#', 817);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15662");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1004100414-1414-1!ih!ih!ih!ih!ih!ih!ih01 001 1 1- 1 79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15663");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15664");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 0, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0 10.0 0.0 -1.0" + "'", str16, "0.0 10.0 0.0 -1.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15665");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 1164, (int) (byte) -1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15666");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15667");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1.040.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15668");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', (float) 1, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Hi!   hi! hi!1.0 0.0            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!   hi! hi!1.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1#1#-1#1#100#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#1#-1#1#100#100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15671");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) 300, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 300.0f + "'", float3 == 300.0f);
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15672");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10L, (float) 797, (float) 817L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15673");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray5, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#0#10#100#1" + "'", str8, "10#0#10#100#1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15674");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44 4#4#4a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15675");
        long[] longArray4 = new long[] { 'a', (short) 0, 1, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15676");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15677");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 817, 100);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15678");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0 35.0 -1.0 -1.0" + "'", str10, "1.0 35.0 -1.0 -1.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15679");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100#100#1#-1#1#-1hi!   hi! hi!1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#100#1#-1#1#-1hi!   hi! hi!1.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15680");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("11 1 1- 001011 1 1- 00111 1 1- 0011-1 1 1- 001001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11 1 1- 001011 1 1- 00111 1 1- 0011-1 1 1- 001001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15681");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) '#', (long) 797);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 797L + "'", long3 == 797L);
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15682");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 1, (long) '#', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15683");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15684");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1#1#-1#1#100#100", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15685");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("97a1a-1a1a100a10", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15686");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15687");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10.0f, 0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15688");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15689");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1164.0d, (double) 797L, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1164.0d + "'", double3 == 1164.0d);
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15690");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hii4H4i4Hii4!h4!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15691");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 1, (-1));
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15692");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#-1#-1#1" + "'", str12, "10#-1#-1#-1#1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15694");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 1, 797);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15695");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!IH\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15696");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("i!   hi! hi!1.0 0.0            100 -1 1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15698");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15699");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("class [Ljava.lang.CharSequence;class [Sclass [Shi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15700");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15701");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("01 001 1 1- 1 7997 1 -1 1 100 1097 1 -1 1 100 1097 1 -1 1 100 1097 1 -1 1 100 1097 1 -1 1 100 1097 1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15702");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15703");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 1, (double) (byte) 0, (double) (-1.41041039E14f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15704");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 10.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15705");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4a a#a#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4a a#a#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15706");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) 186, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 186.0f + "'", float3 == 186.0f);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15707");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 100, (int) (short) 100);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 186, 100);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a100a100" + "'", str13, "-1a10a100a100");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15708");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100 -1 1 1-1100 -1 1 11100 -1 1 110100 -1 1 11");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15709");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100 1 0 100 52 -", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15710");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1a10a1a-1a100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15711");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("       !ih!ih!ih!ih!ih!ih!ih       ", 300.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 300.0f + "'", float2 == 300.0f);
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15712");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15713");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#1#-1#1#100#100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15714");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" hi!hi!   hi! hi!hi!   hi! hi!1004100414-1414-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15715");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) '#', (int) ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.040.0" + "'", str6, "1.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.040.0" + "'", str13, "1.040.0");
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15716");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#100#1#-1#1#-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15717");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1.0 35.0 -1.0 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15718");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15719");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15720");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1004-14141041", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15721");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 0.0" + "'", str5, "1.0 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0a0.0" + "'", str8, "1.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0a0.0" + "'", str12, "1.0a0.0");
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15722");
        long[] longArray4 = new long[] { 'a', (short) 0, 1, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15723");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("97#1#-1#1#100#10", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15724");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0035.00-1.00-1.00000000000000000000000000000000000000000000000000000000000000000000000000000000", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15725");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', 0, 817);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15726");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15727");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(" 35.0 -1.0 -1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15728");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100#1#0#100#52#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#1#0#100#52#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15729");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110hi!hi!hi!1.00.010a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a-1a-1a-1a110a", (long) 186);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 186L + "'", long2 == 186L);
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15730");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 0.0d, (double) 1164);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1164.0d + "'", double3 == 1164.0d);
    }

    @Test
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15731");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Hi! hi! hi!1.0 0.0hi!   hi! hi!1.0 0.01004-14141041");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15732");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                         0.0a10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15733");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0 35.0 -1.0 -1.0" + "'", str10, "1.0 35.0 -1.0 -1.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15734");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1a10a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15735");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1004100414-1414-1Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15736");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ihhi! hi! hi!1.0 0.0!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15737");
        int[] intArray2 = new int[] { (short) 10, 'a' };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) (byte) 0, (int) (short) -1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#97" + "'", str10, "10#97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15738");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.0#0.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15739");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4   # # a###########################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4   # # a###########################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15740");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                            1.0 0.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15741");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" hi!hi!   hi! hi!hi!   hi! hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15742");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10a-1a-1a-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a-1a-1a-1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15743");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1L), (float) 1L, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test15744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15744");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 1, (byte) -1, (short) 1, (short) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 1, -1, 1, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#100#1#-1#1#-1" + "'", str8, "100#100#1#-1#1#-1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100#100#1#-1#1#-1" + "'", str11, "100#100#1#-1#1#-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15745");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("14100432452410410");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.41004324E16f + "'", float1 == 1.41004324E16f);
    }

    @Test
    public void test15746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15746");
        int[] intArray2 = new int[] { (short) 10, 'a' };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) (byte) 0, (int) (short) -1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test15747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15747");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(300.0f, (float) (byte) 100, 186.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test15748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15748");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', (int) (byte) -1, 100);
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
    }

    @Test
    public void test15749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15749");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(100.0d, (double) (byte) -1, (double) 817L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test15750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15750");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.040.0" + "'", str6, "1.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a0.0" + "'", str9, "1.0a0.0");
    }

    @Test
    public void test15751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15751");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 'a', (long) '4', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test15752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15752");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test15753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15753");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.0#0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0#0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15754");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1#1#-1#1#100#1001001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test15755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15755");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100#100#1#-1#1#-1hi!   hi! hi!1.0 0.01.040.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#100#1#-1#1#-1hi!   hi! hi!1.0 0.01.040.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15757");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, (float) (short) 0, 797.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15758");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1164, 100L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test15759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15759");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) (short) 0, (double) 797.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15760");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15761");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test15762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15762");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 10.0 0.0 -1.0" + "'", str12, "0.0 10.0 0.0 -1.0");
    }

    @Test
    public void test15763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15763");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4   # # a", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test15764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15764");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15765");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0#0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15766");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test15767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15767");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100#-1#1#10#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15768");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "#0#10#100#1Hii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHihia!a   ahia!a ahia!a1a.a0a a0a.a0a            ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #0#10#100#1Hii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHii4H4i4Hii4!h4!HHihia!a   ahia!a ahia!a1a.a0a a0a.a0a            ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test15769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15769");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 10, (-1), 1341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1341 + "'", int3 == 1341);
    }

    @Test
    public void test15770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15770");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10L, (-1.0f), (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test15771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15771");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test15772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15772");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" hi!hi!   hi! hi!hi!   hi! hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15773");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 100, 0);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "97414-1414100410");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 97414-1414100410");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test15774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15774");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("!IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH hi!   hi! hi!1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15775");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("!ih !ih   !ih !ih  ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15776");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!   hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!   hi!  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15777");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi! hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! hi! hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15778");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#-1#-1#-1#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15779");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a-1a-1a-1a1" + "'", str13, "10a-1a-1a-1a1");
    }

    @Test
    public void test15780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15780");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" hi!hi!   hi! hi!hi!   hi! hi!1004100414-1414-1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test15781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15781");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 1, (int) (byte) 0);
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
    public void test15782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15782");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh                                                                                           a-1a1a10aHi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah!4H!4IIh4I4h4IIh");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void test15783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15783");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                         hi!hi!hi!1.00.0                                         ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15784");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15785");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#0#10#1...52-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15786");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!   hi! hi!1.0 0.0            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!   hi! hi!1.0 0.0            \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15787");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4a a#a#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15788");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1414-1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15789");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".0 0.0hi!   hi! hi!1.0 0.", (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test15790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15790");
        long[] longArray1 = new long[] { 0L };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test15791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15791");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0#0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15792");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 1, (byte) -1, (short) 1, (short) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (byte) 100, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 1, -1, 1, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#100#1#-1#1#-1" + "'", str8, "100#100#1#-1#1#-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1004100414-1414-1" + "'", str10, "1004100414-1414-1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test15793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15793");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15794");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0L, (double) (-1.41041039E14f), (double) 186L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.41041038524416E14d) + "'", double3 == (-1.41041038524416E14d));
    }

    @Test
    public void test15795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15795");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 0, 1L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test15796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15796");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15797");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("97 1 -1 1 100 10ahi!ahi!aahi!ahi!aahi!ahi!aahi!ahi!a", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test15798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15798");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) (byte) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test15799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15799");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray5, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#0#10#100#1" + "'", str8, "10#0#10#100#1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test15800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15800");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1#1#-1#1#100#100", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test15801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15801");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, (int) '#', 1341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test15802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15802");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0 10.0 0.0 -1.0", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test15803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15803");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a-1a1a10a1" + "'", str11, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test15804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15804");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.040.0" + "'", str6, "1.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0 0.0" + "'", str9, "1.0 0.0");
    }

    @Test
    public void test15805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15805");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Hi! hi! hi!1.0 0.0hi!   hi! hi!1.0 0.01004-14141041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15806");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(300.0f, (float) (byte) 10, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 300.0f + "'", float3 == 300.0f);
    }

    @Test
    public void test15807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15807");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15808");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) (-1), 1164.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1164.0d + "'", double3 == 1164.0d);
    }

    @Test
    public void test15809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15809");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, 0L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test15810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15810");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! h-1#1#-1#1#100#100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15811");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15812");
        float[] floatArray2 = new float[] { (short) 0, 0.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) (short) 10, (int) (short) 1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test15813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15813");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, 186, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 186 + "'", int3 == 186);
    }

    @Test
    public void test15814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15814");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1.00.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15815");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', 0, (int) (byte) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (short) 0, (-1));
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0 35.0 -1.0 -1.0" + "'", str19, "1.0 35.0 -1.0 -1.0");
    }

    @Test
    public void test15816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15816");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test15817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15817");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--1410410414041001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15818");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1164.0d, 0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15819");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410010100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410010100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410014100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--1410410414041001-100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410014100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410014100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410010100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410014100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--1410410414041001");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15820");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', 817.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 817.0f + "'", float3 == 817.0f);
    }

    @Test
    public void test15821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15821");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("H!h!iiHiHiih", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test15822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15822");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("class [Ljava.lang.CharSequence;class [Sclass [Shi!   Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1hi!   Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1hi!   Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1hi!   Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1.0 0.0            Hi!   hi! hi!1h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15823");
        float[] floatArray2 = new float[] { (short) 1, (-1.0f) };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0#-1.0" + "'", str5, "1.0#-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0a-1.0" + "'", str7, "1.0a-1.0");
    }

    @Test
    public void test15824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15824");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test15825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15825");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 1164, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15826");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test15827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15827");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (short) 1, (int) (short) 1);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.Class<?> wildcardClass14 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15828");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -1, 1L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test15829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15829");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("!ih !ih   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15830");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 186, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 186 + "'", int3 == 186);
    }

    @Test
    public void test15831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15831");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hii0H0i0Hii0!h0!H", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test15832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15832");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 100, 0);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "    1.040.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:     1.040.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test15833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15833");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10a-1a-1a-1a1", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test15834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15834");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15835");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a-1a1a10a", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test15836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15836");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" hi!hi!   hi! hi!hi!   hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" hi\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15837");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), (long) (short) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test15838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15838");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" hi!hi!   hi! hi!hi!   hi! hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15839");
        float[] floatArray1 = new float[] { 797 };
        float float2 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) '#', 817);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[797.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 797.0f + "'", float2 == 797.0f);
    }

    @Test
    public void test15840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15840");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("i4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15841");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 1, (-1.0f), (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test15842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15842");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, 0.0d, (double) 3145);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15843");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(186L, 817L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 817L + "'", long3 == 817L);
    }

    @Test
    public void test15844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15845");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, ' ', '4', (byte) 10, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 100, 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test15846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15846");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 1, (byte) -1, (short) 1, (short) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 1, -1, 1, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#100#1#-1#1#-1" + "'", str8, "100#100#1#-1#1#-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1004100414-1414-1" + "'", str10, "1004100414-1414-1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test15847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15847");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1, (long) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test15848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15848");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                             ahi!ahi!a                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15849");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (long) 300, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test15850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15850");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("97 1 -1 1 100 10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15851");
        short[] shortArray5 = new short[] { (byte) 100, (byte) 10, (short) 0, (byte) 1, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, 10, 0, 1, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void test15852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15852");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 0.0" + "'", str7, "1.0 0.0");
    }

    @Test
    public void test15853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15853");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100 -1 1 10 1!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15854");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                1004100414-1414-1Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15855");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.0 .0 0.0 .0 0.0!.0 0.0I.0 0.0H.0 0.0!.0 0.0I.0 0.0H.0 0.0 .0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.00.0 0.00.0 0.0#.0 0.01.0 0.0#.0 0.0-.0 0.0", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test15856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15856");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (byte) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', (int) (short) 100, 900);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#-1#-1#1" + "'", str12, "10#-1#-1#-1#1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15857");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 300, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test15858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15858");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10#0#10#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#0#10#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15859");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10L, 1.41004324E16f, 186.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test15860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15860");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test15861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15861");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                         1.0 35.0 -1.0 -1.0                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15862");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, (long) 797, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 797L + "'", long3 == 797L);
    }

    @Test
    public void test15863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15863");
        long[] longArray5 = new long[] { (short) -1, 900, '4', ' ', ' ' };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-1, 900, 52, 32, 32]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test15864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15864");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test15865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15865");
        float[] floatArray1 = new float[] { 797 };
        float float2 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 3145, (int) (short) 0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[797.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 797.0f + "'", float2 == 797.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 797.0f + "'", float3 == 797.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "797.0" + "'", str5, "797.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test15866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15866");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(900, 0, 3145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15867");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("97 1 -1 1 100 10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15868");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("H!h!iiHiHiihH!h!iiHiHiihH!h!iiHiHiih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"H!h!iiHiHiihH!h!iiHiHiihH!h!iiHiHiih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15869");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 900, 1164.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15870");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void test15871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15871");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 001");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15872");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#-1#-1#1" + "'", str12, "10#-1#-1#-1#1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test15873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15873");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', 186, 817);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 186");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test15874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15874");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                               hi!hi!hi!1.00.0                                         ", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test15875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15875");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1004-14141041" + "'", str13, "1004-14141041");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test15876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15876");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                         1.0 35.0 -1.0 -1.0                                         100 -1 1 10 1", (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test15877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15877");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IHHI! HI! HI!1.0 0.0!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15878");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(797L, (long) 186, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 797L + "'", long3 == 797L);
    }

    @Test
    public void test15879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15879");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) 0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test15880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15880");
        float[] floatArray2 = new float[] { (short) 1, (-1.0f) };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 1, (int) (byte) -1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test15881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15881");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0a10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15883");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.035.0-1.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.035.0-1.0-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15884");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("97a1a-1a1a100a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15885");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1#1#-1#1#100#1001001010052-1...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15886");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100#100#1#-1#1#-1", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test15887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15887");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("797.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"797.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15888");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test15889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15889");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" hi!hi!   hi! hi!hi!   hi! hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15890");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test15891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15891");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', (int) 'a', 3145);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15892");
        float[] floatArray2 = new float[] { (short) 0, 0.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) ' ', 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0#0.0" + "'", str6, "0.0#0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test15893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15893");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) (byte) 100, (int) (short) -1);
        short short21 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) -1 + "'", short21 == (short) -1);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 100 + "'", short22 == (short) 100);
    }

    @Test
    public void test15894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15894");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test15895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15895");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#11                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test15896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15896");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100#-1#1#10#1" + "'", str11, "100#-1#1#10#1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test15897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15897");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97414-1414100410" + "'", str11, "97414-1414100410");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test15898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15898");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test15899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15899");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, 1341, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1341 + "'", int3 == 1341);
    }

    @Test
    public void test15900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15900");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0a10.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15901");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test15902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15902");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15903");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4# #####a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15904");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 100, (int) '4');
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100414041004524-1" + "'", str11, "100414041004524-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#100#52#-1" + "'", str13, "100#1#0#100#52#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test15905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15905");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15906");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', (long) 900, (long) 817);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test15907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15907");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test15908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15908");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test15909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15909");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                             ahi!ahi!a                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                             ahi!ahi!a                                              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15910");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10a0a10a100a1100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15911");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1414-1", (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test15912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15912");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0435.04-1.04-1.0", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test15913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15913");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test15914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15914");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("H!h!iiHiHiih");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15915");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0 10.0 0.0 -1.0" + "'", str15, "0.0 10.0 0.0 -1.0");
    }

    @Test
    public void test15916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15916");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a10a1" + "'", str13, "100a-1a1a10a1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15917");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15918");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10A0A10A100A1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15919");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97a1a-1a1a100a10" + "'", str19, "97a1a-1a1a100a10");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test15920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15920");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!hi! hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test15921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15921");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test15922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15922");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test15923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15923");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100#100#1#-1#1#-1hii4100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 14i4100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1ii4100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1h4100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15924");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 1, (byte) -1, (short) 1, (short) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 1, -1, 1, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#100#1#-1#1#-1" + "'", str8, "100#100#1#-1#1#-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1004100414-1414-1" + "'", str10, "1004100414-1414-1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#100#1#-1#1#-1" + "'", str13, "100#100#1#-1#1#-1");
    }

    @Test
    public void test15925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15925");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 0, (-1));
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15926");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray5, '4');
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1040410410041" + "'", str8, "1040410410041");
    }

    @Test
    public void test15927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15927");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                               hi!hi!hi!1.00.0                                         ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15928");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15929");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a100a100" + "'", str13, "-1a10a100a100");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test15930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15930");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 0, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a10.0a0.0a-1.0" + "'", str16, "0.0a10.0a0.0a-1.0");
    }

    @Test
    public void test15931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15931");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15932");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.Class<?> wildcardClass15 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100414041004524-1" + "'", str11, "100414041004524-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#100#52#-1" + "'", str13, "100#1#0#100#52#-1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15933");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test15934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15934");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (long) 813, (long) 909);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 909L + "'", long3 == 909L);
    }

    @Test
    public void test15935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15935");
        float[] floatArray2 = new float[] { (short) 1, (-1.0f) };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0#-1.0" + "'", str5, "1.0#-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 -1.0" + "'", str7, "1.0 -1.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test15936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15936");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 900, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 900L + "'", long3 == 900L);
    }

    @Test
    public void test15937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15937");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1164.0d, (double) 1L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1164.0d + "'", double3 == 1164.0d);
    }

    @Test
    public void test15938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15938");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15939");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a-1a1a10a1" + "'", str12, "100a-1a1a10a1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a-1a1a10a1" + "'", str14, "100a-1a1a10a1");
    }

    @Test
    public void test15940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15940");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, (float) (-1), (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test15941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15941");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 100, (int) (byte) 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15942");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("52");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test15943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15943");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1                               hi!hi!hi!1.00.0                                          hi!hi!   hi! hi!hi!   hi! hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15944");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, ' ', '4', (byte) 10, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 1164, 100);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "14100432452410410" + "'", str9, "14100432452410410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 100 32 52 10 10" + "'", str15, "1 100 32 52 10 10");
    }

    @Test
    public void test15945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15945");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("H!h!iiHiHiih", (-1.41041039E14f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.41041039E14f) + "'", float2 == (-1.41041039E14f));
    }

    @Test
    public void test15946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15946");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH !IH !IH   !IH!IH !IH   !IH!IH hi!   hi! hi!1.0 0.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               11 1 1- 001011 1 1- 00111 1 1- 0011-1 1 1- 00");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15947");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.00.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test15948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15948");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 797L, (float) 10L, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test15949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15949");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', (int) (byte) 100, (int) (byte) 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 1164, (int) (byte) 0);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
    }

    @Test
    public void test15950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15950");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                -1a10a100a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15951");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("97a1a-1a1a100a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97a1a-1a1a100a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15952");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                -1a10a100a100", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test15953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15953");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 575);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 575.0d + "'", double2 == 575.0d);
    }

    @Test
    public void test15954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15954");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (byte) 100, 186L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test15955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15955");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1L), 1164.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1164.0f + "'", float3 == 1164.0f);
    }

    @Test
    public void test15956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15956");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 797, (double) (byte) 1, (double) 3145);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test15957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15958");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test15959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15959");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1!IH1!IH111!IH!IH1!IH111!IH!IH1100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410010100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410010100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410014100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--1410410414041001-100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410014100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410014100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410010100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410014100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--14104104140410011100-141041041404100#-1410410414041001-141041041404100#-1410410414041000-141041041404100#-141041041404100100-141041041404100#-14104104140410052-141041041404100#-141041041404100--1410410414041001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15960");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4   # # a###########################################", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test15961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15961");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3145, (long) (byte) 10, (long) 4768);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test15962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15962");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 817, (int) (byte) -1);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97a1a-1a1a100a10" + "'", str9, "97a1a-1a1a100a10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test15963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15963");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15964");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("!ih !ih   !ih!ih !ih   !ih!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15965");
        double[] doubleArray4 = new double[] { 1.0f, '#', (-1), (-1.0d) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', (int) (byte) 10, (int) (short) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.0, 35.0, -1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0 35.0 -1.0 -1.0" + "'", str10, "1.0 35.0 -1.0 -1.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test15966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15966");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(3145, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3145 + "'", int3 == 3145);
    }

    @Test
    public void test15967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15967");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97a1a-1a1a100a10" + "'", str19, "97a1a-1a1a100a10");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test15968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15968");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10A0A10A100A1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10A0A10A100A1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15969");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("!ih !ih   !ih !ih  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15970");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 0010.0 0.1!ih !ih   !ih1- 25 001 0 1 001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15971");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        java.lang.Class<?> wildcardClass14 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97 1 -1 1 100 10" + "'", str13, "97 1 -1 1 100 10");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15972");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...i!100 1 0 100 52 -1hi!   hi! ...", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test15973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15974");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Hi! hi! hi!1.0 0.0hi!   hi! hi!1.0 0.01004-14141041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15975");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100414041004524-1" + "'", str11, "100414041004524-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#100#52#-1" + "'", str13, "100#1#0#100#52#-1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a1a0a100a52a-1" + "'", str19, "100a1a0a100a52a-1");
    }

    @Test
    public void test15976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15976");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 0, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0 10.0 0.0 -1.0" + "'", str16, "0.0 10.0 0.0 -1.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test15977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15977");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 909, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15978");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, 0L, 817L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test15979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15979");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110hi!hi!hi!1.00.010-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110hi!hi!hi!1.00.010-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110-1-1-1110\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15981");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1.0 35.0 -1.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15982");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 1, (byte) -1, (short) 1, (short) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 1, -1, 1, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#100#1#-1#1#-1" + "'", str8, "100#100#1#-1#1#-1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100#100#1#-1#1#-1" + "'", str11, "100#100#1#-1#1#-1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test15983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15983");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (long) ' ', (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test15984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15984");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                            1.0 0.0", (-1.41041038524416E14d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.41041038524416E14d) + "'", double2 == (-1.41041038524416E14d));
    }

    @Test
    public void test15985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15985");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 35.0 -1.0 -1.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15986");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, (-1));
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test15987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15987");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0 0.0hi!   hi! hi!1.0 0.", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test15988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15988");
        double[] doubleArray3 = new double[] { 0, (short) 1, 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 10, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test15989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15989");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', (int) (short) 100, 186);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a100a100" + "'", str13, "-1a10a100a100");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
    }

    @Test
    public void test15990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15990");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1a10a1a-1a100i!   hi! hi!1.0 0.0           ", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test15991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15991");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi! hi!", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test15992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi! hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! hi\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15993");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a44 4#4#4a", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test15994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15994");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(".040.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test15995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15995");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100a-1a1a10a1hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!4hi4!4 4hi4!4 4hi4!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test15996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15996");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1, (long) (-1), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test15997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15997");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 4768, (double) 186, (double) 4768);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4768.0d + "'", double3 == 4768.0d);
    }

    @Test
    public void test15998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15998");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.040.0" + "'", str6, "1.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test15999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("52-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test16000");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.Class<?> wildcardClass19 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

