package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("001a1-a1a001a001a010#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"001a1-a1a001a001a010#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03002");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 52, (int) ' ');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03003");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 39L, (float) 8, 4.4444447E9f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4.4444447E9f + "'", float3 == 4.4444447E9f);
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03004");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 95, 29.0f, (float) 20);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 95.0f + "'", float3 == 95.0f);
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03005");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 140, 49);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03006");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 16.0f + "'", float4 == 16.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "16.0#1.0" + "'", str6, "16.0#1.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03007");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 110, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', (int) (short) 14, (int) (short) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 10" + "'", str17, "-1 10");
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03008");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 0.0f, (float) 17);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03009");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#0\r                                               aa4a4                                                52.010.0-1.0-1.010.052.00#-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10 1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03011");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 21, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03012");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 26, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03013");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03014");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 306, 32);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("!ih!ih16.0 1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih!ih16.0 1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03016");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 106, 0.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 106.0f + "'", float3 == 106.0f);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03017");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a0a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a040a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a0a0a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a0 0a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a04");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03018");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("   ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03019");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444", (long) 301);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44444444444444444L + "'", long2 == 44444444444444444L);
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03020");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16.0a1.0" + "'", str7, "16.0a1.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03021");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) ' ', (double) 128L, 571.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 571.0d + "'", double3 == 571.0d);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444444 0#-1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4444444444 0#-1# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03023");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#35#   #  #- # hi!     . 1#35#100#10#-A44440#10#-1#01#35#100#10#-1#01#35#100#10#-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03024");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (short) -1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "a 4 4aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a 4 4aa");
        } catch (java.io.UnsupportedEncodingException e) {
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1 0" + "'", str19, "1 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 0" + "'", str21, "1 0");
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03025");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("  16.0 1.0######################   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03026");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("14", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 14 + "'", byte2 == (byte) 14);
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03027");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a  a  a   a  a- a ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03028");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("00aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3...", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03029");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03030");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4I!HI", (short) 40);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 40 + "'", short2 == (short) 40);
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03031");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a1a-1a    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03032");
        double[] doubleArray3 = new double[] { (short) -1, (short) 100, '4' };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 3, (int) (byte) 1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 52.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.04100.0452.0" + "'", str11, "-1.04100.0452.0");
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03033");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 824.0f, (double) 24.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03034");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4 # # #                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03035");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hia!ahia!1#35#100#10#-1#0HI! 10 100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03036");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03037");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (byte) 14, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03038");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("         1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#                            16.0A1.0001a1-a1a001a001a010#-1#0aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00  0 0\r1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01 0...10#-1#0                                                   AA4A4                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03039");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.250.010.1-0.1-0.010.25                                                4a4aa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03040");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0000\r110010101100101011001010110010101100101011001010110010101100101011001010110010101100101011001010110010101100101011001010110010101100101011001010110010101100101011001010110010101100101011001010110010101100101011001010110010101100101011001010110010101100101011001010110010101100101010...1010", 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03041");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("52.0410.04-1.04a4444a52.0410.04-1.04-1.0410.0452.000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("00a4444aaa44444a4444aa44444a4444                                       44a4444aa444444a4444aaa44444a4444aa44444a4444\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a4444aaa44444a4444aa44444a4444                                       44a4444aa444444a4444aaa44444a4444aa44444a4444?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03044");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaa                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03045");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 56, 390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 56");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a10a100a97a97a35" + "'", str12, "-1a10a100a97a97a35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-14104100497497435" + "'", str14, "-14104100497497435");
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03046");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1aa1aaa1aaa1aa1a1aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1aa1aaa1aaa1aa1a1aa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03047");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 301, (int) (short) 0);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1a35a100a10a-1a0" + "'", str12, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03048");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1878, 824L, (long) (short) 14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03049");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 100 + "'", byte21 == (byte) 100);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03050");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("3 353 353");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03051");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" #35#   #  #- # hi!     . 1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-", 156);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 156 + "'", int2 == 156);
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03052");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hia!ahia!", (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03053");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(4.4444444444E10d, (double) 824L, (double) 514);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444444444E10d + "'", double3 == 4.4444444444E10d);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03054");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 81, (int) (byte) -1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 107, (-1));
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1#35#100#10#-1#0" + "'", str20, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03055");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#35#100#10#-1#0\r                                               aa4a4                                                52.010.0-1.0-1.010.052.00#-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03056");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) ' ', (int) (short) 1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 104, 40);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 52.0f + "'", float17 == 52.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "52.0410.04-1.04-1.0410.0452.0" + "'", str19, "52.0410.04-1.04-1.0410.0452.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str21, "52.0a10.0a-1.0a-1.0a10.0a52.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03057");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1 0...10#-1#0", 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a10.0a-1.0hi4!4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a10.0a-1.0hi4!4hi4! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("tring;class[LjavalangString;class[LjavalangString;class[LjavalangString");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"tring;class[LjavalangString;class[LjavalangString;class[LjavalangString\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03060");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-110), 95.0d, (double) 83);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 95.0d + "'", double3 == 95.0d);
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03061");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aa4a4aa4a41aa4a44aa4a4\r");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03062");
        int[] intArray6 = new int[] { 'a', (short) 100, (byte) 1, (short) 0, (short) 100, 3 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 82, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 1, 0, 100, 3]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97a100a1a0a100a3" + "'", str8, "97a100a1a0a100a3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97 100 1 0 100 3" + "'", str10, "97 100 1 0 100 3");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97 100 1 0 100 3" + "'", str17, "97 100 1 0 100 3");
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03063");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                             ", 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03064");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) '#', 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03065");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("00000000000000000a4000000000000000000", (byte) 14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 14 + "'", byte2 == (byte) 14);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03066");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 180, 4.444444444444444E129d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.444444444444444E129d + "'", double3 == 4.444444444444444E129d);
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03067");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("             1#35#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03068");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03069");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("06#aa0#a0aa#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("143541004\r1041001041001041001041.010.0-1.0tring;clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;\r#4#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("ii  01 0...1..00.00.  0 00  0 00  0 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03072");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                        44 4 4#4#4#4 a4a aa4a4                         ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03073");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi! 10 100.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03074");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03075");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("      ...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03076");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 47, (float) 1878L, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03077");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                    1-#0", (double) 33L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.0d + "'", double2 == 33.0d);
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03078");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(79.0d, (double) 11111.0f, (double) 653);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11111.0d + "'", double3 == 11111.0d);
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03079");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(43.0d, (double) 20, (double) 30L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03080");
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
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1#0" + "'", str21, "1#0");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03081");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 34, 0L, 85L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 85L + "'", long3 == 85L);
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03082");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(Float.POSITIVE_INFINITY, 24.0f, (float) 301L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 24.0f + "'", float3 == 24.0f);
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03083");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1!4ih4!4ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !4ih4!4ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !4ih4!4ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !4ih4!4ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03084");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".1.010.0-1.1.010.0-1.1.1.0 10.0 -1.0i!hi!aa                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("class[Ljava.lang.String;1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class[Ljava.lang.String;1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03086");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 22, 14.0f, (float) 652);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14.0f + "'", float3 == 14.0f);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...104-1401#35#100#10#-1#0hi! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03088");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("HI!110#1#100143541004");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03089");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(112.0f, (-1.0f), (float) 85L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03090");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 1 100" + "'", str6, "10 1 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100" + "'", str8, "10#1#100");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03091");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 64, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14104100497497435" + "'", str10, "-14104100497497435");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a10a100a97a97a35" + "'", str12, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03092");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1#0" + "'", str19, "1#0");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("16.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"16.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a016.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03094");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str13, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03095");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a-1A10A#HI! AA AAAAAA##AAA#AA#AA#A                                                                        a a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a aa a a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("\n                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03097");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 32, 1815);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4 # # #                                                                    0#1-#01...97a100a1a0a100a31#001#53#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 # # #                                                                    0#1-#01...97a100a1a0a100a31#001#53#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03099");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', 130, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03100");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("!ih52.010.0-1.0-1.010.052.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03101");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) (short) 10, 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a100.0a-1.0a0.0" + "'", str13, "-1.0a100.0a-1.0a0.0");
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03102");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaahia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03103");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(11111.0f, 174.0f, (float) 49L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 11111.0f + "'", float3 == 11111.0f);
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI! AA AAAAAA##AAA#AA#AA#A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI! AA AAAAAA##AAA#AA#AA#A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03105");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(24.0f, (float) 16L, (float) 71);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("\ra#4#4                                             ...10#-1#0           0#-1#0                                             ...10#-1#0   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#4#4                                             ...10#-1#0           0#-1#0                                             ...10#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03107");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 100, (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 30, 24);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long23 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1a10a100a97a97a35" + "'", str20, "-1a10a100a97a97a35");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 10 100 97 97 35" + "'", str22, "-1 10 100 97 97 35");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi! 10 1a-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10 1a-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03109");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03110");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, 0, 306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03111");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 10, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 0, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03112");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03113");
        int[] intArray6 = new int[] { 'a', (short) 100, (byte) 1, (short) 0, (short) 100, 3 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 79, 4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 1, 0, 100, 3]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97a100a1a0a100a3" + "'", str8, "97a100a1a0a100a3");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97 100 1 0 100 3" + "'", str15, "97 100 1 0 100 3");
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03114");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44 4 4#4#                                           ", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03115");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 35.0f, (double) 301.0f, (double) 440);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 440.0d + "'", double3 == 440.0d);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03116");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0 100.0 -1.0 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03117");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 49L, (float) 81, (float) 25);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 25.0f + "'", float3 == 25.0f);
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03118");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a.aaaaaaaaaaaaahi! aa aaaaaa##aaa#aa#aa#a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03119");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03120");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, 140L, (long) 98);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03121");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 4, 140);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03122");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".     !ih # -#  #   #53#                       hia!ahia!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03123");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                  1#0                                                  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03124");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03125");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4    a   a a- a   ", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03126");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10#-1#04444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03127");
        int[] intArray2 = new int[] { 10, (short) 100 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "104100" + "'", str4, "104100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "104100" + "'", str8, "104100");
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03128");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A4A4A4A4AA-1HI! 10 100.A-1", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03129");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03130");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3#35" + "'", str11, "3#35");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3#35" + "'", str15, "3#35");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3435" + "'", str17, "3435");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03131");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("###143541004104-14#########\r###############################################aa4a4################################################\r###############################################aa4a4################################################\r###############################################aa4a4##########################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03132");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("52.0410.04-1.04-1.0410.0452.000a4444a52.0410.04-1.04", (double) 128L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 128.0d + "'", double2 == 128.0d);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03133");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 140, 49);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 271, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03134");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03135");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("HI! 10 100.0143541004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03136");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("###########", 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03137");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(42L, 405L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 405L + "'", long3 == 405L);
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03138");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1" + "'", str8, "100#-1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a-1" + "'", str11, "100a-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03139");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 405, 385);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "140" + "'", str11, "140");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1#0" + "'", str18, "1#0");
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03140");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#############################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"############################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03142");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 571, 306);
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
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03143");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 34L, 17.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 34.0f + "'", float3 == 34.0f);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03144");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 16.0f + "'", float9 == 16.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 16.0f + "'", float10 == 16.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03145");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".1.010.0-1.1.010.0-1.1.1.0 10.0 -1.0i!hi!aa                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03146");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 14 + "'", byte3 == (byte) 14);
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03147");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(824L, (long) 85, (long) 104100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104100L + "'", long3 == 104100L);
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03148");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0#1-#01...0 10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53hi!10100.hi!hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03149");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("  100aa4a4hi!hi!aa4a4aa4a44aa4a4\r  ", (byte) 14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 14 + "'", byte2 == (byte) 14);
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03150");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03151");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03152");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 1.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03153");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("143541004\raaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1041001041001041001041.010.0-1.0tring;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;\ra#4#4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03154");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 14, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  # is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03156");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0#1.0#0.0" + "'", str12, "-1.0#1.0#0.0");
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03157");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaa52.0#10.0#-1.0#-1.0#10.0#52.00#-aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03158");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03159");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(49, 16, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03160");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4", (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03161");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 90, (int) (byte) 10);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" 353 353\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 353 353?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03163");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100aa4a4hi!hi!aa4a4 aa4a44aa4a4 # # #", 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03164");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a1041001041001041001041.010.0-1.0a1041001041001041001041.010.0-1.0a1041001041001041001041.010.0-1.0a1041001041001041001041.010.0-1.0a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03165");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', (int) (byte) 1, 0);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 35 100 10 -1 0" + "'", str12, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03166");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(".1-0.010.1010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0a001a001a1a1-a1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03167");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 81, 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 32, (int) (byte) 1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 0, 0);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03168");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 100, (int) '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) '#', 16);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', (-1), 453);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03169");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("####1#ii  0 000.00.  0 00  0 00  0 0####1#ii  0 3a35####1#ii  0 000.00.  0 00  0 00  0 0####1#ii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03170");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(64, 52, 810);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03171");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 320, 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16.0a1.0" + "'", str9, "16.0a1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16.0 1.0" + "'", str11, "16.0 1.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("      100aa4a4hi!hi!aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"      100aa4a4hi!hi!aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03173");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 4, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 124, (int) (short) -1);
        float float23 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "16.0#1.0" + "'", str18, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 16.0f + "'", float23 == 16.0f);
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03174");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AA4A4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03175");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                        -1.0a1.0a0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03176");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 3, 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03177");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HI!110#1#100143541004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03178");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 140, (double) 9L, (double) 5);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 140.0d + "'", double3 == 140.0d);
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03179");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03180");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 91, 34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "-1aa4a435.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1aa4a435.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10 1 100" + "'", str7, "10 1 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10414100" + "'", str9, "10414100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03181");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0 10.0 -1.0" + "'", str8, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0a10.0a-1.0" + "'", str11, "1.0a10.0a-1.0");
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03182");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 20, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 46 + "'", int3 == 46);
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03183");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" #35#   #  #- # hi!     . ", 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03184");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03185");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03186");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44 4 4#4#4#4            -1A10A#-1A10A#-1A10A#-1-1.041.040.0           a4a                                                              aa4a4                                                ", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03187");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AA4A4", (long) 113);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 113L + "'", long2 == 113L);
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03188");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 77, 82);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 77");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03189");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("class [Ljava.lang.String;", (byte) 14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 14 + "'", byte2 == (byte) 14);
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03190");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("353\n 353 3");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4aaaaaaaa1#35#100#10#-1#0.1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4aaaaaaaa1#35#100#10#-1#0.1-0.010.116.0A1.0001a1-a1a001a001a010#-1#0!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!4ih!4ih4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03192");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 109, 306);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 109");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a100a97a97a35" + "'", str13, "-1a10a100a97a97a35");
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03193");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("\ra#4#4                                             ...10#-1#0           0#-1#0                                             ...10#-1#0   ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03194");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 23, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1#35#100#10#-1#0\r                                               aa4a4                                                52.010.0-1.0-1.010.052.00#-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1#35#100#10#-1#0?                                               aa4a4                                                52.010.0-1.0-1.010.052.00#-");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1" + "'", str13, "100a-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1004-1" + "'", str19, "1004-1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1004-1" + "'", str21, "1004-1");
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03195");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi100a100a1a-1a100", (float) 40L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 40.0f + "'", float2 == 40.0f);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03196");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                   0100AA4A4HI!HI!AA                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03197");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 110.0d, (double) 6L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 110.0d + "'", double3 == 110.0d);
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03198");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 150, (double) 17.0f, (double) 1815.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1815.0d + "'", double3 == 1815.0d);
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03199");
        int[] intArray6 = new int[] { 'a', (short) 100, (byte) 1, (short) 0, (short) 100, 3 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 1, 0, 100, 3]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97a100a1a0a100a3" + "'", str8, "97a100a1a0a100a3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97 100 1 0 100 3" + "'", str10, "97 100 1 0 100 3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97 100 1 0 100 3" + "'", str12, "97 100 1 0 100 3");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03200");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaa0", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03201");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 100, (int) '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) '#', 16);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03202");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1041004100414-14100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03203");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 7, 180);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 16.0f + "'", float18 == 16.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03204");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03205");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16.0#1.0" + "'", str8, "16.0#1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03206");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03207");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 100, (int) '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', (int) '#', 16);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1a10a100a97a97a35" + "'", str21, "-1a10a100a97a97a35");
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03208");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 130L, (double) 87, (double) 23.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 130.0d + "'", double3 == 130.0d);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03209");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (-1), 37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str10, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03210");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0hi!10100.01#35#100#10#-1#0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03211");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 11, 140);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 10" + "'", str16, "-1 10");
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03212");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03213");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(8L, 2L, 33L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 33L + "'", long3 == 33L);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03214");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aa4a", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03215");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("5.0      #5.0      #5.0      #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03216");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1" + "'", str8, "100#-1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a-1" + "'", str11, "100a-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1004-1" + "'", str13, "1004-1");
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03217");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("00aa4a4hi!hi!aa4a4 aa4a44aa4a4\r#35#444#44#-4#4hi!44444.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03218");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 52, 13);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03219");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 440, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 440L + "'", long3 == 440L);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03220");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (short) 100, (int) ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 125, 180);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 125");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03221");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 4, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 124, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 56, 653);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 56");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "16.0#1.0" + "'", str18, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03222");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(56, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 56 + "'", int3 == 56);
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03223");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(21.0d, (double) 35L, (double) 571L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.0d + "'", double3 == 21.0d);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03224");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1aa4a435.0                               ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03225");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 10, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1a0" + "'", str18, "1a0");
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03226");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 0, 5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 12, 405);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-1" + "'", str16, "143541004104-1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03227");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 514, 0L, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 514L + "'", long3 == 514L);
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03228");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0410.04-1.0" + "'", str17, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03229");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1 0...10#-1#010a100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03230");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 652, 33);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03231");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 50, 13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, 1225);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1" + "'", str8, "100#-1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03232");
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
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 124, 90);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03233");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A4A4A4A4AA-1HI! 10 100.A-1", (float) 34);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03234");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 35, (double) 100L, 391.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 391.0d + "'", double3 == 391.0d);
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03235");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("              -1a1a1a97a97a1#hia-1a1a1a97...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03236");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4, (float) 14, (float) 140L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 140.0f + "'", float3 == 140.0f);
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03237");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03238");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 64, 20);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03239");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100aa4a4hi!hi!aa4a4 aa4a44aa4a4 # # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00aa4a4hi\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03240");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 87, 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03241");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10a-1                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03242");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', 104100L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03243");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("   !i1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0", (long) 9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03244");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.Class<?> wildcardClass15 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03245");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(31L, 35L, 47L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31L + "'", long3 == 31L);
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03246");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("001#1-#1#001#001#", 3825);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3825 + "'", int2 == 3825);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03247");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (byte) 100, (int) (short) 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1" + "'", str21, "-1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1" + "'", str24, "-1");
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03248");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03249");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(31.0f, (float) 4L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 31.0f + "'", float3 == 31.0f);
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03250");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4a a a#a#a#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03251");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 95, (int) (byte) 10);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#35#100#10#-1#0" + "'", str17, "1#35#100#10#-1#0");
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03252");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 100L, 107.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.0d + "'", double3 == 107.0d);
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03253");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 79, 0L, (long) 98);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03254");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03255");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03256");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("              -1a1a1a97a97a1#hia-1a1a1a97...", 85L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85L + "'", long2 == 85L);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03257");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03258");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 56, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 56 + "'", int3 == 56);
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03259");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03260");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                1111111111                ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03261");
        float[] floatArray2 = new float[] { 810, 112.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[810.0, 112.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 810.0f + "'", float3 == 810.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 112.0f + "'", float4 == 112.0f);
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("             1#35#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03263");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.3#35", 11111.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11111.0f + "'", float2 == 11111.0f);
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03264");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a 4 4aa010#-1#", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03265");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 301L, 0.0f, (float) 42);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03266");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1A10A#-1A10A#-1A10A#-1-1.041.040.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03267");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(40L, (long) 53, (long) 81);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 40L + "'", long3 == 40L);
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03268");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a101 35 100 10 -1 0##35##00##0####0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03269");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(125, (int) (byte) 14, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 125 + "'", int3 == 125);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03270");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("###########", 83.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.0d + "'", double2 == 83.0d);
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03271");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("######################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03272");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 1, (-1));
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03273");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0-1A10A#-1A10A#-1A10A#-1-1.041.040.hi100a100a1a-1aaaaa\naaaaa -1A10A#-1A10A#-1A10A#-1-1.041.040.hi100a100a1a-1aaaaa\naaaaa -1A10A#-1A10A#-1A10A#-1-1.041.040.hi100a100a1a-1aaaaa\naaaaa -1A10A#-1A10A#-1A10A#-1-1.041.040.hi100a100a1a-1aaaaa\naaaaa -1A10A#-1A10A#-1A10A#-1-1.041.040.hi100a100a1a-1aaaaa\naaaaa -1A10A#-1A10A#-1A10A#-1-1.041.040.hi100a100a1a-1aaaaa\naaaaa -1A10A#-1A10A#-1A10A#-1-1.041.040.hi100a100a1a-1aaaaa\naaaaa -1A10A#-1A10A#-1A10A#-1-1.041.040.hi100a100a1a-1aaaaa\naaaaa ", 8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03274");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 18, (-110L), (long) 6);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18L + "'", long3 == 18L);
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03275");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-140" + "'", str16, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03276");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 807, (-110));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10" + "'", str11, "-1a10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03277");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a-1A10A100A97A97A35", (float) 13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03278");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 2, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("00aa4a4hi!hi!aa4a4 aa4a44aa4a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0aa4a4hi!hi!aa4a4 aa4a44aa4a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03280");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("010#-1#0a001a001a1a1-a001", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03281");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03282");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03283");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("   !ih    ", 39.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39.0d + "'", double2 == 39.0d);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03284");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 0, (short) 40);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 40 + "'", short3 == (short) 40);
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03285");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4                                                A4A", (float) 19);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.0f + "'", float2 == 19.0f);
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03286");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03287");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(21, 144, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 144 + "'", int3 == 144);
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0a100.0a-1.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a100.0a-1.0a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03289");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 0, 5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', (int) (byte) 1, (-1));
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long24 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "143541004104-1" + "'", str16, "143541004104-1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1a35a100a10a-1a0" + "'", str23, "1a35a100a10a-1a0");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03290");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 14 + "'", byte2 == (byte) 14);
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03291");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444        0#-1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03292");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi! 10 100.1#0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03293");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 571, 24);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "0#-10a-1                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0#-10a-1                                                                                                                                                                                                                                                                              ?4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100#-1" + "'", str15, "100#-1");
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03294");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("53#1#53#1#53#1#53#1#53#1#53#1#53#1#53#1#53#1#53#1#53#1...!aih!aiha!aih!aiha!aih!aiha!aih!aiha!aih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"53#1#53#1#53#1#53#1#53#1#53#1#53#1#53#1#53#1#53#1#53#1...!aih!aiha!aih!aiha!aih!aiha!aih!aiha!aih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03296");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("41hi! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03297");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(824.0d, (double) 125, 130.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 824.0d + "'", double3 == 824.0d);
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03298");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 40);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03300");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 100.0 -1.0 0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03301");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (short) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 47, 106);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03302");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 301, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 44, 5);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03303");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                           ... a-                                                            ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03304");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("  111hi!hi!111111111\r  ", 106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03305");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                       ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03306");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(18.0f, (float) 13, 83.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 13.0f + "'", float3 == 13.0f);
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03307");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("001a1-a1a001a001a0116.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03308");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1AA4A435.0                               ", (long) 106);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03309");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4a4 aa4a44aa4a4\r                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03310");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 49L, (double) 391L, (double) 27.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.0d + "'", double3 == 27.0d);
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03311");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("\r0 0  00");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03312");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 14, (byte) 14, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03313");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("A4a 4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03314");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03315");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 176, 2.0d, (double) 7.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03316");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(4L, (long) (short) 100, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1A1015#100#10#-1#0HI! 10 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03318");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a01a35a100a10a-1a00##");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03319");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(49, 30, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03320");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("      ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03321");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                      hi ! hi !");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03322");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100" + "'", str8, "10#1#100");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03323");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 97, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 24, 4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03324");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a-");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03325");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0a100.0a-1.0a0.044");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03326");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 42, (float) 87, 64.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 42.0f + "'", float3 == 42.0f);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03327");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 405, 0);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 1, (int) (short) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hia!ahia!1#35#100#10#-1#0HI! 10 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hia!ahia!1#35#100#10#-1#0HI! 10 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03329");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2665, 109.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2665.0f + "'", float3 == 2665.0f);
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03330");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                         !ih    ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03331");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(819, 0, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 819 + "'", int3 == 819);
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("101010101010101010101010101010101010101010101010101010101052.010.0-1.0-1.010.052.0 aa4a4 \r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 101010101010101010101010101010101010101010101010101010101052.010.0-1.0-1.010.052.0 aa4a4 ? is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03333");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("52.0#10.0#-1.0#-1.0#10.0#52.0-1A1044!!4444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03334");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 1, 13);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16.0 1.0" + "'", str13, "16.0 1.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 16.0f + "'", float14 == 16.0f);
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03335");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1410", (float) 128);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1410.0f) + "'", float2 == (-1410.0f));
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03336");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("143541004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa104100     a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"143541004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa104100     a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03337");
        org.apache.commons.lang3.math.NumberUtils numberUtils0 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils numberUtils1 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils numberUtils2 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils numberUtils3 = new org.apache.commons.lang3.math.NumberUtils();
        org.apache.commons.lang3.math.NumberUtils[] numberUtilsArray4 = new org.apache.commons.lang3.math.NumberUtils[] { numberUtils0, numberUtils1, numberUtils2, numberUtils3 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(numberUtilsArray4);
        org.junit.Assert.assertNotNull(numberUtilsArray4);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03338");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("11111111111#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03339");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03340");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 64, 49);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 103, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "\n                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ?                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                -1a101 35 100 10 -1 0                                               aa4a4                                                ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1" + "'", str8, "100#-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03341");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1 0...10#-1#010a100a100a1a-1a", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03342");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("   44444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03343");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray2 = new java.math.BigInteger[] { bigInteger1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray5 = new java.math.BigInteger[] { bigInteger4 };
        java.math.BigInteger bigInteger7 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray8 = new java.math.BigInteger[] { bigInteger7 };
        java.math.BigInteger bigInteger10 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray11 = new java.math.BigInteger[] { bigInteger10 };
        java.math.BigInteger bigInteger13 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray14 = new java.math.BigInteger[] { bigInteger13 };
        java.math.BigInteger bigInteger16 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray17 = new java.math.BigInteger[] { bigInteger16 };
        java.math.BigInteger[][] bigIntegerArray18 = new java.math.BigInteger[][] { bigIntegerArray2, bigIntegerArray5, bigIntegerArray8, bigIntegerArray11, bigIntegerArray14, bigIntegerArray17 };
        java.math.BigInteger bigInteger20 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray21 = new java.math.BigInteger[] { bigInteger20 };
        java.math.BigInteger bigInteger23 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray24 = new java.math.BigInteger[] { bigInteger23 };
        java.math.BigInteger bigInteger26 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray27 = new java.math.BigInteger[] { bigInteger26 };
        java.math.BigInteger bigInteger29 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray30 = new java.math.BigInteger[] { bigInteger29 };
        java.math.BigInteger bigInteger32 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray33 = new java.math.BigInteger[] { bigInteger32 };
        java.math.BigInteger bigInteger35 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1");
        java.math.BigInteger[] bigIntegerArray36 = new java.math.BigInteger[] { bigInteger35 };
        java.math.BigInteger[][] bigIntegerArray37 = new java.math.BigInteger[][] { bigIntegerArray21, bigIntegerArray24, bigIntegerArray27, bigIntegerArray30, bigIntegerArray33, bigIntegerArray36 };
        java.math.BigInteger[][][] bigIntegerArray38 = new java.math.BigInteger[][][] { bigIntegerArray18, bigIntegerArray37 };
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray38);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[][]) bigIntegerArray38);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigIntegerArray2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigIntegerArray5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigIntegerArray8);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(bigIntegerArray11);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigIntegerArray14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigIntegerArray17);
        org.junit.Assert.assertNotNull(bigIntegerArray18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigIntegerArray21);
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigIntegerArray24);
        org.junit.Assert.assertNotNull(bigInteger26);
        org.junit.Assert.assertNotNull(bigIntegerArray27);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigIntegerArray30);
        org.junit.Assert.assertNotNull(bigInteger32);
        org.junit.Assert.assertNotNull(bigIntegerArray33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigIntegerArray36);
        org.junit.Assert.assertNotNull(bigIntegerArray37);
        org.junit.Assert.assertNotNull(bigIntegerArray38);
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03344");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(16L, (long) 43, (long) 5);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5L + "'", long3 == 5L);
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("5-5-5-5-5");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"5-5-5-5-5\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03346");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 10, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 12, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
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
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03347");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03348");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 140, 90);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray3, ".1-0.010.1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .1-0.010.1");
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
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03349");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A        -1A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03350");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03351");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Aaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03352");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 21, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03353");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a1a1a97a97a1#hia-1a1a1a97a97a1#!-1a1a1a97a97a1#ahia-1a1a1a97a97a1#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03354");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!10100.hi!hi!");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03355");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03356");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" .     !ih # -#  #   #53# ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03357");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10 1 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03358");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100.a a4a4a#041hi! 10 100.4 a4a4a#041hi! 10 100.4 a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100. a4a4a#041hi! 10 100.", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03359");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1#35#100#10#-1#0hi!4104100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#100#10#-1#0hi!4104100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03360");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 14, (byte) 14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 14 + "'", byte3 == (byte) 14);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03361");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 90, (int) (byte) 10);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03362");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 14 + "'", byte3 == (byte) 14);
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03363");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" #35#   #  #- # hi!     . 1#35#100#10#-1#01#35#100#10#-3597.0a1.0a1.0a-1.0a1.0a-1.0", (long) 25);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25L + "'", long2 == 25L);
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03364");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(31, 652, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 652 + "'", int3 == 652);
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1a0                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a0                                            \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03366");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("[Ljava.lang.String; [Ljava.lang.String;class [Ljava.lang.String;class 1041001041001041001041.010.0-1.0tring;clas", (float) 46);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.0f + "'", float2 == 46.0f);
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03367");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                     4444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                     4444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03368");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("###############################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("041#10#100#97#97#35#10#100#97#97#35#10#100#97#97#35#10#100#97#97#35#10#100#97#97#35#10#100#97#97#35#10#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"41#10#100#97#97#35#10#100#97#97#35#10#100#97#97#35#10#100#97#97#35#10#100#97#97#35#10#100#97#97#35#10#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03370");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 4, 0);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.001A1-A1A01A1-A1A!ih041-401400145341");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.001A1-A1A01A1-A1A!ih041-401400145341\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03372");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03373");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03374");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 23, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03375");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 44, 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4                                                A4A");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4                                                A4A");
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
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1.0#10.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0#10.0#-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03377");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                              [Ljava.lang.String; [Ljava.lang.String;class [Ljava.lang.String;class 1041001041001041001041.010.0-1.0tring;class                                                                                              ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03378");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 106L, (float) 27, (float) 102);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 27.0f + "'", float3 == 27.0f);
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03379");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaa0aaa0aA0a0aaaa#a#1..a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03380");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03381");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("00a  a0a a0a\ra1a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a#a35a#a100a#a10a#a-a1a#a01a a0a...a10a#a-a1a#a0", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03382");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03383");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A4 4 A0#1", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03384");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (short) 100, 19);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 16.0f + "'", float6 == 16.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03385");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 40, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03386");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#######################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03387");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1, (int) (short) -1, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi4!4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4hi4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03389");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1 0...10#-1#010a100a100a1a-1a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1 0...10#-1#010a100a100a1a-1a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03390");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 83, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1#35#100#10#-1#0" + "'", str14, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1a35a100a10a-1a0" + "'", str18, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03391");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 14, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 14 + "'", byte3 == (byte) 14);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03392");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100aa4a4hi!hi!aa4a4 aa4a44aa4a4", (double) 405.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 405.0d + "'", double2 == 405.0d);
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03393");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str14, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 16.0f + "'", float15 == 16.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 16.0f + "'", float16 == 16.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03394");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("\r4A4AA44A4A.     !ih # -#  #   #53#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03395");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03396");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("40-1aa4a4hi100a100a1a-1a100", (double) 156);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 156.0d + "'", double2 == 156.0d);
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih\r0 0  00001a1-a1a001a001ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"01a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih?0 0  00001a1-a1a001a001ih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03398");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4L, 0L, (long) 18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03399");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Ii  0 000.00.  0 00  0 00  0 0\rhia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ", (float) 37);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 37.0f + "'", float2 == 37.0f);
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03400");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 10, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 271, 43);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03401");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100aa4a4hi!hi!aa4a4 aa4a44aa4a4", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03402");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str14, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 16.0f + "'", float15 == 16.0f);
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03403");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100L, (double) 25, (double) 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("001-i!hi!!hi53ih!ih-i!hi!!hi53ih!ih-i!hi!!hi53ih!.h-!.!h!.hi!hi!!hi53ih!ih-i!hi!!hi53ih!ih-i!hi!!hi53iha001a1a1-a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"01-i!hi!!hi53ih!ih-i!hi!!hi53ih!ih-i!hi!!hi53ih!.h-!.!h!.hi!hi!!hi53ih!ih-i!hi!!hi53ih!ih-i!hi!!hi53iha001a1a1-a001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03405");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 824, 76);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03406");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-1L), 440L, (long) 7);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1#35#100#10#-1#0hi!-1aa4a410-1aa4a4100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#100#10#-1#0hi!-1aa4a410-1aa4a4100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03408");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...10#-1#04444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03409");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 974, (float) (byte) 100, (float) 405L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03410");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  HI! 10 100.0143541004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03411");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a15-5-5-5-5a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a1", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03412");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" #35#   #  #- # hi!     . 1#35#100#10#-1#01#35#100#10#-3597.041.041.04-1.041.04-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03413");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0hi! 10 100.01#35#100#10#-1#0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03414");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("353\n 353 3353\n 353 3353\n 353 3353\n 353 3353\n 353 3353\n 353 3353\n 353 31.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03415");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 11, (long) (short) 100, (long) 174);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03416");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("############################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03417");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 140, 90);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 47, 47);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03418");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(42.0f, (float) 28L, (float) 514L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 28.0f + "'", float3 == 28.0f);
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03419");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("00001#35#11004-100001#35#1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03420");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 10, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03421");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 90, (int) (byte) 10);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1#35#100##1#35#100##1#3hi! 10 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#100##1#35#100##1#3hi! 10 100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0410.04-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.0410.04-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03424");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("5");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03425");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                            1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03426");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0#-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03427");
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
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                                                                              [Ljava.lang.String; [Ljava.lang.String;class [Ljava.lang.String;class 1041001041001041001041.010.0-1.0tring;class                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                               [Ljava.lang.String; [Ljava.lang.String;class [Ljava.lang.String;class 1041001041001041001041.010.0-1.0tring;class                                                                                              ");
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
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1a0" + "'", str20, "1a0");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03428");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 6, 391);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str14, "1.0 2.0 10.0 16.0 3.0 2.0");
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03429");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("##35##11##1####1\r33333333333333333333333333333333333333333333333aaaaa33333333333333333333333333333333333333333333333352-1#1-1##-1##-1#1-152-11##", (long) 271);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 271L + "'", long2 == 271L);
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03430");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 15.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03431");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03432");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 29, 0.0d, (double) 6L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03433");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 110, (-1));
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1a10" + "'", str20, "-1a10");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03434");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI4!4HI4!", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03435");
        double[] doubleArray3 = new double[] { (short) -1, (short) 100, '4' };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 3, (int) (byte) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 32, (int) (byte) 1);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 52.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0 100.0 52.0" + "'", str9, "-1.0 100.0 52.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03436");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(106, 9, 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 106 + "'", int3 == 106);
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03438");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414111111111114141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141", 128L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 128L + "'", long2 == 128L);
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa.aaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03440");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 53L, (double) 21, (double) 819);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 819.0d + "'", double3 == 819.0d);
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03441");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 807, 0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str20, "1.0a2.0a10.0a16.0a3.0a2.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03442");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(405, 50, 176);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 405 + "'", int3 == 405);
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03443");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 ", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03444");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 34, (double) 18.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03445");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 31.0f, (double) 11L, 41.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.0d + "'", double3 == 11.0d);
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03446");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97A100A1A0A100A3");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03447");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 10, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03448");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03449");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("         AA4A4         ", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03450");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 107, 39);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100" + "'", str8, "10#1#100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 1 + "'", byte13 == (byte) 1);
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03451");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4001453410.00101!IH", (double) (-1410.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1410.0d) + "'", double2 == (-1410.0d));
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03452");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("h#35#h!!#h!#-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#h#!h!#!-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03453");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03454");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03455");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aa04a00a04a00a04a00a04a.0a0.0-a.0aa04a00a04a00a04a00a04a.0a0.0-a.0aa04a00a04a00a04a00a04a.0a0.0-a.0aa04a00a04a00a04a00a04a.0a0.0-a.0a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03456");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 26, 0.0f, (float) 10414100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.04141E7f + "'", float3 == 1.04141E7f);
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("7A97A1#ahiahia!ahia!A1A1A97A97A1#!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"7A97A1#ahiahia!ahia!A1A1A97A97A1#!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03458");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03459");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100L, 11111.0f, (float) 25L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 11111.0f + "'", float3 == 11111.0f);
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03460");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("52.0410.04-1.04-1.0410.0452.000a4444a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52.0410.04-1.04-1.0410.0452.000a4444a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03461");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03462");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1.010.0-1.035.0                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03463");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03464");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                      ", 440L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 440L + "'", long2 == 440L);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03465");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03466");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03467");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C                 ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03468");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("16.01.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03469");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1#35#100#10#-1#0hi! 10 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Aaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Aaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03471");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(16, 10414100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03472");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3#35" + "'", str9, "3#35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3a35" + "'", str11, "3a35");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3#35" + "'", str13, "3#35");
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03473");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03474");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1610A110001a1-a1a001a001a010#-1#0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03475");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 11, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 0" + "'", str20, "1 0");
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03476");
        int[] intArray2 = new int[] { 10, (short) 100 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 44, (int) (byte) 10);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 128, 405);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 128");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "104100" + "'", str4, "104100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03477");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44 4 4#4#                                          ", (long) 90);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90L + "'", long2 == 90L);
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03478");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03479");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1H...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 104100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 104100.0f + "'", float2 == 104100.0f);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h10...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#01a0                                            4                                                a4a                                               4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h10...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#01a0                                            4                                                a4a                                               4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! 10 100.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03481");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 0, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1#35#100#10#-1#0" + "'", str14, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03482");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 112, (double) 30L, 125.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03483");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0#10.0#-1.0" + "'", str14, "1.0#10.0#-1.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0a10.0a-1.0" + "'", str16, "1.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1.0a10.0a-1.0" + "'", str18, "1.0a10.0a-1.0");
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03484");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(34L, (long) 807, (long) 77);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 34L + "'", long3 == 34L);
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03485");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(83, (int) (short) 40, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03486");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 1, (int) (short) 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03487");
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
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
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
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03488");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 130L, (float) 140, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03489");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("###############################################################################################44A44A4453A79A79A444A44A444.44444!IH444444444444534");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03490");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 14, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 14 + "'", short3 == (short) 14);
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03491");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("00aa4a4hi!hi!aa4a4aa4a44aa4a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0aa4a4hi!hi!aa4a4aa4a44aa4a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03492");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (short) 100, (int) ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 64, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03493");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03494");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) (short) 10, 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4', 10414100, 140);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03495");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("01A01A1-53A79A79A001A01A1-0.00101!ih0#1-#01#001#53#1", 306);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 306 + "'", int2 == 306);
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03496");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                  16.0A1.0001a1-a1a001a001a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03497");
        int[] intArray4 = new int[] { 35, 2, 9, (short) -1 };
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 2, 9, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03498");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#0hi!10100.", 571.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 571.0d + "'", double2 == 571.0d);
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03499");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                      -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                       -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1" + "'", str13, "100a-1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 -1" + "'", str16, "100 -1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100a-1" + "'", str18, "100a-1");
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test03500");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...                  ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...                  ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

