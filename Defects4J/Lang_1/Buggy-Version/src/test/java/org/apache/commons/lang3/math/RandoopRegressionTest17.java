package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08501");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08502");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08503");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (-140));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str18, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08504");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 244, 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 244 + "'", int3 == 244);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08505");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08506");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str16, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str18, "0.0a-1.0a10.0a100.0a0.0");
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08507");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 875, (float) 81, 151.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 81.0f + "'", float3 == 81.0f);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08508");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444                  10A-1A100A100A1                   444444444444444444444444", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08509");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 1662L, (double) 672);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08510");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 0, 507);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08511");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 81, 399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 81");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#-1#100#100#1" + "'", str20, "10#-1#100#100#1");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08512");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                  10#-1#100#100#1", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08513");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08514");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 70, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 1024, 1857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1024");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 10 0 -1 100 0" + "'", str12, "10 10 0 -1 100 0");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#10#0#-1#100#0" + "'", str16, "10#10#0#-1#100#0");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08515");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 76, (double) 716, (double) 168L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 76.0d + "'", double3 == 76.0d);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08516");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08517");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1749.0d, (double) 231.0f, (double) 1758);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1758.0d + "'", double3 == 1758.0d);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08518");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#4A4#4A44444444444444444444444444441#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH!IH      1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IHAAAAAAA!IH      1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH      1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH!IH001#001#1-#1-AAAAA!IHAAAAAAAAAAAA!IHaa#aaa                                                                                              !IHH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08519");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             !ih!ih!ih0.1- 0.001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08520");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08521");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a#", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08522");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("040014141-4001", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08523");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08524");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08525");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08526");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08527");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###111111111111111111");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08528");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), 231, 553);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08529");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) '#', (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 549, 168);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str20, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str22, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08530");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!hhi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0#4#44a ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0#4#44a ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08532");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "104-14100410041" + "'", str12, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08533");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a100a0" + "'", str13, "100a-1a1a100a0");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08534");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 1857, 175);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("11hi!hi!hi! 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11hi!hi!hi! 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08536");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 265, 100);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 539, 392);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str15, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08537");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#4444444#", (float) 543L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 543.0f + "'", float2 == 543.0f);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08538");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1" + "'", str12, "10 -1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a-1" + "'", str15, "10a-1");
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08539");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a                       ...#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08540");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (-1), 416);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "104-14100410041" + "'", str12, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08541");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("     1#001#001#1-#01                                     1#001#001#1-#01                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08542");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                             4aaa4aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4aaa4aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08543");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08544");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08545");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 383, (int) (byte) -1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 647, 409);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08546");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                  10#-1#100#100#1                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08547");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaa#4#44a                                                                                           aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08548");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 176, (int) '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08549");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(200, 1024, 1657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1657 + "'", int3 == 1657);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08550");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08551");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1852, (long) 180, (long) 4393);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 180L + "'", long3 == 180L);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08552");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           A100.0a0.0a97.0a   hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08553");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.04-1.041HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08554");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) -1, (-1));
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08555");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1#10#1#100#100" + "'", str9, "-1#10#1#100#100");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a10a1a100a100" + "'", str12, "-1a10a1a100a100");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("!ih!ih!...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08557");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("##############################hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h##############################", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08558");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aa#aaa#aaaaa#aaa#aaaaaaaaaaaa#aaa#aa#aaa#aaHaaaaa#aaa#aaaaa#aaa#aaaaaaaaaaaa#aaa#aa#aaa#aaHaaaaaaaaaaaa#aaa#aaaaa#aaa#aaaaaaaaaaaa#aaa#aa#aaa#aaHaa#aaa#aaaaa#aaa#aaaaaaaaaaaa#aaa#aa#aaa#aaHaaaHIaHIaHIa                  10#-1#100#100#1                                     10#-1#100#100#1     ", 309);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 309 + "'", int2 == 309);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08559");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08560");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(507, 151, 399);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 507 + "'", int3 == 507);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08561");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a# #4a#4a4#   a# #4a#4a4#   a...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08562");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("############################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###########################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08563");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#-1#100#100#1", 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08564");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14-141004100" + "'", str10, "-14-141004100");
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08565");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(151.0d, (double) 1, (double) 231.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08566");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.011111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08567");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ## ##AaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaAaAAaaaA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08568");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (long) 131);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 131L + "'", long2 == 131L);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08569");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08570");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 416, 410.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 416.0f + "'", float3 == 416.0f);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08571");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3068, 410, 194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 194 + "'", int3 == 194);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08572");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "104-1" + "'", str8, "104-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08573");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-11#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi! 1.0a100.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08574");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08575");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaa!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaa!ih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08576");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 265.0f, 515.0d, (double) 1857.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1857.0d + "'", double3 == 1857.0d);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08577");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaa100.0a0.0a97.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08578");
        float[] floatArray3 = new float[] { (byte) 0, (byte) 1, (-1.0f) };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0 1.0 -1.0" + "'", str6, "0.0 1.0 -1.0");
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08579");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ##########################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08580");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0A100.0                                                             ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08581");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0-1.010.0100.00.0-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08582");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08583");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("# #   a", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08584");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 2648, 0.0f, (float) 59);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08585");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08586");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10410404-141004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10410404-141004\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08587");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str14, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#######################################################################################################################################################################4#44A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######################################################################################################################################################################4#44A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08589");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 3072, 176);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 127, 0);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08590");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08591");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.01111111111111111111##-1#1###1###111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08592");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaa4aa!ih!ih!ih!ih!a4a44!ih!ih!ih!ih!HI!AAAAAAA", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08593");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08594");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10#-1#100#100#1 10#-1#100#100#1!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10#-1#100#100#1 10#-1#100#100#1!ih is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08595");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 1662, 129);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a35.0a-1.0a10.0a-1.0" + "'", str12, "0.0a35.0a-1.0a10.0a-1.0");
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08596");
        int[] intArray4 = new int[] { (-140), 3072, 10, 1758 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray4, '#', 176, (int) 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-140, 3072, 10, 1758]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3072 + "'", int9 == 3072);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3072 + "'", int10 == 3072);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08597");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int27 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "104-14100410041" + "'", str25, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08598");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 164, (float) 1749, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08599");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("Hi!hi!hi!", 265.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 265.0d + "'", double2 == 265.0d);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08600");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1662, (float) 409L, (float) 409);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1662.0f + "'", float3 == 1662.0f);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08601");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("IIIIIIIIII");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08602");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a4444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a4444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08603");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 409.0f, (double) 370L, (double) 549.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 549.0d + "'", double3 == 549.0d);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08604");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001#0.14444444444444444aaaaaaa!ih44444444444444444444444444444444444444444444444i!                  10#-1#100#10", 3068);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3068 + "'", int2 == 3068);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08605");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, 4440L, (long) 125);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4440L + "'", long3 == 4440L);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08606");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                              # aaa # aa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08607");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 244, (-140));
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0a1a35a0a1a-1" + "'", str13, "0a1a35a0a1a-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0 1 35 0 1 -1" + "'", str19, "0 1 35 0 1 -1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0a1a35a0a1a-1" + "'", str21, "0a1a35a0a1a-1");
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08608");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.Class<?> wildcardClass12 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08609");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3072.0f, 1758.0d, (double) 615);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 615.0d + "'", double3 == 615.0d);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08610");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.Class<?> wildcardClass8 = byteArray2.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!aaaaaaa", "hi!", "" };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!aaaaaaa", "hi!", "" };
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.prependIfMissing("hi!aaaaaaa", (java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray25);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "#aaa#aa");
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("#4#4 4a", strArray17, strArray29);
        java.lang.Class<?> wildcardClass31 = strArray17.getClass();
        double[] doubleArray35 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join(doubleArray35, ' ', (int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass40 = doubleArray35.getClass();
        java.lang.Class[] classArray42 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray43 = (java.lang.Class<?>[]) classArray42;
        wildcardClassArray43[0] = wildcardClass8;
        wildcardClassArray43[1] = wildcardClass31;
        wildcardClassArray43[2] = wildcardClass40;
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray43);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[]) wildcardClassArray43);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!aaaaaaa" + "'", str27, "hi!aaaaaaa");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#4#4 4a" + "'", str30, "#4#4 4a");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(wildcardClassArray43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "class [Bclass [Ljava.lang.String;class [D" + "'", str50, "class [Bclass [Ljava.lang.String;class [D");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "class [Bclass [Ljava.lang.String;class [D" + "'", str51, "class [Bclass [Ljava.lang.String;class [D");
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08611");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08612");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 517L, (double) 195, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08613");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.4444446E32f + "'", float1 == 4.4444446E32f);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08614");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(383L, (long) 520, (long) 168);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 168L + "'", long3 == 168L);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08615");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 151, 1024);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1024 + "'", int3 == 1024);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08616");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08617");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 10, (double) 615.0f, (double) 175.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08618");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 76, 129L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08619");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 ", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08620");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(167, 151, 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 168 + "'", int3 == 168);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08621");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08622");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str12, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08623");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 553, (int) (byte) 100);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08624");
        long[] longArray3 = new long[] { (-140L), 100, 370 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-140, 100, 370]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-140a100a370" + "'", str5, "-140a100a370");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-140L) + "'", long6 == (-140L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 370L + "'", long7 == 370L);
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08625");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!##########################################################################################0.04-1.041");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08626");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-140" + "'", str9, "-140");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08627");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             1.04100.01.041                                                                                             #AAA#AA1.04100.01.0410");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08628");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-..00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140", (double) 647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 647.0d + "'", double2 == 647.0d);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08629");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                           4    a0 -1                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08630");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2752, (double) 353.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2752.0d + "'", double3 == 2752.0d);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08631");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(291L, 0L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08632");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 129, 0L, (long) 220);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 220L + "'", long3 == 220L);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08633");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08634");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 231, (int) (byte) -1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08635");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08636");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444-14044444444444444444444444444444444444444444444444400.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0", (double) 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0d + "'", double2 == 1024.0d);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08637");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 175, 164);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 167, 39);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a-1" + "'", str19, "10a-1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1" + "'", str21, "10a-1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08638");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08639");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 543L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 543L + "'", long3 == 543L);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08640");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    100.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08641");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (short) 100, (int) (byte) 0);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.04100.040.0497.0410.0" + "'", str16, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08642");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!hi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!aaaaaaahi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!hi!hi!hi!10#-1#100#100#110#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08643");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0 100 -1 0 10 10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08644");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 195L, (float) (byte) -1, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08645");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 180, (long) 176, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 180L + "'", long3 == 180L);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08646");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   10100", (long) 4393);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4393L + "'", long2 == 4393L);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08647");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #Aaaaaaaaaa104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08648");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 1657, 549);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08649");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 -1" + "'", str8, "10 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08650");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08651");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0#0.0#0.0", 108.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 108.0f + "'", float2 == 108.0f);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08652");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-141410041004104100" + "'", str9, "-141410041004104100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-141410041004104100" + "'", str12, "-141410041004104100");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08653");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) -1, (-1));
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 108, (int) (short) 1);
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                 10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411100.0 -1.0hi!hi!hi!                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411100.0 -1.0hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08655");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 1, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a-1" + "'", str15, "10a-1");
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08656");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0", (double) 2752.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2752.0d + "'", double2 == 2752.0d);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08657");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a-1a100a100a1" + "'", str13, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08658");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-14", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -14 + "'", byte2 == (byte) -14);
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08659");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...0041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi...AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08660");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, 4393, 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4393 + "'", int3 == 4393);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444444444444444444444                  10a-1a100a100a1                   444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#4a4#4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 44444444444444444444444                  10a-1a100a100a1                   444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#4a4#4a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08662");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#-1#100#100#1" + "'", str13, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10#-1#100#100#1" + "'", str19, "10#-1#100#100#1");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08663");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 195, 131);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08664");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#!#iha###a###a###a#!#iha###a###a##!#iha##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!#iha\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08665");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 59, (long) 365, 507L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 59L + "'", long3 == 59L);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08666");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08667");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) -14, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08668");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                         a1a", (float) 244);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 244.0f + "'", float2 == 244.0f);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08669");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08670");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -14, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08671");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40", 875.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 875.0d + "'", double2 == 875.0d);
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08672");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 176, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 1, 1);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08673");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -14, (short) 0, (short) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08674");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str13, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str15, "10.0 100.0 0.0 97.0 10.0");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08675");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08676");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                       #!iha#a#a#a!iha#a#a#!iha#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                                                                                                                                                                                                                                                                                                                        #!iha#a#a#a!iha#a#a#!iha# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08677");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" #A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08678");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                             0.001#0.144444444444444444444444444                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08679");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                    #AAA#AA10a#4#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08680");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444", (double) 99);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 44444.0d + "'", double2 == 44444.0d);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08681");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10100AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA.AAA#AA.AAA#AA.AAA#AA44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA.AAA#AA.AAA#AA.AAA#AA44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08682");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "04143540414-1" + "'", str12, "04143540414-1");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08683");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!hi!                  10#-1#100#100#1                         ...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08684");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 365, 100);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08685");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08686");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 1662, 390);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str16, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str18, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08687");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str16, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08688");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a-1a100a100a1" + "'", str13, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 -1 100 100 1" + "'", str17, "10 -1 100 100 1");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08689");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08690");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', (int) (byte) 10, 4440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a0a1a1a0a-1" + "'", str13, "100a0a1a1a0a-1");
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08691");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0a0.001a0.01a0.1-a0.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08692");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HHI!HI!AAAAAAAHI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1!IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("ih!ih!iH#4#44a   A#    A#    A#    A#    A#    A#    A#    A#    A#    A# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ih!ih!iH#4#44a   A#    A#    A#    A#    A#    A#    A#    A#    A#    A#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08694");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                             10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08695");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 370, 10);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 399, 130);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a35.0a-1.0a10.0a-1.0" + "'", str10, "0.0a35.0a-1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08696");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 10, (short) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08697");
        double[] doubleArray5 = new double[] { 265.0d, 99L, 131.0f, 1662L, 129 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 751, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (short) 100, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[265.0, 99.0, 131.0, 1662.0, 129.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "265.0499.04131.041662.04129.0" + "'", str7, "265.0499.04131.041662.04129.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1662.0d + "'", double8 == 1662.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08698");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 1 100 100 10 100" + "'", str10, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08699");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 151, 1758.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08700");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1HI!AAAAAAA-1 1 100 100 10 100444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08701");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 353, 3068);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08702");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-11#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08703");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08704");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -14, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08705");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 0, (-140));
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08706");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(151.0d, (double) 3022, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08707");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str16, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.04100.040.0497.0410.0" + "'", str18, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08708");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10 -1 100 100 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 -1 100 100 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08709");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI#### #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI!AAAAAAAhI#### #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08710");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 1749, 370);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0a0.0a0.0" + "'", str16, "1.0a0.0a0.0");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08711");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#100111hi!hi!hi! 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -1 110 100 100 -10#100#1001.0A100.00#1000 1 35 0 1 -aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08712");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444-104444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.", 108.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 108.0d + "'", double2 == 108.0d);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08713");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08714");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(167, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08715");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 176, 1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 370, 459);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 370");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#100.0" + "'", str14, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08716");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08717");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 410, (int) (byte) 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a100a0" + "'", str13, "100a-1a1a100a0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 -1 1 100 0" + "'", str19, "100 -1 1 100 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100 -1 1 100 0" + "'", str21, "100 -1 1 100 0");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08718");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                    #AAA#AA10a#4#", (float) 122);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 122.0f + "'", float2 == 122.0f);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08719");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08720");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(410L, (long) 1758, 151L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 151L + "'", long3 == 151L);
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08721");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08722");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-14-141004100" + "'", str9, "-14-141004100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08723");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 129, 0);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a0a1a1a0a-1" + "'", str13, "100a0a1a1a0a-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08724");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 125, 2752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 125");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str16, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08726");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!", 778.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 778.0d + "'", double2 == 778.0d);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08727");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 507L, (double) 151L, (double) 125);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 507.0d + "'", double3 == 507.0d);
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08728");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1 100 100 1" + "'", str12, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "104-14100410041" + "'", str15, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08729");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" ...a#4#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ...a#4#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08730");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1#0hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h-1#0hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h-1#0hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h-1#0hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h-1#0hi!hi!hi!hi!h#4#4 4hi!hhI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1HI!AAAAAAA-1 1 100 100 10 100########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################### #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #Aaaaaaaaaa104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1#0hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h-1#0hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h-1#0hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h-1#0hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h-1#0hi!hi!hi!hi!h#4#4 4hi!hhI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1HI!AAAAAAA-1 1 100 100 10 100########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################### #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #Aaaaaaaaaa104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08731");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444                  10a-1a100a100a1                   444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#4a4#4a", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08732");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) ' ', 365L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 365L + "'", long3 == 365L);
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08733");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-11#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!1.040.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08734");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(164L, (long) 4393, 553L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4393L + "'", long3 == 4393L);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08735");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08736");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#4#44a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#4#44a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08737");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (double) 520);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 520.0d + "'", double2 == 520.0d);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08738");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08739");
        long[] longArray0 = new long[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, ' ', (int) (short) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08740");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                             #AAA#AAAA#AAA#AAHI!#AAA#AAHI!AAAAAAA#AAA#AA#AAA#HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100 -1 1 100 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 -1 1 100 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08742");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#######################################################################################################################################################################################################################################################################################################################################################################################################################Hi!hi!hi!", (byte) -14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -14 + "'", byte2 == (byte) -14);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08743");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa41-.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.000.1- 0.", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08744");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 1758, 515);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08745");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 309, 353);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 309");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10a-1a100a100a1" + "'", str23, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08746");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08747");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 265, (int) (short) 10);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08748");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1379, (int) (byte) 10, 4163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08749");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ##########################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (long) 167);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 167L + "'", long2 == 167L);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08750");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1L, (long) 93, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08751");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 507L, (float) 76L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08752");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08753");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 129, (int) (short) 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4 4HI!HI!HI!HI!H#4#0.04-1.041HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4 4HI!HI!HI!HI!H#4#0.04-1.041HI!HI!HI!HI!H");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08754");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0a0.0aaaaaaaaaaaaaaaaa100.0a0.0a97.0a-1.0aaaaaaaaaaaaaaaaa100.0a0.0a97.0a10.0aaaaaaaaaaaaaaaaa100.0a0.0a97.0a100.0aaaaaaaaaaaaaaaaa100.0a0.0a97.0a0.0aaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0aaaaaaaaaaaaaaaaaa100.0a0.0a97.0a         ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08755");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(2648, 59, 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2648 + "'", int3 == 2648);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08756");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 778, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 778L + "'", long3 == 778L);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08757");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 549, 1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08758");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(716.0f, (float) 517L, (float) 672);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 716.0f + "'", float3 == 716.0f);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08759");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!HI!HI!HI!H#4#4I4HI!HI!HI!HI!HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!40!.H4H.H");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihHI!                                                                                              aaa#aaHI!AAAAAAAAAAAAHI!AAAAA4-141004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihaaaaaaa!ihHI!                                                                                              aaa#aaHI!AAAAAAAAAAAAHI!AAAAA4-141004\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08761");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0-1.0", (long) 875);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 875L + "'", long2 == 875L);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08762");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 70, (int) (byte) 10);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 383, 0);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08763");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14-141004100" + "'", str8, "-14-141004100");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08764");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(180, 3068, 1379);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3068 + "'", int3 == 3068);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08765");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) -14, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08766");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 416, 0.0f, (-140.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-140.0f) + "'", float3 == (-140.0f));
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08767");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0 100.0" + "'", str13, "1.0 100.0");
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08768");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAA############################################################################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08769");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4393, (float) (short) 100, (float) 4393L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08770");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!aaaaaaa-1 1 100 100 10 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08771");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3022, (long) 171, 370L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 171L + "'", long3 == 171L);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08772");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 84, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "104-14100410041" + "'", str17, "104-14100410041");
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08773");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08774");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.04-1.041HI!HI!HI!HI!H#4#4HI4HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08775");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("ih!ih!iH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ih!ih!iH\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08776");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 778, 515);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08777");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaa#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08778");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str9, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08779");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 392, (long) 150, 291L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 392L + "'", long3 == 392L);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08780");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 1657, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 108, 647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 108");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08781");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-14100410041" + "'", str14, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#-1#100#100#1" + "'", str16, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08782");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(231.0f, (float) 164, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08783");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08784");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(539, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 539 + "'", int3 == 539);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08785");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1111111111111111111##-1#1###1###1111111111111111111hi!aaaaaaa44444444444444441.0#100.011111111111", 168);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168 + "'", int2 == 168);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08786");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08787");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0#-1.0" + "'", str6, "100.0#-1.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0a-1.0" + "'", str11, "100.0a-1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0#-1.0" + "'", str13, "100.0#-1.0");
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08788");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08789");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 192, (long) 615, 168L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 615L + "'", long3 == 615L);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08790");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A1a1                                                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1a1                                                                                                                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08791");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 2752, (long) 3072, (long) 410);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3072L + "'", long3 == 3072L);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08792");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(300, 672, (-140));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-140) + "'", int3 == (-140));
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08793");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.040.040.0# #   a#4a4#4a# #   a#4a4#4ahi!  hi!aaaaaaa hi! 4#4a# #   a#4a4#4a# #   a#4a4#4a# #      a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08794");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, (int) (short) 0);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Hi!hi!hi!10041104-14100410041104-141004#4#4 4aa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!hi!hi!10041104-14100410041104-141004#4#4 4aa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08796");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 1758, 99);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str16, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08797");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("AA#AAA#AAHI!#AAA#AAHI!AAAAAAA#AAA#AA#AAA#HI!", (short) -14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -14 + "'", short2 == (short) -14);
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08798");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1401.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08799");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAA4AA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08800");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', (int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08801");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(615L, (long) 1024, 4393L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 615L + "'", long3 == 615L);
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08802");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA.AAA#AA.AAA#AA.AAA#AAHI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1", 93L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93L + "'", long2 == 93L);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08803");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1#10#1#100#100" + "'", str9, "-1#10#1#100#100");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08804");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int26 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10a-1a100a100a1" + "'", str23, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08805");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(129, (int) (byte) -1, 743);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 743 + "'", int3 == 743);
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08806");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 2752, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 175, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 175");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08807");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0a100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08808");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 175, 164);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 129, 3068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 129");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a-1" + "'", str19, "10a-1");
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08809");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 127, (long) 1657, (long) 59);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 59L + "'", long3 == 59L);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08810");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str11, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.04100.040.0497.0410.0" + "'", str13, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.04100.040.0497.0410.0" + "'", str15, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str17, "10.0 100.0 0.0 97.0 10.0");
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08811");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("############################################################################################################################################iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii############################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08812");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08813");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HHI!                                       1 100 100 -1 10                     10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08814");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08815");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 1749);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08816");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AA4AAA", 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08817");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) (short) 100, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 4440, (int) ' ');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 0, 672);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-140" + "'", str9, "-140");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#0" + "'", str15, "-1#0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08818");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4 4#4   4a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08819");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1" + "'", str12, "10 -1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08820");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1#10#1#100#10044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08821");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08822");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a1", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08823");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0a-1.0a10.0a100.0a0.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0a-1.0a10.0a100.0a0.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08824");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08825");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(176L, 716L, (long) 1758);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 176L + "'", long3 == 176L);
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08826");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 365, 100);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10.04100.040.0497.0410.0" + "'", str20, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str22, "10.0#100.0#0.0#97.0#10.0");
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08827");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08828");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 509, 3022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 509");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08829");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 150, (long) 4440, (long) 220);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4440L + "'", long3 == 4440L);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08830");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 406, (long) (byte) -14, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-14L) + "'", long3 == (-14L));
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08831");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            0 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08832");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08833");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08834");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 131, 125);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08835");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 129, (double) 409, (double) 751);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 751.0d + "'", double3 == 751.0d);
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08836");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!HI!HI!10#-1#100#100#110#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!10#-1#100#100#110#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08837");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AAA4AA", 353);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 353 + "'", int2 == 353);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08838");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08839");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -14, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08840");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 164, (int) (byte) 100);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1" + "'", str12, "10 -1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08841");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4#44a", (double) 716.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 716.0d + "'", double2 == 716.0d);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08842");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) (byte) 10, (int) (short) 1);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int29 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10#-1#100#100#1" + "'", str21, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10a-1a100a100a1" + "'", str28, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08843");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 3068, 0);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ##############################hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h##############################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##############################hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h##############################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08845");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1                  #100#100#-1#1                  HI!                  10#100#100#-1#1                  HI!AAAAAAA                  10#100#100#-1#1                                    10#100#100#-1#HI!                  10", 515);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 515 + "'", int2 == 515);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08846");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08847");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 253, (long) 175, (long) 150);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 150L + "'", long3 == 150L);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08848");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("########################10#-1#100#100#1#########################10.0a100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08849");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 -1" + "'", str8, "10 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#-1" + "'", str11, "10#-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08850");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 192, 93L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08851");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 10100");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08852");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1hi!aaaaaaa-1 1 100 100 10 100#100#100#-1#1 10#100#100#-1#1 hi!hi!hi!hi! 10#100#100#-1#1 10#100#100#-1#1 hi!aaaaaaahi!hi!hi! 10#100#100#-1#1 10#100#100#-1#1 hi!hi!hi! 10#100#100#-1#1 10#100#100#-1#Hi!hi!hi!hi! 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08853");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 -1 100 100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08854");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4393, (float) 3072, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4393.0f + "'", float3 == 4393.0f);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08855");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08856");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10.04100.040.0497.0410.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08857");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 515, (-140));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08858");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1749, (float) 875L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08859");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 416, (int) (short) 1);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0#1#35#0#1#-1" + "'", str17, "0#1#35#0#1#-1");
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08860");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4a4a44##4# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08861");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a-1.0a10.0a100.0a0.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                             #aaa#aa0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08862");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                              aa#aaa#                                                                                   aa#aaa#                                                                                   !ih!ih!ih11 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 01                              aa#aaa#                                                                                   aa#aaa#                                                                                   AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA.AAA#AA.AAA#AA.AAA#AAHI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1", 4393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4393L + "'", long2 == 4393L);
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08863");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("104-14100410041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08864");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4a0-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08865");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -14, 340, 172);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08866");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) '4', 0.0d, 76.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08867");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihh");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08868");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(108.0f, 0.0f, (float) 81);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08869");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 3072, 108);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 1758, 4163);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1758");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08870");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#-1#100#100#1                   hi!aaaaaaahi!44hi!4", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08871");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!#AAA#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08872");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4#44A                                                                                             #AAA#AA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08873");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("265.0499.04131.041662.04129.0     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08874");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 553L, 416.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 553.0f + "'", float3 == 553.0f);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08875");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#!iha#a#a#a!iha#a#a#!iha#", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08876");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 100, (short) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08877");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("     1#001#001#1-#01                                     1#001#001#1-#01                  aIHaIHaIHaaaHaa#aaa#aa#aaa#aaaaaaaaaaaa#aaa#aaaaa#aaa#aaHaa#aaa#aa#aaa#aaaaaaaaaaaa#aaa#aaaaa#aaa#aaaaaaaaaaaaHaa#aaa#aa#aaa#aaaaaaaaaaaa#aaa#aaaaa#aaa#aaaaaHaa#aaa#aa#aaa#aaaaaaaaaaaa#aaa#aaaaa#aaa#aa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08878");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 171, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08879");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08880");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.0# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A-1.000.-140", (long) 416);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 416L + "'", long2 == 416L);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08881");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100.0#-1.0HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0#-1.0HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.0a0.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a0.0a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08883");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 100, 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.040.040.0" + "'", str13, "1.040.040.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0 0.0 0.0" + "'", str16, "1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08884");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                       ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08885");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(70.0f, (float) 1657, (float) 716L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1657.0f + "'", float3 == 1657.0f);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08886");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str16, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08887");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 265L, 0.0d, (double) 39);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 265.0d + "'", double3 == 265.0d);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                     hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08890");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 1, (int) (short) 0);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 554, 122);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 1 + "'", short22 == (short) 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08891");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 716, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4');
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#10#1#100#100" + "'", str12, "-1#10#1#100#100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-14104141004100" + "'", str14, "-14104141004100");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08892");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 1024, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10a-1a100a100a1" + "'", str24, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08893");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -14, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08894");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '#', (float) 168, 200.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 200.0f + "'", float3 == 200.0f);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08895");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 410, 10);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08896");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!HI!10041104-14100410041104-14100410041104-1...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08897");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 3072, (int) (short) 1);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 151, 390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 151");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08898");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, (long) 370, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08899");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08900");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 176L, (float) (byte) -14, (float) 265L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 265.0f + "'", float3 == 265.0f);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08901");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 0, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08902");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaa", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08903");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 517, 3072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 517");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08904");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (short) 0, 0);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08905");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, (double) 353, (double) 4440L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08906");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 1, (float) 1662L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1662.0f + "'", float3 == 1662.0f);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08907");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                                    ############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08908");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4440, (float) (-14), (float) 416);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-14.0f) + "'", float3 == (-14.0f));
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08909");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08910");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444444444444444444444444                  10#-1#100#100#1                   444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08911");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0 -1.0" + "'", str6, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0 -1.0" + "'", str8, "100.0 -1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08912");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1353, 99.0d, 615.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08913");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.0100.0#-1.0.0A0.001A0.01A0.1-A0.0AA#AAA#                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1.0100.0#-1.0.0A0.001A0.01A0.1-A0.0AA#AAA#                                                                                             is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08914");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4.4444446E32f, (double) 1685, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08915");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08916");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -14, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08917");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0a1a35a0a1a-1" + "'", str13, "0a1a35a0a1a-1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0#1#35#0#1#-1" + "'", str16, "0#1#35#0#1#-1");
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08918");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.0 -1.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08919");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08920");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08921");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3068L, (double) 167, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3068.0d + "'", double3 == 3068.0d);
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08922");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -14, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08923");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00.04-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08924");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08925");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 0, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08926");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 459, 1657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 459");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 0" + "'", str9, "-1 0");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10 10 0 -1 100 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 10 0 -1 100 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08928");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((-140.0d), 520.0d, (double) 1758L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-140.0d) + "'", double3 == (-140.0d));
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08929");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("00001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.11");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08930");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 220.0f, (float) 543);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08931");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08932");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08933");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 365, 0.0f, (float) 253L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08934");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...a#4#44", (byte) -14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -14 + "'", byte2 == (byte) -14);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08935");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4393, 588.0f, 716.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 588.0f + "'", float3 == 588.0f);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08936");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 615, (long) 1749);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1749L + "'", long3 == 1749L);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08937");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 220, 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1a1a100a100a10a100" + "'", str16, "-1a1a100a100a10a100");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08938");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 1657.0f, (float) 509);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1657.0f + "'", float3 == 1657.0f);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08939");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 416, (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.Class<?> wildcardClass14 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1" + "'", str12, "10 -1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08940");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08941");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 129, (int) (short) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 520, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1a0" + "'", str20, "-1a0");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08942");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!          aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa.aaa#aa.aaa#aa.aaa#aa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08943");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-..00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08944");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) '#', (int) (short) 1);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08945");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 84, 0);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08946");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-141004444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08947");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("ih!ih!iH#4#44a   A#    A#    A#    A#    A#    A#    A#    A#    A#    A# ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08948");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08949");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08950");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -14, (short) (byte) -14, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08951");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 588, 1749);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 588");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10.04100.040.0497.0410.0" + "'", str9, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08952");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001#0.14444444444444444aaaaaaa!ih44444444444444444444444444444444444444444444444i!                  10#-1#100#10", 1662L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1662L + "'", long2 == 1662L);
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08953");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -14, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08954");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.1- 0.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08955");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 2752, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 1852, 220);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08956");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 76, 244);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08957");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 125, 647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 125");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08958");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-140.0f), (float) 515, 353.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-140.0f) + "'", float3 == (-140.0f));
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08959");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100.0a-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08960");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 220, 509);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 220");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-140" + "'", str9, "-140");
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08961");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a4a44##4##hihihihi4#a44##4##44#a44##4##4hihihi4#a44##4##44#a44##4##4hiaaaaaaahihihi4#a44##4##44#a44##4##4hihihihi4#a44##4##44#a44##4##4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a4a44##4#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08962");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-14), (float) 127, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 127.0f + "'", float3 == 127.0f);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08963");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -14, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08964");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("h", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08965");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 195, 194);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08966");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                             10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08967");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 265, 100);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 108, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 0, 3022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08968");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("####aaa##", 253);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 253 + "'", int2 == 253);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08969");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1" + "'", str12, "10#-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 -1" + "'", str14, "10 -1");
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08970");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10-11001001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10-11001001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08971");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 1 100 100 10 100 .0 -1. hi! aaa#aahi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 .0 -1. .0 -1. .0 -1. .0 -1.10-1100100110-1100100110-1100100110-1100100110-1100100110-1100100110-1100100110-1100100110-1100100110-1100100110-11", (double) 517);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 517.0d + "'", double2 == 517.0d);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08972");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        java.lang.Class<?> wildcardClass7 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08973");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 585, (long) 127, (long) 70);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 70L + "'", long3 == 70L);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08974");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -14, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08975");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 129, (float) 0, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 129.0f + "'", float3 == 129.0f);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08976");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1", (long) 543);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 543L + "'", long2 == 543L);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08977");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) ' ', 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 100, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0a100a100" + "'", str11, "0a100a100");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08978");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (short) 100, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.04100.040.0497.0410.0" + "'", str15, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.04100.040.0497.0410.0" + "'", str18, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08979");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (byte) 1, (float) 509);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 509.0f + "'", float3 == 509.0f);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08980");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08981");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 416, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08982");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str15, "0.0#-1.0#10.0#100.0#0.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08983");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 554);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 554 + "'", int2 == 554);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08984");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4!ih4!ih44!ih");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08985");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 0, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 2703, 220);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08986");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-..00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-..00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08988");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                              aa#aaa#                                                                                   aa#aaa#                                                                                   !ih!ih!ih11 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 01                              aa#aaa#                                                                                   aa#aaa#                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08989");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aah...", (long) 81);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 81L + "'", long2 == 81L);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08990");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08991");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444444444...                                             ", 509);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 509 + "'", int2 == 509);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08992");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.41410041004104096E17d), (double) 39L, (double) 416L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 416.0d + "'", double3 == 416.0d);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08993");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08994");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#4a4#4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08995");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#", 383);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 383 + "'", int2 == 383);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08996");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a1.0a100.0hi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08997");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 365, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08998");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1HI!AAAAAAA-1 1 100 100 10 100444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08999");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1 100 100 -1 10", (long) 195);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195L + "'", long2 == 195L);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test09000");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -14, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }
}

