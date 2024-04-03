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
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1", (long) 565);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 565L + "'", long2 == 565L);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08502");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("00                    .0#.0#.0##0#.0", 288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288 + "'", int2 == 288);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08503");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi97.04100.043.21041101E9435.0!32A0A5204 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A044 4 A A A-4 4 A A A14 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A04 4 A A A           444-1.0#-1                      444-1.0#-1                      444-1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a100a0a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a11-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a100a0a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a                                                                                                                                       #-1.0#1.0a1.0a-1.0                                                                                                                                        -1#1#-1", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08504");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08505");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 520, 127.0f, (float) 565L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 565.0f + "'", float3 == 565.0f);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08506");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4 4   a a a0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       4a4a aaaaaa", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08507");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 288, (double) 269, (double) 269);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 269.0d + "'", double3 == 269.0d);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08508");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08509");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                               A-1.0A-1.0A32.0A100.0A-1.0                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08510");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', (int) '4', (int) (byte) 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 904, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 0, 240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08511");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 380, 137);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 457, 249);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 583, 454);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08512");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                    .1-45.55145.4445.1-45.1-45.1-44444.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1.1-#0.001#0.23#0.1-#0.1-#0.1-#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-#.11#1-1-#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1-45.55145.4445.1-45.1-45.1-44444.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1.1-#0.001#0.23#0.1-#0.1-#0.1-#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-#.11#1-1-#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08513");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("104144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"104144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-44\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08515");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 835, 348);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08516");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("44444444444444444444444444444444444444444432#0#524444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444432#0#524444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08517");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 137, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1" + "'", str13, "10 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1041" + "'", str15, "1041");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a1" + "'", str18, "10a1");
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08518");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 507, 4596);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 507");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str16, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08519");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1a1a100a0a", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08520");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0a1.0a10.0a0.", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08521");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("   1 1 0 9744452 9752 9752 97 97299 9752 -1a1a100a0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:    1 1 0 9744452 9752 9752 97 97299 9752 -1a1a100a0a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08522");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0 a a a a a a aa a a a a000000000000000000000000000000000000000000000000000000000000000000000000-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0#############################################################################################################-1.444-1.0#-1.0#-1.0#32.0#100.0#-############################################################################################################", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08523");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 361, (int) ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray2, ".0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0          -1.0-1.0-1.032.0100.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0          -1.0-1.0-1.032.0100.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 1" + "'", str14, "10 1");
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08524");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("32#0#5                                                                                                                                                                                                                                                                 .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08525");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" a  a a  a a  aa   aa    a a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa a  a a  a a  aa   aa    a a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aa  a a  aa  aaa  5    aa    aa  a a  aa  aaa  5    aa    aa  a a  aa  aaa  5    aa    aa  a a  aa  aaa  5    aa    aa  a a  aa  aaa  5    aa    aa  a a  aa  aaa  5    aa    aa  a a  aa  aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08526");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 0, 0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08527");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1103, 951, 673);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1103 + "'", int3 == 1103);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08528");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08529");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08530");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#a#a#a 4#4#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21444-1.0-1.0-324-14-14100410432-1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21444-1.0-1.0-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21444-1.0-1.0-324-14-14100410432-1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21-1---1--1---1-1-21444-1.0-1.0-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08532");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.0a10.0a-1.0#-1.0#-1.0#32.0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08533");
        int[] intArray3 = new int[] { ' ', 'a', (byte) 1 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 97, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3249741" + "'", str9, "3249741");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08534");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A A A   4 40A A A   4 4.A A A   4 400140A A A   4 4.A A A   4 4140A A A   4 4.A A A   4 41A A A   4 4-A A A   4 440A A A   4 4.A A A   4 4140A A A   4 4.A A A   4 400140A A A   4 4.A A A   4 400.1-a0.001a0.23a0.1-a0.1-a0.1-0.5349E10114012.340.00140.79");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08535");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 196, 196);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 189, 0);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32 0 52" + "'", str14, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32a0a52" + "'", str16, "32a0a52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "32#0#52" + "'", str28, "32#0#52");
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08536");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".04.04.044.04.04.04444-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444.04.04.044.04.04.04432101523212-12-1-001-0132                           ", 3240452.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3240452.0f + "'", float2 == 3240452.0f);
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08537");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', (int) (byte) 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) (byte) 100, 0);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 289, 93);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str25, "0.04100.041.04-1.041.04100.0");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08538");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 92, (int) '#');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 127, 2450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08539");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(198, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 198 + "'", int3 == 198);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08540");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08541");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(251, 665, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08542");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (short) 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str7, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str13, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 35.0f + "'", float14 == 35.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 35.0f + "'", float15 == 35.0f);
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08543");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08544");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (short) 1, (int) (byte) -1);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08545");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 7925, 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08546");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 32, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08547");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08548");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08549");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 0 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 0, (int) (byte) -1);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08550");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 32, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 32 + "'", short3 == (short) 32);
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08551");
        double[] doubleArray1 = new double[] { 100.0d };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray1, 'a', 7925, 196);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray1, '4', 191, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 191");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08552");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 0 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 100 0" + "'", str6, "1 100 0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08553");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 190, 507L, (long) 378);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 507L + "'", long3 == 507L);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08554");
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
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double21 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08555");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.00.0100.01.0-1.01.01..0A1A100-1.0 -1.0 -1.0 32.0 100.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08556");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4.4041004.40414.4044-414.40414.4041004.4097.04100.043.21041101E9435.0-1.0a-1.0a-1.0a32.0a100.0a-1.004 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A044 4   A A A-4 4   A A A14 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A04 4   A", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08557");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 1, 242);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str10, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 -1.0 -1.0 32.0 100.0 -1.0" + "'", str12, "-1.0 -1.0 -1.0 32.0 100.0 -1.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08558");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08559");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                   1 1 0 9744452 9752 9752 97 97299 9752 ", 3210110.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3210110.0f + "'", float2 == 3210110.0f);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08560");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("      A A -1.0#-1.0#-1.0#32.0#100.0#-1.0.0#100.0#1.0#-1.0#1.0#100.", (float) 380L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 380.0f + "'", float2 == 380.0f);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08561");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08562");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(910L, (long) 250, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 910L + "'", long3 == 910L);
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08563");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 0, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32 0 52" + "'", str14, "32 0 52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08564");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 361, 192);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) '#', 269);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.041.0410.040.0" + "'", str9, "100.041.0410.040.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08565");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("      a a a", 657.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 657.0f + "'", float2 == 657.0f);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08566");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08567");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 188, 137);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "a                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a                                                                                          ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a1a10a1a100" + "'", str8, "10a1a10a1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a10a1a100" + "'", str14, "10a1a10a1a100");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08568");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4                                                                                                                                                                                                                                   .0#.0#.0##0#.0#44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08569");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("32.0100.0-1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08570");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444440A1.0A-1.###########################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08571");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 10, (int) (byte) -1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0#1" + "'", str11, "0#1");
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08573");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08574");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08575");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 137, (long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08576");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 507L, (double) 7925, (double) 910);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 507.0d + "'", double3 == 507.0d);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08577");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str14, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08578");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 0, 1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "32a0a52");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 32a0a52");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08579");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("321-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1#0.1-#4155.54-1.54444.1-45.55145.4445.1-45.1-45.1-11#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#", 92.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 92.0f + "'", float2 == 92.0f);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08580");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 0, 1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08581");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444 4a4a4a444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08582");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("7925.0#.0#.0##0#.0#10 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1...1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08583");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444492A10A14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08584");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0#-1.0#aaa14140497-1.0#-1.0#aaaa", (float) 3210411041L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.21041101E9f + "'", float2 == 3.21041101E9f);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08585");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08586");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("444-1.0#-1.0#-1.0#32.0#100.0#-1                    .0#.0#.0##0#.0#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08587");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1.", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08588");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("32 -1 -1 100 10 32383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 101383 10138");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08589");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("04 4        .4 4        041004 4        .4 4        0414 4        .4 4        044 4        -4 4        14 4        .4 4        0414 4        .4 4        041004 4        .4 4        04 4        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08590");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.025a0a231#0.1#0.1-#0.1#0.001#0.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08591");
        double[] doubleArray1 = new double[] { 100.0d };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray1, '#', 10, 0);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08592");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1103.0f, 80.0f, (float) 240L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1103.0f + "'", float3 == 1103.0f);
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08593");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08594");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 507, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short21 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08595");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 158, 454);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08596");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(233, 0, 1001);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1001 + "'", int3 == 1001);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08597");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 910, 235);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str23, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08598");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08599");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 51, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041" + "'", str10, "1041");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08600");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08601");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 628, (int) (short) 1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08602");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a--1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1444-1.0#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a--1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1444-1.0#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08603");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08604");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08605");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08606");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                    a                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08607");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08608");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("          -1.0-1.0-1.032.0100.0.0#.0#.0##0#.0##-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0          -1.0-1.0-1.032.0100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08609");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a100a0a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55a1.0a10.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a100a0a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55a1.0a10.0a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08611");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a                                                                                          a                                                                                       a4a4a4 4444################################3205                                                                                                                                                                                          #-1.0#1.0a1.0a", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08612");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("3210 110 1a3210 110 13210 110 1a3210 110 13210 110 1", 910L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 910L + "'", long2 == 910L);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08613");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 136, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08614");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08615");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.030.020.0#0.000.0#0.050.020.030.020.0#0.0-0.010.0#0.0-0.010.0#0.010.000.000.0#0.010.000.0#0.030.020.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.010.000.000.0.0.000.0#0.010.0.0.000.0#0.010.000.0.0.000.0#0.000.0.0.000.0                                                                                      -1.0#-1.0#-1.0#32.0#.0#                                                                                      ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08616");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...                                                                                                                                                                                                                                                                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08617");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 1103, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08618");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#1" + "'", str12, "10#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a1" + "'", str17, "10a1");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08619");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08620");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(92, 657, 951);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08621");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#aaa14140497-1.0#-1.0#aaaa44444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444.0a.0a-", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08622");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str9, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str11, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08623");
        float[] floatArray6 = new float[] { (byte) 0, 'a', 10, 507, 507L, 1001 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', (int) (byte) 1, 196);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 97.0, 10.0, 507.0, 507.0, 1001.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1001.0f + "'", float7 == 1001.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0 97.0 10.0 507.0 507.0 1001.0" + "'", str9, "0.0 97.0 10.0 507.0 507.0 1001.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0497.0410.04507.04507.041001.0" + "'", str11, "0.0497.0410.04507.04507.041001.0");
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08624");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("     a a 1#.#0#a#1#.#0#a#-#1#.#0#1 1 0 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08625");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4!0.5349E10114012.340.00140.79ih23", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08626");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("001-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08627");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08628");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 198, (int) (short) 10);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 10 + "'", byte19 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1041" + "'", str21, "1041");
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08629");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(507.0d, (double) 904L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08630");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("! ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08631");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#...97.0#100#a#aaaaaaa#a#aa100.0a1.0a10.0a0.#a#aaaaaaa#a#aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08632");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("7925.0#.0#.0##0#.0#10 1 10 1 100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08633");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str7, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 3.21041101E9f + "'", float8 == 3.21041101E9f);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08634");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 222, (float) 195L, (float) 483L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 483.0f + "'", float3 == 483.0f);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08635");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08636");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                    -1.04-1.04-1.0432.04100.04-1.0                                                    ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08637");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(".#.40..#.40#.4.0#.40#.40..#.00 0 . 970-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08638");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 0L, (float) 136);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 136.0f + "'", float3 == 136.0f);
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08639");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#-1.0#-1.00A1.0A-1.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-14a4a aaaaaa.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08640");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444440A1.0A-1.###########################################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08641");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08642");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(520, 562, 507);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 562 + "'", int3 == 562);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" 0 23-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 0 23-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.0#-1.0#-1.0#32.0#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08644");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a', 288, 457);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 288");
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
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08645");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1#0#0#0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08646");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1#.#0#A#1#.#0#A#-#1#.#0                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08647");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 32, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 32 + "'", short3 == (short) 32);
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08648");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 93.0f, 127.0d, 361.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 361.0d + "'", double3 == 361.0d);
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08649");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str13, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08650");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0#-1.0#1.0a1.0a-1.0", (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08651");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                 -1.0#-1.0#-1.0#32.0#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 365L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 365L + "'", long2 == 365L);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08652");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-14324045241041");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08653");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) -1, (float) 365, (float) 190);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 365.0f + "'", float3 == 365.0f);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08654");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444444444444444444444444444 4A4A4A444444444444444444444444444444444444444444444444444444444444444 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08655");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("9797299975232-1.0#32.0#100.0#-1.#######################################################################                                                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"9797299975232-1.0#32.0#100.0#-1.#######################################################################                                                                                                                                   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08656");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                   5 0 23 9752 97 97299 9752 #######################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08657");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-32#0#52132#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#523232#0#52.32#0#52032#0#52#32#0#5210032#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#523232#0#52.32#0#52032#0#52#32#0#5210032#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#523232#0#52.32#0#52032#0#52#32#0#5210032#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#52-32#0#52132#0#52.32#0#52032#0#52#32#0#523232#0#52.32#0#520");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08658");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08659");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...a32.0a100.0a-1.aaaa0.1-a", (double) 134);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 134.0d + "'", double2 == 134.0d);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08660");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 185, 915);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 185");
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
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08661");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 92, (float) 588, (float) 507L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 588.0f + "'", float3 == 588.0f);
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08662");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08663");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 383.0f, 105.0d, (double) 338);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 383.0d + "'", double3 == 383.0d);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08664");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A-1.0A-1.0A32.0A100.0A-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08665");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                  0.0 100...                                                                                                                                                                                                                                                                                                                               ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08666");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) (short) 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str13, "0.0 100.0 1.0 -1.0 1.0 100.0");
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08667");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("--1.0#-1.0#-1.0#32.0#100.0#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08668");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("   4     4   4    4   4     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08669");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "                                                                                                                                      -1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0                                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0                                                                                                                                      ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08670");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                        32104110");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08671");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 673, 235);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.041.0410.040.0" + "'", str9, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str16, "100.0 1.0 10.0 0.0");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08672");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 507, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short21 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08673");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) 'a', 92);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 0, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08674");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("11111111111111111111111111-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32", 292);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 292 + "'", int2 == 292);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08675");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 262, (long) '#', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 262L + "'", long3 == 262L);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08676");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("32100.0a1.0a10.0a0.03210411...97.0a100.0a3.21041101E9a35.00100.0a1.0a10.0a0.03210411...97.0a100.0a3.21041101E9a35.05");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08677");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("3210411...444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-32#0#50.04100.041.04-1.041.04100.0                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3210411...444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-32#0#50.04100.041.04-1.041.04100.0                                                                        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08678");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("##########################################################04.4041004.40414.4044-414.40414.4041004.40");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#########################################################04.4041004.40414.4044-414.40414.4041004.40\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08679");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08680");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', (int) (byte) 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) (byte) 100, 0);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 289, 93);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 127, 324);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str25, "0.0a100.0a1.0a-1.0a1.0a100.0");
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08681");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str15, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08682");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a1.0a32#0#5                                                                                                                            100.041.0410.040.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08683");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 4596, 172);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 195, 380);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 195");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08684");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 10, (int) (byte) -1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0a1" + "'", str11, "0a1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0a1" + "'", str16, "0a1");
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08685");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1504, 368, 367);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 367 + "'", int3 == 367);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08686");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                             44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.04100.041.04-1.041.04100.0                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08687");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a a a   4 40a a a   4 4.a a a   4 400140a a a   4 4.a a a   4 4140a a a   4 4.a a a   4 41a a a   4 4-a a a   4 440a a a   4 4.a a a   4 4140a a a   4 4.a a a   4 400140a a a   4 4.a a a   4 40-1.0a1.0a-1.0#-1.0#                                                                                                                                                                                 ", (short) 32);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 32 + "'", short2 == (short) 32);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08688");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("3210411...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08689");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 195, 235.0f, (float) 196L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 235.0f + "'", float3 == 235.0f);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08690");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1-1.54-1.54-1.5444.54155.54                                                                11111111111111111111111111-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#321-1.54-1.54-1.5444.54155.54                                                                ", 357.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 357.0d + "'", double2 == 357.0d);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08691");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 457, (double) 1001, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1001.0d + "'", double3 == 1001.0d);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08692");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08693");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444 4A4A4A444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44 4A4A4A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08694");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("321041104");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 321041104 + "'", int1 == 321041104);
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08695");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 137, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "! ih");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ! ih");
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
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08696");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str7, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97.0#100.0#3.21041101E9#35.0" + "'", str11, "97.0#100.0#3.21041101E9#35.0");
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08697");
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
        double double28 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 233, 550);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 233");
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08698");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1353, (double) 198, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1353.0d + "'", double3 == 1353.0d);
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08699");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 240, (long) 198, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08700");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1.0#1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08701");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32 0 52" + "'", str14, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "3240452" + "'", str16, "3240452");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08702");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 0 0 0" + "'", str8, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 0 0 0" + "'", str11, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08703");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".04.04.044.04.04.04444-1.0a-1.0a-1.0a32.0a100.0a-1.44444444444444444444444444444444444444444444444444444444444444444.04.04.044.04.04.044");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".04.04.044.04.04.04444-1.0a-1.0a-1.0a32.0a100.0a-1.44444444444444444444444444444444444444444444444444444444444444444.04.04.044.04.04.044\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08704");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1.0a1.0...                                                                                          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a1.0...                                                                                          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08705");
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
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str21, "0.0a100.0a1.0a-1.0a1.0a100.0");
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08706");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ', 379, 368);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 0 0 0" + "'", str8, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 0 0 0" + "'", str11, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08707");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0a1.0a-1.0#-1.0#1.0.04100.041.04-1.041.04100.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08708");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" 9752 97 97299 9752 ########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################1.0432.04100.04-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 9752 97 97299 9752 ########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################1.0432.04100.04-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08709");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08710");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a                                                                                          ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08711");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08712");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 198, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32a0a52" + "'", str16, "32a0a52");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08713");
        double[] doubleArray3 = new double[] { 1, 1L, (-1L) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0a1.0a-1.0" + "'", str5, "1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0#1.0#-1.0" + "'", str8, "1.0#1.0#-1.0");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08714");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 365, (float) 292, (float) 250);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 365.0f + "'", float3 == 365.0f);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08715");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0a1.0...                                                                                          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08716");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.0#10.0#0.0100.0#1.-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#1" + "'", str13, "10#1");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08717");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#1 1 0 97# #1 1 0 97# #1 1 0 97# #1 1 0 97# #1 1 0 97# #1 1 0 97# #1 1 0 97#a#1 1 0 97# #1 1 0 97#a#1 1 0 97# #1 1 0 97#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08718");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".1-#0.001#0.23#0.1-#0.1-#0.1-#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08719");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 332, 0);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str18, "0.04100.041.04-1.041.04100.0");
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08720");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.1-a0.001a0.23a0.1-a0.1-a0.1-0.5349E10114012.340.00140.79#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-.#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-00140#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-.#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-140#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-.#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-1#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1--#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-40#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-.#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-140#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-.#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-00140#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-.#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              A A A   4 40A A A   4 4.A A A   4 400140A A A   4 4.A A A   4 4140A A A   4 4.A A A   4 41A A A   4 4-A A A   4 440A A A   4 4.A A A   4 4140A A A   4 4.A A A   4 400140A A A   4 4.A A A   4 400.1-a0.001a0.23a0.1-a0.1-a0.1-0.5349E10114012.340.00140.79", (double) 318);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 318.0d + "'", double2 == 318.0d);
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08721");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("001 79 25");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08722");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23...1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23...1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23...1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23...1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23..0.#-1.0#0.                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) 332);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 332L + "'", long2 == 332L);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08723");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 318, (long) 17925, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08724");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(127, 185, 17925);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 127 + "'", int3 == 127);
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08725");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08726");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 163, 0L, 361L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08727");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08728");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) '4', (int) (short) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 137, 134);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100" + "'", str19, "100");
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08729");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                          0    A A97.0#100.0#3.2101101E9#35.0-1.0#-1.0#-1.0#32.0#100.0#-1.    A A A1    A A A.    A A A01    A A A.    A A A0100    A A A.    A A A0    A A A                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                                                                                                           0    A A97.0#100.0#3.2101101E9#35.0-1.0#-1.0#-1.0#32.0#100.0#-1.    A A A1    A A A.    A A A01    A A A.    A A A0100    A A A.    A A A0    A A A                                                                                                                                                                                            is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08730");
        double[] doubleArray6 = new double[] { 0L, (-1L), (byte) 1, (-1L), (short) 1, (short) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', (int) '4', (int) (byte) -1);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 509, 0);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, -1.0, 1.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08731");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 80, 126);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str14, "0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str16, "0.04100.041.04-1.041.04100.0");
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08732");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08733");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (short) 1, (int) (byte) -1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 904, 520);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08734");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("7925.0#.0#.0##0#.0#10 1 10 1 100                                                                 0.0#100.0#1.0#-1.0#1.0#1..0A1A100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08735");
        double[] doubleArray5 = new double[] { 1, 10, 92, 198.0f, 361 };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 1001, 380);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 10.0, 92.0, 198.0, 361.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 361.0d + "'", double11 == 361.0d);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08736");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                         #a#a#a 4#4########...", (double) 198);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.0d + "'", double2 == 198.0d);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08737");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0 100...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08738");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 51, (long) 322, (long) 454);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 51L + "'", long3 == 51L);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08739");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(".0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0A-1.0#-1.0#1.0A1.0          -1.0-1.0-1.032.0100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08740");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 198, (int) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 195, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.Class<?> wildcardClass26 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#1" + "'", str24, "10#1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 1 + "'", byte25 == (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08741");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08742");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 386, 249);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0 -1.0 -1.0 32.0 100.0 -1.0" + "'", str14, "-1.0 -1.0 -1.0 32.0 100.0 -1.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08743");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08744");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("...a32.0a100.0a-1.aaaa0.1-a", 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262 + "'", int2 == 262);
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08745");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041" + "'", str10, "1041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041" + "'", str12, "1041");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a1" + "'", str15, "10a1");
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08746");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 10, (int) (short) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32a-1a-1a100a10a32" + "'", str19, "32a-1a-1a100a10a32");
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08747");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!32#0#54a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!32#0#54a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08748");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 0, 454);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08749");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08750");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 100, 100);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3240452" + "'", str15, "3240452");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08751");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 198, (int) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 195, 0);
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 1 + "'", byte23 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10#1" + "'", str25, "10#1");
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08752");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("321-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (double) 378);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 378.0d + "'", double2 == 378.0d);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08753");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 134, 0);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', 185, 163);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08754");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08755");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.       ", (float) 137L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 137.0f + "'", float2 == 137.0f);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08756");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 0, 1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 380, 195);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 378, 378);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0 # # # # # # ## # # # #000000000000000000000000000000000000000000000000000000000000000000000000-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0#############################################################################################################-1.444-1.0#-1.0#-1.0#32.0#100.0#-############################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0 # # # # # # ## # # # #000000000000000000000000000000000000000000000000000000000000000000000000-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0-1.0#-1.0#1.0#1.0#-1.0#############################################################################################################-1.444-1.0#-1.0#-1.0#32.0#100.0#-############################################################################################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08757");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-132#0#52#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-32#0#5");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-132#0#52#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-1.0#-1.0#-1.0#32.0#100.0#-444-32#0#5\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08758");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08759");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 588, 1385);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08760");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 80.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08761");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#AAAA-1.0#-1.0#AAA14140497-1.0#-1.0#           444-1.0#-1           ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08762");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...0a1a1003210411041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08763");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08764");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) '#', 483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 483 + "'", int3 == 483);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08765");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 80, 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float21 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 262, 383);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 262");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08766");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "041" + "'", str5, "041");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 1" + "'", str8, "0 1");
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08767");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 187, 1504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 187");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-143240452410410" + "'", str11, "-143240452410410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 32 0 52 10 10" + "'", str13, "-1 32 0 52 10 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08768");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                                                                                                                                                                                                                                                                                                                                            .0#.0#.0##0#.0#                                                                                                                                                                                                                                                                                                                     .0#.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                                                                                                                                                                                                                                                                                                                                            .0#.0#.0##0#.0#                                                                                                                                                                                                                                                                                                                     .0#.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08770");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                      -1.0#-1.0#-1.0#32.0#.0#                                                                                      ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08771");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 137, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 673, (int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08772");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1.0#-1.00A1.0A-1.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-14a4a aaaaaa.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08773");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08774");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 332, 507L, 92L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 92L + "'", long3 == 92L);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08775");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(198.0f, 137.0f, (float) 2450);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 137.0f + "'", float3 == 137.0f);
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08776");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#1" + "'", str13, "10#1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1041" + "'", str15, "1041");
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08777");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08778");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 196, 134);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100.041.0410.040.0" + "'", str19, "100.041.0410.040.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str25, "100.0 1.0 10.0 0.0");
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08779");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1#0.1-#4155.54-1.54444.1-45.55145.4445");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1#0.1-#4155.54-1.54444.1-45.55145.4445\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08780");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1504, 380);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08781");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08782");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA A4A4AAAAAA...################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08783");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.Class<?> wildcardClass11 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1" + "'", str10, "10 1");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08784");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0#32.0#100.0", (float) 367);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 367.0f + "'", float2 == 367.0f);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08785");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 183, 550);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 183");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08786");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".....444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08787");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08788");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08789");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08790");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("###################################################################HI!###################################################################", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08791");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(322, (int) (short) -1, 17925);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08792");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 93, (float) 1L, 367.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 367.0f + "'", float3 == 367.0f);
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08793");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--# 79 25");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08794");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08795");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#-1.0#32.0#100.0#-1.0 -1.0#-1.0#-1.0#32.0#100.0#-1.0 0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08796");
        int[] intArray2 = new int[] { 383, 101 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[383, 101]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 383 + "'", int3 == 383);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 383 + "'", int5 == 383);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "383#101" + "'", str7, "383#101");
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08797");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 187.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 187.0d + "'", double2 == 187.0d);
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08798");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10a1a10a1a100", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08799");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.0#100.0#3.21041101E9#35.0" + "'", str7, "97.0#100.0#3.21041101E9#35.0");
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08800");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("14 4     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"14 4     \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08801");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 342, (int) ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08802");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#A#A AAAAAA#A#A A100.0A1.0A10.0A0.#A#A AAAAAA#A#A AA0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08803");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(454, 4596, 583);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4596 + "'", int3 == 4596);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08804");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa1.0A1.0A-1.0--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: --1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa1.0A1.0A-1.0--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#1" + "'", str11, "10#1");
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08805");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a1.0a32#0#5                                                                                                                            100.041.0410.040.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08806");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08807");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(235.0f, 0.0f, (float) 572);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08808");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("97.0#100.0#3.21041101E9#35.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08809");
        int[] intArray4 = new int[] { (byte) 1, 1, 0, 'a' };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray4, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray4, '4');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1, 0, 97]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 1 0 97" + "'", str6, "1 1 0 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "14140497" + "'", str8, "14140497");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08810");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4 4   a a a0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4 4   a a a0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08811");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', 93, 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 240, 383);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 240");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08812");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##32#0#5", (double) 3.21041101E9f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.210411008E9d + "'", double2 == 3.210411008E9d);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08813");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 245, 422);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 422 + "'", int3 == 422);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08814");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08815");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08816");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str8, "100.0#1.0#10.0#0.0");
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08817");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 386, 348);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08818");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08819");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str9, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str11, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str13, "100.0 1.0 10.0 0.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08820");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ', (int) '#', (int) (byte) 0);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08821");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("32 0 52");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08822");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 357, 3.210411E31f, (float) 348);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.210411E31f + "'", float3 == 3.210411E31f);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08823");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-....-....aa-.-.-.3..-.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08824");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10a1 1 0 9744444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a1 1 0 9\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08825");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1.0#-1.0#-1.0#32.0#100.0#-1.#####################################################10A1A10A1A100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0#-1.0#-1.0#32.0#100.0#-1.#####################################################10A1A10A1A100");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08826");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(222L, (long) 92, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 222L + "'", long3 == 222L);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08827");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("######################################################################################################################################################################################################################################################################################################################0.04100.041.04-1.041.04100.0#1 1 0 97#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#####################################################################################################################################################################################################################################################################################################################0.04100.041.04-1.041.04100.0#1 1 0 97#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08828");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 507, (int) (byte) 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 378, (int) (short) -1);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 10 + "'", byte19 == (byte) 10);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08829");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08830");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("--1.0#-1.0#-1.0#32.0#100.0#-1.#####aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#010a.a0100a.a01a.a0a-a1a.a01a.a0100a.a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08831");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1286, (-1.0f), (float) 844);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1286.0f + "'", float3 == 1286.0f);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08832");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(192, 100, 367);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 367 + "'", int3 == 367);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08833");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 348, 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08834");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1#1#-1" + "'", str6, "-1#1#-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1 -1" + "'", str8, "-1 1 -1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08835");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 196, 196);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32 0 52" + "'", str14, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32a0a52" + "'", str16, "32a0a52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32 0 52" + "'", str23, "32 0 52");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08836");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("            10 10 -1            ", (long) 1001);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1001L + "'", long2 == 1001L);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("             .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"             .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08838");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08839");
        short[] shortArray5 = new short[] { (byte) -1, (short) 1, (byte) 100, (short) 0, (short) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 230, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 454, 471);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 454");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 1, 100, 0, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#1#100#0#1" + "'", str7, "-1#1#100#0#1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1a100a0a1" + "'", str9, "-1a1a100a0a1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08840");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                              0#0.1-#.0                                             0.001#0.1#0.1-#0.1#0.001#0.0.1-#0.001#0.23#0.1-#0.1-#0.1-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08841");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 233, (int) (short) 32);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str17, "100.0 1.0 10.0 0.0");
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08842");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 80L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 80L + "'", long2 == 80L);
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08843");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str19, "0.0#100.0#1.0#-1.0#1.0#100.0");
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08844");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 195.0f, (double) 191, 187.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 187.0d + "'", double3 == 187.0d);
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08845");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 233, (int) (short) 32);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 1504, 1504);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08846");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1041#1 1 0 97#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041#1 1 0 97#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08847");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 507, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08848");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("04 4   a a a.4 4   a a a041004 4   a a a.4 4   a a a0414 4   a a a.4 4   a a a044 4   a a a-4 4   a a a14 4   a a a.4 4   a a a0414 4   a a a.4 4   a a a041004 4   a a a.4 4   a a a04 4   a a a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"04 4   a a a.4 4   a a a041004 4   a a a.4 4   a a a0414 4   a a a.4 4   a a a044 4   a a a-4 4   a a a14 4   a a a.4 4   a a a0414 4   a a a.4 4   a a a041004 4   a a a.4 4   a a a04 4   a a a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08849");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1001, (float) 1385, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1385.0f + "'", float3 == 1385.0f);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08850");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041" + "'", str14, "1041");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08851");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 0, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 162, (int) (short) 32);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 380, (-1));
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str10, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str21, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str27, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1.04-1.04-1.0432.04100.04-1.0" + "'", str29, "-1.04-1.04-1.0432.04100.04-1.0");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08852");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08853");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(321041104L, (long) 507, (long) 318);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 318L + "'", long3 == 318L);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08854");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1001, (long) 126, 4596L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 126L + "'", long3 == 126L);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08855");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(378.0d, (double) 368, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08856");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 195, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 88, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 88");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08857");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0#100.0#1.0#-1.0#1.0#100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (float) 245);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 245.0f + "'", float2 == 245.0f);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08858");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, (int) (byte) -1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 378, 137);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08859");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 a4a4a4 4444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 a4a4a4 4444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08860");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', (int) (byte) 100, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 361, 101);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32a0a52" + "'", str17, "32a0a52");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "3240452" + "'", str23, "3240452");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "32#0#52" + "'", str25, "32#0#52");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08861");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 162L, (double) 673L, 269.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 673.0d + "'", double3 == 673.0d);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08862");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 904, 51);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08863");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08864");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08865");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                     .0#.0#.0##0#.0#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08866");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3210110.0f, (double) (-1), 3.21041104E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.21041104E8d + "'", double3 == 3.21041104E8d);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08867");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, (int) (byte) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 10, 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 0, 0);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08868");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 249, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str13, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08869");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1504, 222, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1504 + "'", int3 == 1504);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08870");
        double[] doubleArray3 = new double[] { 1, 1L, (-1L) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 162, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0a1.0a-1.0" + "'", str5, "1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08871");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".04100.041.04-1.041.04100.0", (double) 269L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 269.0d + "'", double2 == 269.0d);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08872");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("974324-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08873");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 332, (int) (short) -1);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        double double22 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str21, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08874");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 380, (int) (short) 100);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08875");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1. 1.0a1.0...           ", (float) 1365);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1365.0f + "'", float2 == 1365.0f);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08876");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 32, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08877");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32a-1a-1a100a10a32" + "'", str11, "32a-1a-1a100a10a32");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32#-1#-1#100#10#32" + "'", str13, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08878");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                       #-1.0#1.0a1.0a-1.0                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4444 4a4a4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444 4a4a4a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08880");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 100, (int) 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 92, 0);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "041" + "'", str5, "041");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0a1" + "'", str18, "0a1");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08881");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08882");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 137, 136);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08883");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        java.lang.Class<?> wildcardClass12 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 0 0 0" + "'", str8, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 0 0 0" + "'", str11, "1 0 0 0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08884");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 509, (long) 904, 507L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 904L + "'", long3 == 904L);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08885");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 100, 92);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 0, 0);
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08886");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("32a0a5232#-1#-1#100#10#3244444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08887");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 289L, (float) ' ', (float) 548);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 548.0f + "'", float3 == 548.0f);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08888");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 342, 380);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 342");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "041" + "'", str5, "041");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08889");
        int[] intArray3 = new int[] { 92, 10, (byte) 1 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[92, 10, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "92a10a1" + "'", str5, "92a10a1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "92#10#1" + "'", str7, "92#10#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 92 + "'", int8 == 92);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "9241041" + "'", str12, "9241041");
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08890");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(951, 162, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08891");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 101, (double) 334, 92.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 92.0d + "'", double3 == 92.0d);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08892");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("######################.04.04.044");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08893");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 365, 162L, (long) 4596);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4596L + "'", long3 == 4596L);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08894");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08895");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08896");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 915L, (float) 233, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 915.0f + "'", float3 == 915.0f);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08897");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(" A A   4 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A A   4 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08898");
        long[] longArray1 = new long[] { 137 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[137]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 137L + "'", long3 == 137L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "137" + "'", str5, "137");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "137" + "'", str7, "137");
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08899");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a...", 292);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 292 + "'", int2 == 292);
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08900");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("5432#0#52#-1.0#5432#0#52#-1.0#544432#0#52#-1.0#5432#0#52#-1.0#5532#0#52#-1.0#5432#0#52#-1.0#4444532#0#52#-1.0#4532#0#52#-1.0#5532#0#52#-1.0#432#0#52#-1.0#5432#0#52#-1.0#5432#0#52#-1.0#544432#0#52#-1.0#5432#0#52#-1.0#5532#0#52#-1.0#5432#0#52#-1.0#4444532#0#52#-1.0#4532#0#52#-1.0#5532#0#52#-1.0#45");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"5432#0#52#-1.0#5432#0#52#-1.0#544432#0#52#-1.0#5432#0#52#-1.0#5532#0#52#-1.0#5432#0#52#-1.0#4444532#0#52#-1.0#4532#0#52#-1.0#5532#0#52#-1.0#432#0#52#-1.0#5432#0#52#-1.0#5432#0#52#-1.0#544432#0#52#-1.0#5432#0#52#-1.0#5532#0#52#-1.0#5432#0#52#-1.0#4444532#0#52#-1.0#4532#0#52#-1.0#5532#0#52#-1.0#45\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08901");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#-1-1#11.#-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                    ", 185);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 185 + "'", int2 == 185);
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08902");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str15, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str17, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08903");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 368, (int) 'a');
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08904");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                      a a a#####################################################################################################################################################################################################################################################################################################################################################################0a.a04100a.a041a.a04a-a1a.a041a.a04100a.a#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08905");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08906");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-143240452410410" + "'", str11, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-143240452410410" + "'", str14, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08907");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a1.0a", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08908");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("40..#.40#.4.0#.40#.40..#.00 0 . 970-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08909");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                        4#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                        4#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08910");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(3.21041104E8d, 1353.0d, (double) 904);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 904.0d + "'", double3 == 904.0d);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08911");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 80L, 3.21041104E8d, (double) 550);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.21041104E8d + "'", double3 == 3.21041104E8d);
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08912");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
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
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08913");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 1                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08914");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str15, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str18, "0.0 100.0 1.0 -1.0 1.0 100.0");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08915");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#11097#a1.0a-1.a                                                                                          a                                                                                       a4a4a4 4444################################3205                                                                                                                                                                                          #-1.0#1.0a1.0a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08916");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 457, (long) 321041104, 101L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 321041104L + "'", long3 == 321041104L);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08917");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("7925.0#.0#.0##0#.0#10 1 10 1 100                                                                 0.0#100.0#1.0#-1.0#1.0#1..0A1A100", (double) 380L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 380.0d + "'", double2 == 380.0d);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08918");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) ' ', (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 835, (int) (short) 10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str18, "100.0 1.0 10.0 0.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100.041.0410.040.0" + "'", str20, "100.041.0410.040.0");
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08919");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', (int) (byte) 100, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 334, 172);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32#0#52" + "'", str17, "32#0#52");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32#0#52" + "'", str19, "32#0#52");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08920");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (short) 0, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08921");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("32.0100.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08922");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08923");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                            32#0#5");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08924");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("7925");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 7925 + "'", short1 == (short) 7925);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08925");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 242, 233);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 0, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08926");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08927");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 348, (float) (byte) 100, 3.210411E31f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08928");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 80, 10);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 222, 292);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 222");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08929");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08930");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 -1.0#-1.0#-1.0#32.0#144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (double) 196.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 196.0d + "'", double2 == 196.0d);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08931");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(910, 1103, 483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 483 + "'", int3 == 483);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08932");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aa1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a--1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1aa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08933");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0-1.0-1.032.0100.0-1.444-1.0-1.0-1.032.0100.0-152 97 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08934");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#####################################################################################################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08935");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08936");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 3.210411041321041E89d, (double) 548);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08937");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".0.0.00.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0A-1.0-1.01.0A1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08938");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08939");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4 4   A A A0444-1.0#-1.0#-1.0#32.0#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0a10.0a92.0a198.0a361.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.", 458);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 458 + "'", int2 == 458);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08940");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("001 79 25                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08941");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a4a4a4 444", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08942");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.-151.1.-11.1.-.1.a-.1.-.1.--11.1-.1-1.11.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08943");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("######################################################################################################################################################################################################################################", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08944");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08945");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str16, "100.0 1.0 10.0 0.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.041.0410.040.0" + "'", str18, "100.041.0410.040.0");
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08946");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) 'a', (int) (short) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32a0a52" + "'", str18, "32a0a52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32a0a52" + "'", str20, "32a0a52");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32#0#52" + "'", str22, "32#0#52");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "3240452" + "'", str24, "3240452");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08947");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08948");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08949");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-143240452410410" + "'", str11, "-143240452410410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 32 0 52 10 10" + "'", str13, "-1 32 0 52 10 10");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08950");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                        a1.0a-1.0 a a  a a  a a aa a   a a  a000000000000000000000000000000000000000000000000000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08951");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1 0 97", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08952");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.", 269L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 269L + "'", long2 == 269L);
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08953");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 198, (int) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 195, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#1" + "'", str24, "10#1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 10 + "'", byte25 == (byte) 10);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08954");
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
        float float24 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08955");
        double[] doubleArray1 = new double[] { 100.0d };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray1, 'a', 509, 711);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 509");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08956");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 507, 100);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 10 1 100" + "'", str16, "10 1 10 1 100");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08957");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1" + "'", str10, "10 1");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a1" + "'", str13, "10a1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08958");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 100, (float) 1365, (float) 105L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1365.0f + "'", float3 == 1365.0f);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08959");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                7                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08960");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(195.0f, (float) 1353L, (float) 105L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 105.0f + "'", float3 == 105.0f);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08961");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 240, 1103.0d, (double) 185);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1103.0d + "'", double3 == 1103.0d);
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08962");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1504, 318, 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 163 + "'", int3 == 163);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08963");
        int[] intArray3 = new int[] { ' ', 'a', (byte) 1 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 97, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3249741" + "'", str7, "3249741");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32#97#1" + "'", str9, "32#97#1");
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08964");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 137, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 0, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08965");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 361.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 361.0d + "'", double2 == 361.0d);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08966");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(657.0f, 0.0f, (float) 673);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 673.0f + "'", float3 == 673.0f);
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08967");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', (int) '4', (int) (byte) 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08968");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("##################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08969");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 550, 606);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08970");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 93, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 288, (-1));
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str7, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08971");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1504, 288, 4596);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4596 + "'", int3 == 4596);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08972");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(951, 248, 4596);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 248 + "'", int3 == 248);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08973");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08974");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 1385, 357);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08975");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##32#0#5", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08976");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 507, 100);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 137, (int) (byte) 10);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08977");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(550, 835, 835);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 550 + "'", int3 == 550);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08978");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (byte) 0, 334);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 334 + "'", int3 == 334);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08979");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" 2579 99279 79 2579 2579 2544479 0 1 1                                                                   ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08980");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 10, (int) (byte) 1);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 0, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str16, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str23, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08981");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 250.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 250.0f + "'", float2 == 250.0f);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08982");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 51, (double) 380, (double) 105L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 380.0d + "'", double3 == 380.0d);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08983");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(915L, (long) 10, 80L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 915L + "'", long3 == 915L);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08984");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 3210411041L, 222.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08985");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(288.0d, 673.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08986");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08987");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 0L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08988");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 32, (short) 100, (short) 32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08989");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 7925, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 7925 + "'", short3 == (short) 7925);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08990");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08991");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################4-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################4-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################4-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################4-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.####################################################################### -1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.####################################################################### -1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.####################################################################### -1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.####################################################################### -1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.####################################################################### -1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################4-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################4-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################4-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################40.#-1.0#0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08992");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) '4', (int) (short) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 137, 134);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 88, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 88");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100" + "'", str18, "100");
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08993");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08994");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 379, 222.0d, 673.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 673.0d + "'", double3 == 673.0d);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08995");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 9744452 9752 9752 97 97299 9752", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08996");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("class [Ljava.lang.String;class [Bclass [Ljava.lang.String;class [Ljava.lang.String;class [Bclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08997");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(910.0d, 0.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 910.0d + "'", double3 == 910.0d);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08998");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test08999");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 7925, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 7925 + "'", short3 == (short) 7925);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest17.test09000");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                             ", (long) 2450);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2450L + "'", long2 == 2450L);
    }
}

