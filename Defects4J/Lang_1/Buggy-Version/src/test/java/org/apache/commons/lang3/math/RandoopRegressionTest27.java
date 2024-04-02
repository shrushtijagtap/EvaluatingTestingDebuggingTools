package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13501");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 177, (double) 823.0f, (double) 478L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 177.0d + "'", double3 == 177.0d);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13502");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAAA#AA#A#A#AA#AAA4A4AAAA4A4AAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAA#AA#A#A#AA#AAA4A4AAAA4A4AAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13503");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 558, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) '#', 525);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1a0a-1a10" + "'", str13, "100a1a0a-1a10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13504");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                       #404#4                                        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13505");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(".1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13506");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(998.0d, 565.0d, (double) 4732.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 565.0d + "'", double3 == 565.0d);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13507");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13508");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 993, 10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 558, (int) (short) 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10" + "'", str23, "10");
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13509");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(954.0f, (float) 3240L, (float) 4034);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4034.0f + "'", float3 == 4034.0f);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13510");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 473, 450);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13511");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 233, 942);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13512");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 0, 177);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13513");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0L, (float) 3373, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3373.0f + "'", float3 == 3373.0f);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13514");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("AA1A.A--A10404101A.A1A-AAA1A.A--A104041041A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A1040410#AA1A.A--A10404101A.A1A-AAA1A.A--A104041041A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A1040410#AA1A.A--A10404101A.A1A-AAA1A.A--A104041041A.A10.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#0.01 0.0A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A1040410#AA1A.A--A10404101A.A1A-AAA1A.A--A104041041A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A1040410#AA1A.A--A10404101A.A1A-AAA1A.A--A104041041A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A10404101A.A1A-AAA1A.A--A1040410#", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13515");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A10.A", (double) 1055);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1055.0d + "'", double2 == 1055.0d);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13516");
        double[] doubleArray6 = new double[] { 1.0f, 'a', ' ', 100.0f, 0L, 1 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0, 32.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a97.0a32.0a100.0a0.0a1.0" + "'", str9, "1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13517");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 998, 473);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double27 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 10.0" + "'", str12, "0.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0410.0" + "'", str14, "0.0410.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0.0#10.0" + "'", str26, "0.0#10.0");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13518");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10 -1 0 1 100aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13519");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.001a0A1.1-A1.--1040410A10.00 10.0Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#", (double) 1212);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1212.0d + "'", double2 == 1212.0d);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13520");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1 1", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13521");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("A0a001a0110                                                            ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13522");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A0.25A0.01A0.1--1.0A10.0A52.0A", (double) 4510);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4510.0d + "'", double2 == 4510.0d);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13523");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(840, 998, 812);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 998 + "'", int3 == 998);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13524");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13525");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 954, (long) 1302, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1302L + "'", long3 == 1302L);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13526");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4360L, (float) 478, 488.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 478.0f + "'", float3 == 478.0f);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13527");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.210#0#10a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.0#################################################################################################", 1314);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1314 + "'", int2 == 1314);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13528");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 1 0 -1 10" + "'", str9, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1a0a-1a10" + "'", str12, "100a1a0a-1a10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a1a0a-1a10" + "'", str14, "100a1a0a-1a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100a1a0a-1a10" + "'", str16, "100a1a0a-1a10");
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13529");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 4360, 1040410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1040410 + "'", int3 == 1040410);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13530");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1302, (long) 118, 488L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1302L + "'", long3 == 1302L);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13531");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-10a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13532");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a10.0a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13533");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 998, 4089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 998");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a100.0a0.0" + "'", str11, "0.0a100.0a0.0");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13534");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0L, 0.0f, (float) 4017);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13536");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#", 146);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 146 + "'", int2 == 146);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13537");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A0.25A0.01A0.1--1.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13538");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA10.100100.0010.250.010.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13539");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 724L, (float) 958L, (float) 1302);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 724.0f + "'", float3 == 724.0f);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13540");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13541");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#0", 403);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 403 + "'", int2 == 403);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13542");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) -1, (double) (byte) 1, (double) 1040410L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1040410.0d + "'", double3 == 1040410.0d);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13543");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13544");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4017, (float) 0, (float) 565L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13545");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13546");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#########################################################################################     -1 32##########################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13547");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                -1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13548");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13549");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 0, 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 780, 38);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "04-1" + "'", str17, "04-1");
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13550");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410A0A10#", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13551");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (byte) 10, 1952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a10.0" + "'", str12, "0.0a10.0");
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13552");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(403, 146, 3240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3240 + "'", int3 == 3240);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13553");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13554");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 780L, 1980L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1980L + "'", long3 == 1980L);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13555");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, (long) 526, 146L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 526L + "'", long3 == 526L);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13556");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.250.010.1-1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 840);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 840 + "'", int2 == 840);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13557");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 165, (long) 555, 1980L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1980L + "'", long3 == 1980L);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13558");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a0.0" + "'", str12, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13559");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("14100AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13560");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1 -1 10 1", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13561");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, (long) 3240, (long) 403);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3240L + "'", long3 == 3240L);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13562");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       -1.0410.0452.04                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 233.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 233.0d + "'", double2 == 233.0d);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13563");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0#1#0#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13564");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', 38, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 38");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str7, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13565");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.25a0.01a0.1-1a0.25a-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#a52.0a10.0a...0.1--1.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-                                      ...a52.0a1a0.25a...01a0a0                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13566");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 1 0 -1 10" + "'", str9, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1a0a-1a10" + "'", str12, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13567");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.01-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.0a1a13200.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13568");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', (int) (short) 10, (-1));
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13569");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1422, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 177, 403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 177");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13570");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100.0A52.0A10.0A0.1--1.0A0.01A0.25A10#0#100.001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0A52.0A10.0A0.1--1.0A0.01A0.25A10#0#100.001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13571");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) '4', (int) (short) 1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0000a.000..000a.00a11a00.a000..000.a0000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13573");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(656, 780, 4096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4096 + "'", int3 == 4096);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13574");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 604, (int) (byte) -1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 233, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) -1, 472);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13575");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10A0A10#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13576");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13577");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0404104-1                                                                            #0#10#0#100.001A0.25A0.01A0.1--1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0404104-1                                                                            #0#10#0#100.001A0.25A0.01A0.1--1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13578");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0" + "'", str10, "32 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13579");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 3996, 100);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#0#10" + "'", str12, "10#0#10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1040410" + "'", str18, "1040410");
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13580");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 488.0f, (double) 1952L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13581");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1055.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13582");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 524, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 524");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0a10.0" + "'", str6, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#10.0" + "'", str9, "0.0#10.0");
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13584");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 298, 702);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13585");
        double[] doubleArray5 = new double[] { 10.0d, 559, 1040410, 574, 559.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 559.0, 1040410.0, 574.0, 559.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10.0 559.0 1040410.0 574.0 559.0" + "'", str7, "10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10.0#559.0#1040410.0#574.0#559.0" + "'", str9, "10.0#559.0#1040410.0#574.0#559.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1040410.0d + "'", double10 == 1040410.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0 559.0 1040410.0 574.0 559.0" + "'", str12, "10.0 559.0 1040410.0 574.0 559.0");
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13586");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, (double) (byte) 1, 3637.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3637.0d + "'", double3 == 3637.0d);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13587");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, (float) 146L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13588");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (byte) 10, 10);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13589");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100A1A0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100A1A0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13590");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.32a0", (float) 1040410);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1040410.0f + "'", float2 == 1040410.0f);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13591");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13592");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13593");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.320");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13594");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13595");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 450);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 450 + "'", int2 == 450);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13596");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 3996, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3996L + "'", long3 == 3996L);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13597");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("32a00-.010.052.0100.0-1.010.052.010a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.32a0100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010-.010.052.0100.0-1.010.052.010a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.32a00-.010.052.0100.0-1.010.052.010a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.3", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13598");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(958L, (long) 1501, 998L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 958L + "'", long3 == 958L);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13599");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                             ...0#0#...                                             ", 123);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 123 + "'", int2 == 123);
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13600");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 100, (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 524, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1" + "'", str9, "-1 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13601");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 604, (double) 1040410, (double) 14100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 604.0d + "'", double3 == 604.0d);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13602");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                              -1.0#10.0#52.0#100.010414-1404-110411001411001010041100100104110010100411001411001010                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#10.0#52.0#100.010414-1404-110411001411001010041100100104110010100411001411001010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13604");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13605");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("404#41004.40014a404.4254a404.4014a404.414--414.4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13606");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1040410, 958);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a0.0" + "'", str14, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.04100.040.0" + "'", str17, "0.04100.040.0");
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13607");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.010.052.0100.001001.01a", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10#410A0A10# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13609");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#0#101.11-A1.25A1.1-A1.--");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13610");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 0, (int) (byte) 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float24 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0410.0452.04100.0" + "'", str21, "-1.0410.0452.04100.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0410.0452.04100.0" + "'", str23, "-1.0410.0452.04100.0");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13611");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 780, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 0, 3240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3240" + "'", str10, "3240");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32#0" + "'", str17, "32#0");
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13612");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        10#0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13613");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-141010041404-1410100410a1a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13614");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13615");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(656, 702, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13616");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13617");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1040410, 958);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 0, 403);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13618");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#################################################################################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13619");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0...A52.0A110#0#100.001#0.25#0...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13620");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 574, (int) (short) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 4114, 85);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.Class<?> wildcardClass20 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a10.0" + "'", str14, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13621");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 0, (int) (byte) 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float22 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float23 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str21, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1.0410.0452.04100.0" + "'", str25, "-1.0410.0452.04100.0");
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13622");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(702.0f, (float) 474, (float) 1212);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 474.0f + "'", float3 == 474.0f);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13623");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 394, 526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 394");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.04100.040.0" + "'", str10, "0.04100.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0#100.0#0.0" + "'", str13, "0.0#100.0#0.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13624");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("11111111111111111111111111110100110110A1001A1010A100AA001A0101A1001A01101111111111111111111111111                                                                                     ", 109L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109L + "'", long2 == 109L);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13625");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("############################################################################################################################################################################################################################################################################################################################################1041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.0a                                                                ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13626");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 196, 840);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 196");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 1" + "'", str13, "-1 1");
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13627");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-.1.52.1.-1.1.52.1a1.a52.a1-1.a1.a52.a1-1.a1.a52.32a-.1.52.1.-1.1.52.1a1.a52.a1-1.a1.a52.a1-1.a1.a52.32a1.1a.25a.1a.1--1.a1.a52.a1.1-.1.52.1.-1.1.52.1a1.a52.a1-1.a1.a52.a1-1.a1.a52.32a-.1.52.1.-1.1.52.1a1.a52.a1-1.a1.a52.a1-1.a1.a52.32a1.1a.25a.1a.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13628");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str12, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13629");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444104041010#-1#1#1#-1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444104041010#-1#1#1#-1#100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13630");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13631");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 840, 657);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 812, 451);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13632");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        java.lang.Class<?> wildcardClass8 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "04-1" + "'", str7, "04-1");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13633");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(604.0d, (double) 472, 233.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 604.0d + "'", double3 == 604.0d);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13634");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A10A0A10#AA", 2500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2500.0d + "'", double2 == 2500.0d);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13635");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0a10.0", (double) 544L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 544.0d + "'", double2 == 544.0d);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13636");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                 ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13637");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13638");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("            -.---A-.25A-.--A-.--");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13639");
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
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.AnnotatedElement[]) wildcardClassArray13);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[]) wildcardClassArray13);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class [Ljava.lang.String;class [F" + "'", str20, "class [Ljava.lang.String;class [F");
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13640");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13641");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1329, 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13642");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 115, (double) 565.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13643");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str14, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13644");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0000a.000..000a.00a##a00.a000..000.a0000");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13645");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0a10.0" + "'", str6, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13646");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 62, 10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13647");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 109, (int) (byte) 10);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str19, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13648");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1...a52.0a1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13649");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 474, 123L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13650");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410010#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13651");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#0.01 0.010#0#101.11-A1.25A1.1-A1.--", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13652");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               .a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1", (float) 3996L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3996.0f + "'", float2 == 3996.0f);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13653");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 525, (long) 524, (long) 478);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 478L + "'", long3 == 478L);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13654");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 100, (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1" + "'", str9, "-1 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13655");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 1, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 104041, 100);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 1" + "'", str20, "-1 1");
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13656");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#0#10#0...30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13657");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              00#1#0#-1#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13658");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 1040410, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) (short) 1, 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 4114, 233);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13659");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 134, 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13660");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 116, 1755L, (long) 478);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 116L + "'", long3 == 116L);
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13661");
        long[] longArray5 = new long[] { 10, (-1), 62, (short) 1, (-1L) };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 780, 189);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 196, 196);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, -1, 62, 1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 62L + "'", long6 == 62L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13662");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100.                                                                                                                                                                                                                                                              a52.0a10.0a                                                                                                                                                                                                                                                             -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.                                                                                                                                                                                                                                                              a52.0a10.0a                                                                                                                                                                                                                                                             -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13663");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1010#-1#1#1#-1#1004041010404A1.1-A1.--10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13664");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                                                         00                                                                                                                                                                                                                                                                                          0.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a141004.40014a404.4254a404.4014a404.414--414.4...#404           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13665");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 -1 10 1" + "'", str11, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13666");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.01-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.0a1a13200.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13667");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0410.0452.04100.0" + "'", str10, "-1.0410.0452.04100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13668");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 544, 574);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 544");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13669");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("       0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-          0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-a52.0a1-1.0a10.0a52.0a       0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-          0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-a52.0a1-1.0a10.0a52.0a       0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-           \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13671");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444########", 4510);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4510 + "'", int2 == 4510);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13672");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001 0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13673");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 3996, 1980);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float22 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str12, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13674");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4034, 872, 1980);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4034 + "'", int3 == 4034);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13675");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444-.1A-1.1A52.1A-10100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0100100.001A0.25A0.01A0.1-1", (double) 4510);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4510.0d + "'", double2 == 4510.0d);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13676");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.25a0.01a0.1-1a0.25a-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#a52.0a10.0a...0.1--1.0", 656);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 656 + "'", int2 == 656);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13677");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 10, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
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
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13678");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 1422, 474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1422 + "'", int3 == 1422);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13679");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10a0a#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#1010a0a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13680");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 476, (int) ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0" + "'", str12, "32 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13681");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 656, 1501);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 656");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str13, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13682");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 0, 1212);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.04100.040.0" + "'", str10, "0.04100.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a0.0" + "'", str14, "0.0a100.0a0.0");
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10....                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10....                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13684");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "                                                                            1-4014040");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                             1-4014040");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13685");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13686");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("    1 0 1 000 0 000 A 0 0 1. A 0 0 00 A 0 0 0 .. 0 0 0 A 00 0 0 A .1 0 0 A 000 0 000 1 0 1 00    ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13687");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13688");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 823, (float) 604, 604.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 823.0f + "'", float3 == 823.0f);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13689");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "0100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010010");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010010");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13690");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" #4# # ##");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13691");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 840, 657);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13692");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13693");
        int[] intArray6 = new int[] { ' ', 958, 558, 559, 'a', 574 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 958, 558, 559, 97, 574]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 958 + "'", int7 == 958);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 958 + "'", int8 == 958);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 958 + "'", int10 == 958);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 958 + "'", int11 == 958);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13694");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a100.0a0.0" + "'", str11, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a0.0" + "'", str14, "0.0a100.0a0.0");
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13695");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 118, 104041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 118");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1a100" + "'", str8, "1a100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "14100" + "'", str10, "14100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 100" + "'", str12, "1 100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13696");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3919, (float) 3996, 702.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3996.0f + "'", float3 == 3996.0f);
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13697");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 109, (long) 3919);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3919L + "'", long3 == 3919L);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13698");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10A0A10#AA0.001a0.25a0.01a0.1--1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10A0A10#AA0.001a0.25a0.01a0.1--1.0a10.0a52.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13699");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("11111111111111111111111111110100110110A1001A1010A100AA001A0101A1001A01101111111111111111111111111                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13700");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("104041010#-1#1#1#-1#100", (long) 4017);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4017L + "'", long2 == 4017L);
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13701");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13702");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(544.0f, 1055.0f, (float) 4096L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 544.0f + "'", float3 == 544.0f);
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13703");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1-.---A-.25A-.--A-.--");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13704");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 100, 702.0f, (float) 702);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13705");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("410010#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410010#                                                                                                                                                                                                                                    0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-          0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-a52.0a1-1.0a10.0a52.0a       0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                410010#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410010#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13706");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#10.0#52.0#100.010414-1404-110411001411001010041100100104110010100411001411001010");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13707");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (byte) 10, 10);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1a32" + "'", str18, "-1a32");
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13708");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13709");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13710");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 574, (double) 1422.0f, (double) 565L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1422.0d + "'", double3 == 1422.0d);
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13711");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 100, (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13712");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 #0#100.001a0.25a0.01a0.1--1.0...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13713");
        int[] intArray3 = new int[] { '4', 526, 4089 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 526, 4089]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 526 4089" + "'", str5, "52 526 4089");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4089 + "'", int6 == 4089);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13714");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13715");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10-1.0A10.0A52.0A1-1.0A10.0A52.0A1#-1.0A10.0A52.0A1-1.0A10.0A52.0A10-1.0A10.0A52.0A1-1.0A10.0A52.0A1#-1.0A10.0A52.0A1-1.0A10.0A52.0A110");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13716");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13717");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 1314, 4732);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1314");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13718");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400...a52.0a1-a10.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-13240AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-10A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400...a52.0a1-a10.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-13240AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-10A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A0A10A-132400A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13719");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, (int) (byte) 10);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 3637, 451);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13720");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a-1a10a1" + "'", str7, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1#-1#10#1" + "'", str10, "1#-1#10#1");
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13721");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 657, 2657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 657");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13722");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13723");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1 1000.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.320");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13724");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#0#100.001A0.25A0.01A0.1--1.0...#a#aAaAaAaAaAaA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#100.001A0.25A0.01A0.1--1.0...#a#aAaAaAaAaAaA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13725");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.1.5.1.-1.1.5.1-1.1.5.11.5.1..1--1..1.51.1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13726");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A0.25A0.01A0.1--1.0A10.0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13727");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 574L, (float) 526, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13728");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13729");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str15, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13730");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13731");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, (double) 604.0f, (double) 451L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13732");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040410" + "'", str11, "1040410");
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13733");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a0.25a0.01a0.1--1.0...4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13734");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a100.0a0.0", (float) 116L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 116.0f + "'", float2 == 116.0f);
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13735");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13736");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 604.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13737");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13738");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0497.0432.04100.040.041.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13739");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 942, (long) 1952, 116L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 116L + "'", long3 == 116L);
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13740");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.01-1.010.052.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13741");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 559, (int) (short) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 812, 4114);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 812");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a-1a10a1" + "'", str7, "1a-1a10a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a-1a10a1" + "'", str13, "1a-1a10a1");
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13742");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a3...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.010a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10#0#1010a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10#0#1010a0a10#4410a0a10#4410a0a10#410010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10#0#1010a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10#0#1010a0a10#4410a0a10#4410a0a10#44");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13743");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#559.0#1040410.0#574.0#559.014-140.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a141");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13744");
        long[] longArray3 = new long[] { (short) 0, 1, (byte) 1 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) '#', 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 1, 1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0a1a1" + "'", str5, "0a1a1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0a1a1" + "'", str11, "0a1a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13745");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                        -1.0a10.0a52.0a1-1.0a10.0a52.0a1                                                                    ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13746");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 1980, (int) (byte) -1);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 544, 4089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 544");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0#10.0" + "'", str12, "0.0#10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13747");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 100, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13748");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0A1A1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0A1A1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13749");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 775, (long) 177, (long) 1302);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 177L + "'", long3 == 177L);
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13750");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1303, 165.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13751");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-A10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13752");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a0.01a0.25a100.010#0#100.001a52.0a10.0a0.1--1.0a0.01a0.25a.0011A0.25A...a0.25a...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.01a0.25a100.010#0#100.001a52.0a10.0a0.1--1.0a0.01a0.25a.0011A0.25A...a0.25a...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13753");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13754");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 559, (int) 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 958, (-1));
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10#0#10" + "'", str22, "10#0#10");
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13755");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1 01 1- 1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13756");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 189, (float) 4017, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13757");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str13, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str16, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13758");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 1, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 823, 189);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 702, (int) (byte) -1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13759");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13760");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                         00                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.0-1.010.052.0100.001#0#010.0010.250.010.1--1.010.052.0100.0.001A0.25A0.01A0.1--1.0A10.0A52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13761");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) 'a', (int) '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 308, 574);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 308");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13762");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, (int) (byte) 10);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                 10A0A10#AA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                 10A0A10#AA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13763");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1 1                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13764");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("23");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.0d + "'", double1 == 23.0d);
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13765");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13766");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 146, 38);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13767");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 0, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (short) 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 4096, 574);
        short short25 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 62, 565);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 62");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10a0a10" + "'", str27, "10a0a10");
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13768");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4-1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13769");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 565, 559);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1#1#1#-1#100" + "'", str10, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#1#1#-1#100" + "'", str12, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-141414-14100" + "'", str14, "104-141414-14100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) -1 + "'", short19 == (short) -1);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13770");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13771");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 1314, 3280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1314");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1#-1#10#1" + "'", str9, "1#-1#10#1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13772");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("       0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-          0.1--1.0...A0.01A0.25A#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#100.001A0.25A0.01A0.1-A52.0A1-1.0A10.0A52.0A       0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-           ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13773");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaa ...0.1--1.010.052.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13774");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10A0A10#AA 0.001a0.25a0.01a0.1--1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13775");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0A.25A..0A.0000.A0..A52.A0...0.001a0A1.1-A1.--1040410A10.00 10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13776");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 165, (int) (byte) 100);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str17, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13777");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str7, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13778");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1329, (long) 1040410, (long) 1501);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1040410L + "'", long3 == 1040410L);
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13779");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13780");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       -1.0410.0452.04                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13781");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13782");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.1--1.0.....A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13783");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("       0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-          0.1--1.0...A0.01A0.25A#1a0.25a0.01a0.1-1a0.25a0.01a0.1-#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#100.001A0.25A0.01A0.1-A52.0A1-1.0A10.0A52.0A       0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-               0.001A0.25A0.01A0.1-           ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13784");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              00#1#0#-1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13785");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a", 109);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 109 + "'", int2 == 109);
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13786");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13787");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0 100.0 0.0" + "'", str16, "0.0 100.0 0.0");
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13788");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 525, (long) 544, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13789");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13790");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A0.25a0.01a0.1--1.0...                                                            ...", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13791");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), 0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13792");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1), (double) 558, (double) 993);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 993.0d + "'", double3 == 993.0d);
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13793");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 954L, 840.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 954.0f + "'", float3 == 954.0f);
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13794");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.00#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13796");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) ' ', (int) ' ');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13797");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 308, 3637L, 958L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 308L + "'", long3 == 308L);
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13798");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 4510L, (long) 146);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13799");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a0a10..... a0a10..... a0a10.....4a0a10..... a0a10..... a0a10..... a0a10.....aa0a10..... a0a10.....#a0a10..... a0a10.....4a0a10.....", (double) 1302);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1302.0d + "'", double2 == 1302.0d);
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13800");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(954, 0, 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 954 + "'", int3 == 954);
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13801");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 1040410, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) (short) 1, 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.Class<?> wildcardClass27 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13802");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 109, (int) (byte) 10);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13803");
        long[] longArray3 = new long[] { 1L, 10, 100L };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 62, 0);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[1, 10, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13804");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 574, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 10, (int) (byte) -1);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13805");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 872, 3919);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 872");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04100.040.0" + "'", str8, "0.04100.040.0");
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13806");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0a-1" + "'", str9, "0a-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0#-1" + "'", str11, "0#-1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13807");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 812.0f, (double) 404L, (double) 942L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 942.0d + "'", double3 == 942.0d);
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13808");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaa0 23");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13809");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("404#41004.40014a404.4254a404.4014a404.414--414.4", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13810");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("       0.001a0.25a0.01a0.1-        ##############################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:        0.001a0.25a0.01a0.1-        ############################################################## is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13811");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1314, (double) 558L, (double) 4732);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4732.0d + "'", double3 == 4732.0d);
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13812");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.0a1a132 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.0a1a132 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13813");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 1952, 134);
        java.lang.Class<?> wildcardClass12 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0404104-1" + "'", str7, "0404104-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13814");
        int[] intArray6 = new int[] { ' ', 958, 558, 559, 'a', 574 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 550, 1314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 550");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 958, 558, 559, 97, 574]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 958 + "'", int7 == 958);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 958 + "'", int8 == 958);
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13815");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-A1.--1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-A1.--1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13816");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 116, 4510);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 116");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13817");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              00#1#0#-1#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13818");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("A0.25A0.01A0.1--1.0A10.0A", (long) 146);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 146L + "'", long2 == 146L);
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13819");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (-1));
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a0a10" + "'", str15, "10a0a10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13820");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1#-1#10#1" + "'", str12, "1#-1#10#1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13821");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0#10.0" + "'", str12, "0.0#10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a10.0" + "'", str16, "0.0a10.0");
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13822");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0A52.0A10.0A0.1--1.0A0.01A0.25A10#0#100.001");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13823");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0#1#0#-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13824");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13825");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("104-141414-14A0.01A0.1--1.0A10.0A52.0A", 942);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 942 + "'", int2 == 942);
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13826");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13827");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#a#aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13828");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13829");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 488, 488);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10041404-1410" + "'", str13, "10041404-1410");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13830");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', 1980, 4017);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1980");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13831");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1314L, (double) 118, (double) 2500);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2500.0d + "'", double3 == 2500.0d);
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13832");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 1, 100L, (long) 308);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13833");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4510L, (float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13834");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "-1#32####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################-1.0A10.0A52.0A100.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1#32####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################-1.0A10.0A52.0A100.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13835");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10041404-1410" + "'", str13, "10041404-1410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10041404-1410" + "'", str15, "10041404-1410");
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13836");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...#A1.1-A1.--#100#.#001#A#0#.#25#A#0#.#01#A#0#.#1#--#1#.#0#A#10#.#0#A#52#.#0#A#100#.#010#A1.1-A1.--#0#A1.1-A1.--#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13837");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...0#0#...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13838");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 4219);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4219.0d + "'", double2 == 4219.0d);
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13839");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("410a0a10#", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13840");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0444444444444444444444444444444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.04444444444444444                                                                                -1.0410.0452.04100.04444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0444444444444444444444444444444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.04444444444444444", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13841");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (short) 1, (long) 1422);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13842");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-4-4--4--");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-4-4--4--\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13843");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1a0.25a0.01a0.1--1.0...0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13844");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 100, (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "41004.40014a404.4254a404.4014a404.414--414.4...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 41004.40014a404.4254a404.4014a404.414--414.4...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1" + "'", str9, "-1 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13845");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (byte) 100, 0);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 0);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 1 0 -1 10" + "'", str9, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13846");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 604, (int) (byte) -1);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (short) 1, 4089);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 10 + "'", byte18 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 10 + "'", byte19 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 10 + "'", byte20 == (byte) 10);
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13847");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#######################################################################################################################################################################################################################################################################-4-4--4--1A.A1A-AaA1A.A--A1040410######################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13848");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#0#100.001a0.25a0.01a0.A1.1-A1.--104041052.0A100.0444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13849");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13850");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (short) 0, 1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13851");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0#100.0#0.0" + "'", str10, "0.0#100.0#0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0#100.0#0.0" + "'", str12, "0.0#100.0#0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0 100.0 0.0" + "'", str14, "0.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13852");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 1040410, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) (short) 1, 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int27 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 3637);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13853");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 476, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#1#0#-1#10" + "'", str12, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13854");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(657, (int) 'a', 1314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1314 + "'", int3 == 1314);
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13855");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) (byte) 100, (int) (byte) 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 1212, 38);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#0#10" + "'", str9, "10#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13856");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1314L, (float) 4089L, 1.100101E7f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1314.0f + "'", float3 == 1314.0f);
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13857");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a0a10a-10.0A0.001A0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13858");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("41100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ", 823.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 823.0f + "'", float2 == 823.0f);
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13859");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("404104-1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13860");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 547, 451);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13861");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#-1#10" + "'", str13, "100#1#0#-1#10");
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13862");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, 4360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 559");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13863");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13864");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (double) 4114.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4114.0d + "'", double2 == 4114.0d);
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13865");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 2657, (float) 1055L, (float) 116);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 116.0f + "'", float3 == 116.0f);
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13866");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13867");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13868");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 1040410, (int) '4');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                          1a0.25a0.01a0.1-1a0.25a0.01a0.1-                            0 10 0...30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a0.25a0.01a0.1-1a0.25a0.01a0.1-                            0 10 0...30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13870");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 526, 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 526, 993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 526");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13871");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.044444444444444444444444444                                0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.044444444444444444444444444                                0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13872");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4219, 724, 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4219 + "'", int3 == 4219);
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13873");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444444444444444444444444444444444444444444444444444444444444444444444444444 -1 32A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13874");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1665.0d, 1755.0d, (double) 550);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 550.0d + "'", double3 == 550.0d);
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13875");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13876");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1980, 488);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13877");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13878");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 0, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (short) 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 4096, 574);
        short short25 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 4732, 451);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 0 + "'", short25 == (short) 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10a0a10" + "'", str27, "10a0a10");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A.5A.1A.1-1A.5A.1A.1-.1A.5A.1A.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A.5A.1A.1-1A.5A.1A.1-.1A.5A.1A.1- is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13880");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                             ...0#0#...                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13881");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A0.25A0.01A0.1--1.0...0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A0.25A0.01A0.1--1.0...0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13882");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1040410, 958);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a0.0" + "'", str14, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0#100.0#0.0" + "'", str16, "0.0#100.0#0.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13883");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               .a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13884");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13885");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("     -1 3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     -1 3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13886");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.0-1.010.052.0100.001#0#010.0010.250.010.1--1.010.052.0100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13887");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, 349, 657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13888");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 476, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 0, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13889");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(62L, 0L, (long) 64);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13890");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a1-a01a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a1-a01a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13891");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.25A0.01A0.1-1A0.25A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#A52.0A10.0A...0.1--1.0-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13892");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13893");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#0", (double) 812.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 812.0d + "'", double2 == 812.0d);
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13894");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...a52.0a.a.25a.a.--.a.a52.a.44444444444444444444444444444444444444444444444444444444444444444444444444444444-.1a-1.1a52.1a-10100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0100100.001a0.25a0.01a0.1-", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13895");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 'a', (float) 294, (float) 1314);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13896");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(474, 555, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13897");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 526);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 526 + "'", int2 == 526);
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13898");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.250.010.1-1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13899");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 10, (int) (short) -1);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0#10.0" + "'", str12, "0.0#10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13900");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1.11-a1.25a1.1-a1.--");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13901");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Aaaa#aa#a#a#aa#aaa4a4aaaa4a4AaaaaAaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          #0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13902");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 64, (-1));
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13903");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13904");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AAAAAAAAA4A4AAAA4A4AAA#AA#A#A#AA#AAAAa0.1--1.0.A1.1-A1.--1040410104041010#-1#1#1#-1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13905");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 0, 3280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a1a0a-1a10" + "'", str11, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13906");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13907");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                             -1.010.052.0100.                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13908");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0-a10.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13909");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 62, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 0 10" + "'", str17, "10 0 10");
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13910");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 604, 21);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0a-1" + "'", str9, "0a-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0#-1" + "'", str11, "0#-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13911");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1040410, 958);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 998, 657);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13912");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) 'a', (int) '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 840, 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 109, 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13913");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str7, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13914");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      0#1#0#-", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13915");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', 21, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13916");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 473, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 451, 1422);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 451");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13917");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.01-1.010.052.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.01-1.010.052.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13918");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444-.1A-1.1A52.1A-1#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#100.001A0.25A0.01A0.1-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13919");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 -1 10 1" + "'", str11, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1a-1a10a1" + "'", str16, "1a-1a10a1");
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13920");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 1212, 3920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3920 + "'", int3 == 3920);
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13921");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, (int) (byte) 10);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1#100" + "'", str9, "1#100");
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13922");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0410.0" + "'", str18, "0.0410.0");
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13923");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a100.0a0.0" + "'", str7, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13924");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13925");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 574, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str14, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13926");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 10.0" + "'", str12, "0.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0410.0" + "'", str14, "0.0410.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0#10.0" + "'", str16, "0.0#10.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0410.0" + "'", str18, "0.0410.0");
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13927");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 840, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13928");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a10...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13929");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3240" + "'", str8, "3240");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13930");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 10, (int) (short) 1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13931");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "4#0.04100.040.0A0.25A0.01A");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4#0.04100.040.0A0.25A0.01A");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13932");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 0, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (short) 0);
        short short21 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10#0#10" + "'", str23, "10#0#10");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10a0a10" + "'", str25, "10a0a10");
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13933");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13934");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".a.25a.a.--.a.a52.a.44444444444444444444444444444444444444444444444444444444444444444444444444444444-.1a-1.1a52.1a-1#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#100.001A0.25A0.01A0.1-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".a.25a.a.--.a.a52.a.44444444444444444444444444444444444444444444444444444444444444444444444444444444-.1a-1.1a52.1a-1#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#100.001A0.25A0.01A0.1-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13935");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1040410, (long) 123, 450L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1040410L + "'", long3 == 1040410L);
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13936");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0404104-1                                                                            #0#10#0#1.1A0.25A0.01A0.1--110a0a100.001a0.25a0.01a0.1-0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13937");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 100, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13938");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Aaaa#aa#a#a#aa#aaa4a4aaaa4a4AaaaaAaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Aaaa#aa#a#a#aa#aaa4a4aaaa4a4AaaaaAaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13939");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441004.40014a404.4254a404.4014a404.414--414.4...#40444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13940");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 724L, (double) 177L, (double) 4052);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 177.0d + "'", double3 == 177.0d);
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13941");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4 4 4 4 4 4 # 4 4 4 4 4 4 4 4 4 4 4 4 # 4 4 4 4 4 4##############################################################        -1.0a10.0a52.0a100.0       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 4 4 4 4 4 # 4 4 4 4 4 4 4 4 4 4 4 4 # 4 4 4 4 4 4##############################################################        -1.0a10.0a52.0a100.0       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13942");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 526, 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 1040410, 780);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13943");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 21, 233.0d, (double) 954.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 954.0d + "'", double3 == 954.0d);
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13944");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.25a0.01a0.1-1a0.25a-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#a52.0a10.0a...0.1--1.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--ahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.25a0.01a0.1-1a0.25a-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#a52.0a10.0a...0.1--1.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--ahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13945");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 702, 488.0d, 165.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 702.0d + "'", double3 == 702.0d);
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13946");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 488, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0 10.0" + "'", str7, "0.0 10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0#10.0" + "'", str13, "0.0#10.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13947");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...A52.0A110#0#100.001#0.25#0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...A5\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13948");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("      0.001A0.25A0.01A0.1-      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13949");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 1980, 565);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0410.0452.04100.0" + "'", str10, "-1.0410.0452.04100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13950");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13951");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13952");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(4360.0f, (float) 100L, (float) 526L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4360.0f + "'", float3 == 4360.0f);
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13953");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10L, (float) 574L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13954");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(550, 525, 2500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 525 + "'", int3 == 525);
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13955");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 559.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13956");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1 32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13957");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 403, (double) (short) 10, 958.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 958.0d + "'", double3 == 958.0d);
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13958");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                          ##############################################################-1.0A10.0A52.0A100.0230#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13959");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13960");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', (int) (short) 10, (-1));
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13961");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 100, (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13962");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0 -1.0410.0452.04100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13963");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("40441004.40014a404.4254a404.4014a404.414--414.404a4104.404a4524.404a41004.40104404410", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13964");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001                                                ...", (double) 3919);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3919.0d + "'", double2 == 3919.0d);
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13965");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0.001A0.25A0.01A0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13966");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 394, 780L, (long) 327);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 327L + "'", long3 == 327L);
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13967");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10A0A10#AA0.001a0.25a0.01a0.1--1.0a10.0a52.0a", (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13968");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 473, 0.0f, (float) 177L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13969");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0000A.000..000A.00A11A00.A000..0000000a.000..000a.00a11a00.a000..000.a00000000A.000..000A.00A11A00.A000..000.A521040410A1040410-1040410521040410-1040410521040410-104041052");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0000A.000..000A.00A11A00.A000..0000000a.000..000a.00a11a00.a000..000.a00000000A.000..000A.00A11A00.A000..000.A521040410A1040410-1040410521040410-1040410521040410-104041052\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13970");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444400100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13971");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".414--414.404a4014.404a4254.404a40014.41004#404                                                ...#", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13972");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-a10.100100.0010.250.010.1-1a10.100100.0010.250.010.1-.a10.100100.0010.250.010.1-0410a10.100100.0010.250.010.1-.a10.100100.0010.250.010.1-0452a10.                                                                                                                                                                                                                                                                             -1.0 10.0 52.0 100.0a0.25a0.01a0.1-                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13973");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, 403, 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13974");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (long) 1055);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1055L + "'", long2 == 1055L);
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13975");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(190, 1952, 840);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1952 + "'", int3 == 1952);
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13976");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1040410" + "'", str14, "1040410");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 0 10" + "'", str18, "10 0 10");
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13977");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("  4     #", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13978");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 403, 954);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 403");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str12, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13979");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...a52.0a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13980");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13981");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13982");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("40.1--1.0.A1.1-A1.--1040410104041010#-1#1#1#-1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"40.1--1.0.A1.1-A1.--1040410104041010#-1#1#1#-1#100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13984");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 100, (-1));
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 993, 1);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a1a0a-1a10" + "'", str11, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100#1#0#-1#10" + "'", str23, "100#1#0#-1#10");
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13985");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4017, (int) (short) -1, 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13986");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 109, (int) (byte) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 4219, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 0, 0);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13987");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 565, 109);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13988");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaa ...0.1--1.010.052.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13989");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410a0a10                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                .a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0104-141414-14100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13990");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2657, 4017, 4052);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2657 + "'", int3 == 2657);
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13991");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 2657, 2500);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10041404-1410" + "'", str13, "10041404-1410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a1a0a-1a10" + "'", str15, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a11a320.001a0.25a0.01a0.1441.0a10.0a52.0a100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a11a320.001a0.25a0.01a0.1441.0a10.0a52.0a100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13993");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger3 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger5 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger7 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger9 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger11 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger[] bigIntegerArray12 = new java.math.BigInteger[] { bigInteger1, bigInteger3, bigInteger5, bigInteger7, bigInteger9, bigInteger11 };
        java.math.BigInteger bigInteger14 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger16 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger18 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger20 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger22 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger24 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger[] bigIntegerArray25 = new java.math.BigInteger[] { bigInteger14, bigInteger16, bigInteger18, bigInteger20, bigInteger22, bigInteger24 };
        java.math.BigInteger bigInteger27 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger29 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger31 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger33 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger35 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger37 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger[] bigIntegerArray38 = new java.math.BigInteger[] { bigInteger27, bigInteger29, bigInteger31, bigInteger33, bigInteger35, bigInteger37 };
        java.math.BigInteger bigInteger40 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger42 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger44 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger46 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger48 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger50 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.math.BigInteger[] bigIntegerArray51 = new java.math.BigInteger[] { bigInteger40, bigInteger42, bigInteger44, bigInteger46, bigInteger48, bigInteger50 };
        java.math.BigInteger[][] bigIntegerArray52 = new java.math.BigInteger[][] { bigIntegerArray12, bigIntegerArray25, bigIntegerArray38, bigIntegerArray51 };
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray52);
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger11);
        org.junit.Assert.assertNotNull(bigIntegerArray12);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger22);
        org.junit.Assert.assertNotNull(bigInteger24);
        org.junit.Assert.assertNotNull(bigIntegerArray25);
        org.junit.Assert.assertNotNull(bigInteger27);
        org.junit.Assert.assertNotNull(bigInteger29);
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertNotNull(bigInteger35);
        org.junit.Assert.assertNotNull(bigInteger37);
        org.junit.Assert.assertNotNull(bigIntegerArray38);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(bigInteger44);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger48);
        org.junit.Assert.assertNotNull(bigInteger50);
        org.junit.Assert.assertNotNull(bigIntegerArray51);
        org.junit.Assert.assertNotNull(bigIntegerArray52);
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13994");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 998.0f, (double) 4360L, (double) 85L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 85.0d + "'", double3 == 85.0d);
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13995");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(104041, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13996");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(472, 3996, 4219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 472 + "'", int3 == 472);
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13997");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0A10.0A52.0A1-1.0A10.0A52.0A1                                                                    ", (double) 104041);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104041.0d + "'", double2 == 104041.0d);
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13998");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3240L, (double) 100.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test13999");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(555, 0, 604);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest27.test14000");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0" + "'", str12, "32 0");
    }
}

