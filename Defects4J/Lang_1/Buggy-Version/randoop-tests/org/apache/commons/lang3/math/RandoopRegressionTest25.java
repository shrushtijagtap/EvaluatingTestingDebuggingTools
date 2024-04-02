package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12501");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12502");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1", (long) 450);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 450L + "'", long2 == 450L);
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12503");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a0.25a0.01a0.1--1.0...0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a0.25a0.01a0.1--1.0...0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12504");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0a0.25a0.01a0.1--1.0...                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0a0.25a0.01a0.1--1.0...                                                                    \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12505");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(85L, (long) 21, (long) 488);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 488L + "'", long3 == 488L);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12506");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10#0#1010a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a", (long) 1665);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1665L + "'", long2 == 1665L);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12507");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (-1), 3637);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str8, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0410.0452.04100.0" + "'", str10, "-1.0410.0452.04100.0");
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12508");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0, (float) (short) 0, (float) 104041);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12509");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0A10.0A0.01A0.1--1.0A10.0A52.0A", (long) 1422);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1422L + "'", long2 == 1422L);
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12510");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12511");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                     ", 233);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 233 + "'", int2 == 233);
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12512");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0a10.0a52.0a100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a100.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12513");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "#####################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #####################################################################################################################");
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12514");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 10.0" + "'", str12, "0.0 10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12515");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                          1a0.25a0.01a0.1-1a0.25a0.01a0.1-                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12516");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A521040410A1040410-1040410521040410-1040410521040410-104041052                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A521040410A1040410-1040410521040410-1040410521040410-104041052\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12518");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A10...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12519");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1#####################################################10.0 0.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12520");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0410.0452.04100.0" + "'", str10, "-1.0410.0452.04100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0410.0452.04100.0" + "'", str12, "-1.0410.0452.04100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str14, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12521");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 565L, 488.0d, (double) 4360);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4360.0d + "'", double3 == 4360.0d);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12522");
        double[] doubleArray6 = new double[] { 1.0f, 'a', ' ', 100.0f, 0L, 1 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0, 32.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a97.0a32.0a100.0a0.0a1.0" + "'", str9, "1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0#97.0#32.0#100.0#0.0#1.0" + "'", str11, "1.0#97.0#32.0#100.0#0.0#1.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12523");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0#100.0#0.00.0#100.0#0.00.0#100.0#0.00.0#...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12525");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...a52.0a...A52.0A1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12526");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12527");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1-100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12528");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12529");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.Class<?> wildcardClass14 = floatArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12530");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a-1a10a1" + "'", str7, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1a-1a10a1" + "'", str10, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12531");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12532");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                            1-4014040", 3240L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3240L + "'", long2 == 3240L);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12533");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.01-1.010.052.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12534");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12535");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1055, 1329, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1329 + "'", int3 == 1329);
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12537");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                   ...A52.0A1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1A0.25A0.01A0.1--1.0...                                                                            ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12538");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0404104-1                                                                            #0#10#0#1.1A0.25A0.01A0.1--110#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12539");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 1.100101E7d, (double) 559L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.100101E7d + "'", double3 == 1.100101E7d);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12540");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12541");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 165L, (double) 840.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12542");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12543");
        double[] doubleArray5 = new double[] { 10.0d, 559, 1040410, 574, 559.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 574, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 559.0, 1040410.0, 574.0, 559.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10.0 559.0 1040410.0 574.0 559.0" + "'", str7, "10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1040410.0d + "'", double8 == 1040410.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12544");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12545");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) '4', (int) (short) 1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12546");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12547");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4-4--4--1a.a1a-aAa1a.a--a1040410######################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12548");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0...0.1--1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12549");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                               # 4                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1 01 1- ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 01 1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12551");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12552");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12553");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a0a10...a52.0a1", (float) 958);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 958.0f + "'", float2 == 958.0f);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12554");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a0.001a0.0-1.0a10.0a52.0a100.001a0a01");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12555");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                ...#404#41004.40014a404.4254a404.4014a404.414--414.4", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12556");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 -1 10 1" + "'", str7, "1 -1 10 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14-141041" + "'", str11, "14-141041");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12557");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0...a52.0a...A52.0A1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12558");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.1--1.0...a0.01a0.25a#0#100.001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12559");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0#100.0#0.010#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12560");
        int[] intArray6 = new int[] { ' ', 958, 558, 559, 'a', 574 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 958, 558, 559, 97, 574]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 958 + "'", int7 == 958);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12561");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-10.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0a10.0a52.0a", 165.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 165.0d + "'", double2 == 165.0d);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12562");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...100a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...520a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...1000a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...-0a0a10...a52.0a1a0.25a...10a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...100a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...520a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...10a0a10...a52.0a1a0.25a...-0a0a10...a52.0a1a0.25a...10a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...100a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...520a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...11000a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...520a0a10...a52.0a1a0.25a....0a0a10...a52.0a1a0.25a...00a0a10...a52.0a1a0.25a...a0a0a10...a52.0a1a0.25a...100a0a10...a52.0a1a0.25a....");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12563");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("041404-1410");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12564");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12565");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            0a0a10...a52.0a1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12566");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12567");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12568");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("A0.25A0.01A0.1-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12569");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "04-1" + "'", str7, "04-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12570");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410010#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410010#                                                                                                                                                                                                                                    0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-          0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-a52.0a1-1.0a10.0a52.0a       0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                410010#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410010#                                                                                                                                                                                                                             ", (double) 4052);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4052.0d + "'", double2 == 4052.0d);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12571");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4     #", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12572");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4     #0", (double) 840L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 840.0d + "'", double2 == 840.0d);
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.001A0.25A0.01A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".001A0.25A0.01A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0#10.0#52.0#100.010414-1404-110411001411001010041100100104110010100411001411001010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#10.0#52.0#100.010414-1404-110411001411001010041100100104110010100411001411001010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12575");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("110a0a1010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12576");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.25a0.01a0.1-1a0.25a-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#a52.0a10.0a...0.1--1.0-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12577");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, 559, 4017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12578");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(478, 62, 104041);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12579");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#0#10" + "'", str16, "10#0#10");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10#0#10" + "'", str19, "10#0#10");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12580");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...-a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a...", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12581");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1329, (double) 1422.0f, 4096.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1329.0d + "'", double3 == 1329.0d);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12582");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ...", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12583");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, (double) (byte) 0, (double) 565);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12584");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "                                                                            1-4014040");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                             1-4014040");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12585");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10#0#101.11-A1.25A1.1-A1.--0.001a0.25a0.01a0.1441.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10#0#101.11-A1.25A1.1-A1.--0.001a0.25a0.01a0.1441.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.0A52.0A.001A0.25A0.01A0.1--1.0A10.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12586");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a0a0a10a-10.0A0.001A0.0", 4017);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4017 + "'", int2 == 4017);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12587");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 657, 558);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str14, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12588");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12589");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12590");
        double[] doubleArray5 = new double[] { 10.0d, 559, 1040410, 574, 559.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 574, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 0, 189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 559.0, 1040410.0, 574.0, 559.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10.0 559.0 1040410.0 574.0 559.0" + "'", str7, "10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1040410.0d + "'", double8 == 1040410.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12591");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 478, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12592");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 954, (long) '#', (long) 3240);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12593");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10a0a10#aa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12594");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#-1#1#1#-1#10", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12595");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("##############################################################-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12596");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            0A0A10...A52.0A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12597");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1501, (long) 823, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1501L + "'", long3 == 1501L);
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12598");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-141" + "'", str7, "-141");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12599");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 1755, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1755 + "'", int3 == 1755);
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12600");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 1, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 104041, 100);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 0, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-141" + "'", str20, "-141");
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12601");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12602");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444444444444444444444444444444444444444444444444444444444444444444444444444     -1 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444444444444444444444444444444444444444444444444444444444444444444444444444     -1 32\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12603");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(840, 958, 993);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 993 + "'", int3 == 993);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12604");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(4096.0d, 0.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12605");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) (byte) 1, (double) 116);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 116.0d + "'", double3 == 116.0d);
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12606");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a0.001a0.0-1.0a10.0a52.0a100.001a0a01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12607");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 478, 1329.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12608");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 109, 450);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 450 + "'", int3 == 450);
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12609");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 85, 10);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 0, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12610");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 4732, (float) 1040410L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1040410.0f + "'", float3 == 1040410.0f);
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12611");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1501, (double) 4096.0f, (double) 1422L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4096.0d + "'", double3 == 4096.0d);
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12612");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12613");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 604L, (float) 4732L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4732.0f + "'", float3 == 4732.0f);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12614");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) 1, (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "A0.25A0.01A0.1--1.0...0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: A0.25A0.01A0.1--1.0...0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00.001a0.25a0.01a0.1--1.0a10.0a52.0a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12615");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a1" + "'", str7, "-1a1");
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12616");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12617");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--ahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A1.1-A1.--1040410-1.0 10.0 52.0 100.0-1.0 10.0 52.0 A10.10a0a100.001a0.25a0.01a0.1-1.0 10.0 52.0 100.0-1.0 10.0 52.0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1.1-A1.--1040410-1.0 10.0 52.0 100.0-1.0 10.0 52.0 A10.10a0a100.001a0.25a0.01a0.1-1.0 10.0 52.0 100.0-1.0 10.0 52.0 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12619");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray1, ".0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12620");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10a0a10#44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12621");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 4096, (double) 840, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4096.0d + "'", double3 == 4096.0d);
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12622");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#32" + "'", str11, "-1#32");
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12623");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12624");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#0#100.001a0.25a0.01a0.1--1.0...", (float) 724);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 724.0f + "'", float2 == 724.0f);
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12625");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-0.0f), 100.0d, (double) 233);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 233.0d + "'", double3 == 233.0d);
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12626");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12627");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0000a.000..000a.00a##a00.a000..000.a0000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0000a.000..000a.00a##a00.a000..000.a0000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12628");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.32 0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12629");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 1.0f, (double) 1422.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12630");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12631");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12632");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.Class<?> wildcardClass11 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str10, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12633");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 100, (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 942, 998);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 942");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 1 0 -1 10" + "'", str18, "100 1 0 -1 10");
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12634");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0a0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10.... 10.0 a0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12635");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1314, (long) 85, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1314L + "'", long3 == 1314L);
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12636");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 526, 165);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12637");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0041404-1410");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12638");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(109.0d, (double) 233, (double) 4732.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 109.0d + "'", double3 == 109.0d);
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12639");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("132a0", (double) 4089.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4089.0d + "'", double2 == 4089.0d);
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0A.25A..0A.0000.A0..A52.A0...0.001a0A1.1-A1.--1040410A10.00 10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12641");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" a4a a a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a4a a a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12642");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A-0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12643");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) -1, 812);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12644");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10.0 0.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12645");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + Float.POSITIVE_INFINITY + "'", float1 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12646");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12647");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 547, 1055);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 547");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#0#10" + "'", str16, "10#0#10");
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12648");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (short) 100, 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) ' ', 942);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12649");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0                                                                                -1.0a10.0a52.0a100.0a10.0", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12650");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(233, 85, 574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 85 + "'", int3 == 85);
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12651");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1055, (long) 942, (long) 574);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 574L + "'", long3 == 574L);
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12652");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 1040410, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) (short) 1, 0);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, (-1));
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100 1 0 -1 10" + "'", str30, "100 1 0 -1 10");
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12653");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12654");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0000A.000..000A.00A##A00.A000..000.A0000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12655");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                -1.0a10.0a52.0a100.0a10.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12656");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12657");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1 1.0a97.0a32.0a100.0a0.0a1.0# 0 # 100 . 001 A 0 . 25 A 0 . 01 A 0 . 1 -- 1 . 0 A 10 . 0 A 52 . 0 A 100 . 010 # 0 # 10# 0 # 100 . 001 A 0 . 25 A 0 . 01 A 0 . 1 -- 1 . 0 A 10 . 0 A 52 . 0 A 100 . 010 # 0 # 10# 0 # 100 . 001 A 0 . 25 A 0 . 01 A 0 . 1 -- 1 . 0 A 10 . 0 A 52 . 0 A 100 . 010 # 0 # 10# 0 # 100 . 001 A 0 . 25 A 0 . 01 A 0 . 1 -- 1 . 0 A 10 . 0 A 52 . 0 A 100 . 010 # 0 # 10# 0 # 100 . 001 A 0 . 25 A 0 . 01 A 0 . 1 -- 1 . 0 A 10 . 0 A 52 . 0 A 100 . 010 # 0 # 10# 0 # 100 . 001 A 0 . 25 A 0 . 01 A 0 . 1 -- 1 . 0 A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12658");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("41004.40014a404.4254a404.4014a404.414--414.4...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"41004.40014a404.4254a404.4014a404.414--414.4...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12659");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                               # 4                                                                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12660");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', (int) (short) 100, (int) (short) 0);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12661");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 100, (double) (byte) 1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12662");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 1980, 3996);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12663");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-0000a.000..000a.00a11a00.a000..000.a0000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12664");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1422L, 476.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1422.0d + "'", double3 == 1422.0d);
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12665");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12666");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', (int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "            -.---A-.25A-.--A-.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:             -.---A-.25A-.--A-.");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12667");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(" 444 4 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 444 4 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12668");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 488, 62.0f, (float) 993);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 993.0f + "'", float3 == 993.0f);
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12669");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("25a0.01a0.1--1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12670");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 488, 1952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 488");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0#10.0" + "'", str11, "0.0#10.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12671");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 116, (float) 100, (-0.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-0.0f) + "'", float3 == (-0.0f));
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12672");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12673");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1a10a-1a144444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a10a-1a144444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12674");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A1.1-A1.--#0#A1.1-A1.--#100#.#001#A#0#.#25#A#0#.#01#A#0#.#1#--#1#.#0#A#10#.#0#A#52#.#0#A#100#.#010#A1.1-A1.--#0#A1.1-A1.--#1", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12675");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 85, (int) '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12676");
        long[] longArray5 = new long[] { 10L, 1, (-1), 0, (-1L) };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 0, (int) (short) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray5, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 559, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', 547, 3240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 547");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 1, -1, 0, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10414-1404-1" + "'", str12, "10414-1404-1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12677");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################### 0.0a100.0a0.0                                    #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12678");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str8, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0410.0452.04100.0" + "'", str10, "-1.0410.0452.04100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12679");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1a10a-1a144444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.", 840.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 840.0f + "'", float2 == 840.0f);
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12680");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', 0, 4096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12681");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.210#0#10a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12682");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA1-1.010.052.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12683");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12684");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4     #", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12685");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0404104-", 14100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14100.0f + "'", float2 == 14100.0f);
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12686");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1-.---A-.25A-.--A-.--", 526.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 526.0f + "'", float2 == 526.0f);
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12687");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) -1, 544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12688");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 958L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 958L + "'", long2 == 958L);
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12689");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12690");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0a10.0a52.0", (float) 812);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 812.0f + "'", float2 == 812.0f);
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12691");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A1.1-A1.--");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1.1-A1.--\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12692");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1L, 488L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12693");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 488.0f, (float) 450L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12694");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1a1-a01a152 526 4089");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12695");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".001a0.25a0.01a0.1--1.0a10.0a52.0a100.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12696");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 574, (long) 4096, (long) 473);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4096L + "'", long3 == 4096L);
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12697");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1040410L, (double) 1980L, 3637.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1040410.0d + "'", double3 == 1040410.0d);
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12698");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04100.040.0" + "'", str8, "0.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0 100.0 0.0" + "'", str10, "0.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12699");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(".0.1--1.0a", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12700");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray13, 'a', 0, 190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12701");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1040410" + "'", str16, "1040410");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a0a10" + "'", str18, "10a0a10");
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12702");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12703");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 544, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12704");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) (byte) 100, (int) (byte) 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 1, (int) (short) 1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 3637, 21);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#0#10" + "'", str9, "10#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10 0 10" + "'", str21, "10 0 10");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10 0 10" + "'", str23, "10 0 10");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12705");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                             -1.0 10.0 52.0 100.0A0.25A0.01A0.1-                                                                                                                                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 10.0 52.0 100.0A0.25A0.01A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12706");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 488L, (double) 954.0f, (double) 38);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.0d + "'", double3 == 38.0d);
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12707");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12708");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (short) 1, (int) (byte) 1);
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str15, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12709");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3637, 1755, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12710");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0#97.0#32.0#100.0#0.0#1.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12711");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 4360, 4089);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0 10.0" + "'", str16, "0.0 10.0");
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12712");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(478.0f, (float) 109, (float) 1501L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 109.0f + "'", float3 == 109.0f);
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12713");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#-1 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12714");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) 10, 0);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12715");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(488, 1980, 657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1980 + "'", int3 == 1980);
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12716");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 4089.0f, (double) 62L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4089.0d + "'", double3 == 4089.0d);
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12717");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12718");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 473, (double) (short) 0, (double) 14100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 14100.0d + "'", double3 == 14100.0d);
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12719");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("            -.---A-.25A-.--A-.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"            -.---A-.25A-.--A-.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12720");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 657, 4510);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 657");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12721");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12722");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA10.100100.0010.250.010.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4114);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4114 + "'", int2 == 4114);
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12723");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12724");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.0a100.0a0.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0.0a100.0a0.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12725");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) 'a', 104041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0a0a10a-1" + "'", str7, "0a0a10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12726");
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
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[]) wildcardClassArray13);
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
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12727");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12728");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1040410" + "'", str14, "1040410");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12729");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12730");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12731");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A0.25A0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A0.25A0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12732");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12733");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12734");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A521040410A1040410-1040410521040410-1040410521040410-104041052                                                                                                                                                                                                                                                                                                                                                                                                                                ", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("AAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12736");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12737");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12738");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12739");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 544, (float) 604, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 604.0f + "'", float3 == 604.0f);
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12740");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10.0 559.0 1040410.0 574.0 559", (long) 954);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 954L + "'", long2 == 954L);
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10a0a10...a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a0a10...a52.0a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12742");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 62, 3996);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 62");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12743");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12744");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA1-1.010.052.0 0.0a100.0a0.0                                    ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12745");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 993, (double) 526.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 993.0d + "'", double3 == 993.0d);
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12746");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 0, 473);
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
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12747");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("...0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A10...", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12748");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(526, 394, 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 394 + "'", int3 == 394);
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12749");
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
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 0, 189);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a0.0" + "'", str12, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0#100.0#0.0" + "'", str14, "0.0#100.0#0.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12750");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" 0 10 0...30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12751");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("       0.001a0.25a0.01a0.1-        ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12752");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 4732, (long) 478, (long) 724);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 478L + "'", long3 == 478L);
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12753");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a444a4a4h44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a444a4a4h44\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12754");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 488, 559);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 488");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str8, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0410.0452.04100.0" + "'", str10, "-1.0410.0452.04100.0");
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12755");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 840, 62.0f, (float) 525);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 62.0f + "'", float3 == 62.0f);
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12756");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.11-A1.25A1.1-A1.-4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.044444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12757");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '4', (float) 294, (float) 565);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12758");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 3373, 451);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12759");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 100, (-1));
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 604, 559);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10041404-1410" + "'", str23, "10041404-1410");
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12760");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) (byte) 10, 190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a0a10" + "'", str13, "10a0a10");
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12761");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) 'a', (int) '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 840, 0);
        java.lang.Class<?> wildcardClass15 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12762");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 0, 1501);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12763");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12764");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                -1.0a10.0a52.0a100.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12765");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str13, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12766");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                         00                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 1422.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1422.0d + "'", double2 == 1422.0d);
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12767");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12768");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 488, (int) (byte) 10);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 1055, 3373);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1055");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0 10.0" + "'", str7, "0.0 10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12769");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12770");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 109);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 109L + "'", long2 == 109L);
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12771");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(233, 4114, 4096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4114 + "'", int3 == 4114);
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12772");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', (float) (short) 10, (float) 4732L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12773");
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
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
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
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12774");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 0, 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 780, 38);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 702, 10);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12775");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12776");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(233, (-1), 4089);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4089 + "'", int3 == 4089);
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12777");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(954.0f, 104041.0f, 3240.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 104041.0f + "'", float3 == 104041.0f);
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12778");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1-1.0a10.0a52.0a1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12779");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(823, 294, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 823 + "'", int3 == 823);
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12780");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (short) 10, 958.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 958.0f + "'", float3 == 958.0f);
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12781");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                  .001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12782");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (int) (short) 1, 104041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str9, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12783");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4017.0f, (double) 118, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12784");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("52.0#100.0", (double) 4732.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4732.0d + "'", double2 == 4732.0d);
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12785");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.010.052.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12786");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 4510L, 1040410.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12787");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.0a                                                                4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12788");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) (byte) 10, 394);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12789");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1980, (long) (byte) -1, (long) 657);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1980L + "'", long3 == 1980L);
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12790");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10....                                                                                                                                                                  10.0 0.0a0a10.....a0a10.....a0a10.....a0a10.....a0a10...a0a10.....a0a10.....a0a10.....a0a10.....a0a10....                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12791");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 565, (double) (-1), (double) 657);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12792");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (byte) 10, (int) (short) 10);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 780, 3996);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 780");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12793");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a0.25A0.01A0.1--1.0...10#-1#1#1#-1#10-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12794");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(14100.0d, (double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12795");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10.0 559.0 1040410.0 574.0 559.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12796");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 3919, (long) '4', 109L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3919L + "'", long3 == 3919L);
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12797");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.0a1a132 0", 1665);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1665 + "'", int2 == 1665);
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12798");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 0, 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 780, 38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 177, 657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 177");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12799");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...0#0#...", 558L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 558L + "'", long2 == 558L);
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12800");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12801");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, (long) 823, (long) 1314);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1314L + "'", long3 == 1314L);
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12802");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10 -1 0 1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 -1 0 1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12803");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(559, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12804");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                       #404#4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12805");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("...-a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a...", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12806");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...A0.25A0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12807");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '4', (float) 3240L, (float) 21);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 21.0f + "'", float3 == 21.0f);
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12808");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10041404-1410" + "'", str13, "10041404-1410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100#1#0#-1#10" + "'", str15, "100#1#0#-1#10");
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0#10.0#52.0#100.010414-1404-110411001411001010041100100104110010100411001411001010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#10.0#52.0#100.010414-1404-110411001411001010041100100104110010100411001411001010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12810");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12811");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12812");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 450, (float) 450L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 450.0f + "'", float3 == 450.0f);
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12813");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.250.010.1--1.0...                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12814");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str15, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str17, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12815");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 1, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 823, 189);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 559, 116);
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
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12816");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A-.25A-.--A-.--");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12817");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a10.10A0A100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.0a                                                                ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12818");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 100, (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                                                                                                                                                                                                                                                                   0.0A10.0                                                                                                                                                                                                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                                                                                                                                                                    0.0A10.0                                                                                                                                                                                                                                                                                    ");
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
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12819");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0 10.0 52.0 100.0-A10.", 565);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 565 + "'", int2 == 565);
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12820");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 559, (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0a10.0" + "'", str6, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12821");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-10.1--1.0...A0.01A0.25A#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-A52.0A1-1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12822");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12823");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a0a10a-13240", 4017.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4017.0f + "'", float2 == 4017.0f);
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12824");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 118, (double) 4096L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4096.0d + "'", double3 == 4096.0d);
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12825");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0404104-1                                                                            #0#10#0#100.001A0.25A0.01A0.1--11-11010a0a10...a52.0a1", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12826");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 780, 146);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 3996, 146);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a-1a10a1" + "'", str7, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1#-1#10#1" + "'", str10, "1#-1#10#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12827");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 604L, (float) 0L, (float) 116);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12828");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1055, 2500, 478);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 478 + "'", int3 == 478);
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12829");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAA#AA#A#A#AA#AAA4A4AAAA4A4AAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAA#AA#A#A#AA#AAA4A4AAAA4A4AAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12830");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (-1), 724);
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
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12831");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 233, (long) 10, (long) 526);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 526L + "'", long3 == 526L);
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12832");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12833");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#10", (long) 780);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 780L + "'", long2 == 780L);
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12834");
        double[] doubleArray6 = new double[] { 1.0f, 'a', ' ', 100.0f, 0L, 1 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', (int) '#', 958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0, 32.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a97.0a32.0a100.0a0.0a1.0" + "'", str9, "1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0#97.0#32.0#100.0#0.0#1.0" + "'", str12, "1.0#97.0#32.0#100.0#0.0#1.0");
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12835");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                             0a0a10...a52.0a1a0.25a...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12836");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(559, 840, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12837");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 404.0f, 0.0d, (double) 473);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12838");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 1, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12839");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12840");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3240" + "'", str8, "3240");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32 0" + "'", str11, "32 0");
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12841");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444#40444404444044444044440444404444444440444404444044444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444#4044\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12842");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 -1 10 1" + "'", str8, "1 -1 10 1");
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12843");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', (long) 942, 165L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 942L + "'", long3 == 942L);
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12844");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              00#1#0#-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12845");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 104041.0f, 4089.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 104041.0f + "'", float3 == 104041.0f);
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12846");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 85, (int) '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a0a10" + "'", str15, "10a0a10");
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12847");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                   0.0A10.0                                                                                                                                                                                                                                                                                    ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12848");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a10.0a52.0a1-1.0a10.0a52.0a10.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12849");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12850");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 146, 0.0f, (float) 702);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 702.0f + "'", float3 == 702.0f);
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12851");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12852");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) (byte) 100, (int) (byte) 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) (byte) 1, 189);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#0#10" + "'", str9, "10#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12853");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                         1010#-1#1#1#-1#1004041010404A1.1-A1.--1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12854");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(559, 4089, 656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4089 + "'", int3 == 4089);
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12855");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0                                                                                -1.0A10.0A52.0A100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12856");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0...A52.0A110#0#100.001#0.25#0...10#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12857");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a0a10" + "'", str13, "10a0a10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12858");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("A1.1-A1.--404A1.1-A1.--41004.40014A404.4254A404.4014A404.414--414.404A4104.404A4524.404A41004.40104A1.1-A1.--404A1.1-A1.--410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1.1-A1.--404A1.1-A1.--41004.40014A404.4254A404.4014A404.414--414.404A4104.404A4524.404A41004.40104A1.1-A1.--404A1.1-A1.--410\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12859");
        double[] doubleArray5 = new double[] { 10.0d, 559, 1040410, 574, 559.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 478, (int) (short) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 559.0, 1040410.0, 574.0, 559.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10.0 559.0 1040410.0 574.0 559.0" + "'", str7, "10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1040410.0d + "'", double8 == 1040410.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0#559.0#1040410.0#574.0#559.0" + "'", str14, "10.0#559.0#1040410.0#574.0#559.0");
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12860");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12861");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 840, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "a10.10A0A100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.0a                                                                ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a10.10A0A100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.0a                                                                ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12863");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#10.0#52.0#100.010414-1404-11041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12864");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 4052.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4052.0d + "'", double2 == 4052.0d);
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12865");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12866");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0404104-1                                                                            #0#10#0#1.1A0.25A0.01A0.1--1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12867");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                               0.250.010.1--1.0...                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12868");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, (long) (byte) 100, (long) 547);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12869");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(958.0d, (double) 100, 3637.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3637.0d + "'", double3 == 3637.0d);
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12870");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 165, (int) (byte) 100);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str18, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12871");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '4', (long) 526, (long) 526);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12872");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12873");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.00#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.00#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.10#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12874");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 476, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12876");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 702, 478L, (long) 146);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 146L + "'", long3 == 146L);
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12877");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                -1.0A10.0A52.0A100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12878");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 4096, 0);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.04100.040.0" + "'", str10, "0.04100.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12879");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("    # 0 # 100 . 001 A 0 . 25 A 0 . 01 A 0 . 1 -- 1 . 0 A 10 . 0 A 52 . 0 A 100 . 010 # 0 # 10   ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12880");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 702, 4089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 702");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12881");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 574, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str14, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12882");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-.---A-.25A-.--A-.--                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12883");
        long[] longArray6 = new long[] { 1, (short) 1, 62L, (byte) 0, 62L, 10L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 1040410, 1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.Class<?> wildcardClass13 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 1, 62, 0, 62, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 62L + "'", long12 == 62L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12884");
        long[] longArray2 = new long[] { 109, 100L };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[109, 100]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "109#100" + "'", str5, "109#100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 109L + "'", long6 == 109L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1094100" + "'", str8, "1094100");
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12885");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 0, 1952);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1952 + "'", int3 == 1952);
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12886");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12887");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12888");
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
        short short26 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
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
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12890");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12891");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12892");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12893");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 100, (int) (short) 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 4089, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12894");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a444a4a4h44", 146);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 146 + "'", int2 == 146);
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12895");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("41a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-10#0#10100444444444444444444.A.25A.A.--.A.A52.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"41a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-10#0#10100444444444444444444.A.25A.A.--.A.A52.A.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12896");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "#################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #################################################################################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12897");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                A0.25A0.01A0.1--1.0A10.0A", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12898");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (float) 38);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12899");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1 1.0a97.0a32.0a100.0a0.0a1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12900");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a0.25a...1a10a-1a144444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12901");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0404104-1" + "'", str7, "0404104-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12902");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12903");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("##############################################################-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12904");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("            -.---A-.25A-.--A-.--");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12905");
        double[] doubleArray6 = new double[] { 1.0f, 'a', ' ', 100.0f, 0L, 1 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 998, 840);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0, 32.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a97.0a32.0a100.0a0.0a1.0" + "'", str9, "1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12906");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', 812, 4089);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4089 + "'", int3 == 4089);
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12907");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12908");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 942L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12909");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '#', (float) 558L, 993.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12910");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12911");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("104-141414-14");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12912");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 954, 1422L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1422L + "'", long3 == 1422L);
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12913");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...a52.0a1...a52.0a1...a52.0a1...a", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12914");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-141" + "'", str7, "-141");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1" + "'", str9, "-1a1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12915");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 525, (double) 1314, (double) 525);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 525.0d + "'", double3 == 525.0d);
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12916");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10a0a10#4410.001A0.25");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12917");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(724.0f, 526.0f, (float) 1055);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1055.0f + "'", float3 == 1055.0f);
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12918");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001A0.25A0.01A0.1--1.0A10.0A52.0A#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12919");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("     -1 32-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001 0                                                                                                                                                                                                                                                                                                                                                                   ", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12920");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12921");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12922");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.0.25.0.00.0.0-0.0.25.0.00.0.0-0.000.0.25.0.00.0.0-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0.25.0.00.0.0-0.0.25.0.00.0.0-0.000.0.25.0.00.0.0-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12923");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001411001010041100100104110010100411001411001010041100111041100141100101004110010010411001010041100141100101004110011104110014110010100411001001041100101004110014110010100411001110411001-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12924");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 116, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12925");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12926");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12927");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12928");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 488, (float) 473, 4114.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 473.0f + "'", float3 == 473.0f);
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12929");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     104-141414-14100                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12930");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10, 0.0d, (double) 404.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 404.0d + "'", double3 == 404.0d);
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12931");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1-.---a-.25a-.--a-.--");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12932");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12933");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 942, (double) 10, 4089.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12934");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 993, 604);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12935");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) (short) 0, (int) (byte) 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "#0#10#0#100.001A0.25A0.01A0.1--1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #0#10#0#100.001A0.25A0.01A0.1--1");
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
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0a10.0a52.0a1-1.0a10.0a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a1-1.0a10.0a52.0a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12938");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#0#10" + "'", str17, "10#0#10");
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12939");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0444444444444444444444444444444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.04444444444444444                                                                                -1.0410.0452.04100.04444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0444444444444444444444444444444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.04444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12940");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a0a10...a52.0a1##############################################################-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12941");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12942");
        long[] longArray5 = new long[] { 10L, 1, (-1), 0, (-1L) };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray5, '4');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 1, -1, 0, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10414-1404-1" + "'", str8, "10414-1404-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12943");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001a0.25a0.01a0.1--1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12944");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 2500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2500 + "'", int2 == 2500);
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12945");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 1, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 104041, 100);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-141" + "'", str20, "-141");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1#1" + "'", str23, "-1#1");
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12946");
        int[] intArray2 = new int[] { (short) -1, ' ' };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), (-1));
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a32" + "'", str4, "-1a32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1432" + "'", str11, "-1432");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 32" + "'", str13, "-1 32");
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12947");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.04100.040.", 476);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 476 + "'", int2 == 476);
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12948");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12949");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12950");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12951");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aa1a.a--a10401a10a-1a1.a--a1040410#", 190);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 190 + "'", int2 == 190);
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12952");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A1.1-A1.--1040410A10.0###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12953");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1#32####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################-1.0A10.0A52.0A100.0", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12954");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(702.0f, (float) 4114, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12955");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a0.25a0.01a0.1--1.0...                                                            ...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12956");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("       0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-          0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-a52.0a1-1.0a10.0a52.0a       0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-               0.001a0.25a0.01a0.1-           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12957");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0.25.0.00.0.0-0.0.25.0.00.0.0-0.000.0.25.0.00.0.0-", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12958");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12959");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".414--414.404a4014.404a4254.404a40014.41004#404                                                ...#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12960");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 526L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 526.0f + "'", float2 == 526.0f);
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12961");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100A1A0A-1A10A-1.0A10.0A52.0A100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12962");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                             -1.010.052.0100.                                                                                                                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12963");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1-.---a-.25a-.--a-.--");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12964");
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
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 0, 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', 544, (int) 'a');
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12965");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("104040891a.a--a104152 526 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12966");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0a0a10a-1" + "'", str7, "0a0a10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12967");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444444444444a4444a4444a44444444444444444444444444444444444444444444444444444a4444a44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12968");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12969");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0 10.0" + "'", str7, "0.0 10.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12970");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a0.25a0.01a0.1--1.0...0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a101A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.25a0.01a0.1--1.0...0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a101A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12971");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10A0A10#AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12972");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 525, 1040410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 525");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, -1, 0, 1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12973");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str14, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12974");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444410#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      ", (long) 568);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 568L + "'", long2 == 568L);
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12975");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 840, 3919);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 840");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1a1" + "'", str14, "-1a1");
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12976");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12977");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 558, (int) (byte) 100);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str20, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12978");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(604.0f, (float) 559, (float) 233);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 233.0f + "'", float3 == 233.0f);
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12979");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                      1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0a.25a..0a.0000.a0..a52.a0...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12980");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4096, 1755, 3996);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4096 + "'", int3 == 4096);
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12981");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(404.0d, 0.0d, (double) 476);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12982");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12983");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) ' ', 1422);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12984");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444440a0a10...a52.0a1a0.25a..");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12985");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str10, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str13, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12986");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12987");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12988");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 656, (int) (short) 10);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.11-a1.25a1.1-a1.--");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.11-a1.25a1.1-a1.--\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12990");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12991");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001A0.25A0.01A0.1-100.0", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12992");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 3637, 189);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12993");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 0, (long) 1501, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12994");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0a10.0" + "'", str6, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12995");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 21, 488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 488 + "'", int3 == 488);
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12996");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1040410, 233, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 85 + "'", int3 == 85);
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12997");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 724, (float) 954, (float) 656);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 954.0f + "'", float3 == 954.0f);
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12998");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a0.25a0.01a0.1-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12999");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa042     ", 4360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4360 + "'", int2 == 4360);
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test13000");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }
}

