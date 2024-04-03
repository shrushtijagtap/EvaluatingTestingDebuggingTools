package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 476, 574);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 476");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(559.0d, (double) 100.0f, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 559.0d + "'", double3 == 559.0d);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 109, (float) 1040410, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10.0 559.0 1040410.0 574.0 559.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(10, 958, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.01 0.00.01 0.00.01 0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a10.01 0.00.01 0.00.01 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-A10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-A10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1L), (float) (short) 10, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0a10.0a52.0a1-1.0a10.0a52.0a1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 1, (float) (short) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, 0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a-1.0", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1", (float) 574);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 574.0f + "'", float2 == 574.0f);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#a4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a0.25a0.01a0.1--1.0...                                                                    ", (float) 559);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 559.0f + "'", float2 == 559.0f);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0#100.0#0.00.0#100.0#0.00.0#100.0#0.00.0#...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#0#100.001a0.25a0.01a0.1--1.0...                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.01 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 574, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) ' ', (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 'a', (double) 10L, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0#100.0#0.00.0#100.0#0.00.0#100.0#0.00.0#...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A1.1-A1.--1040410104041010#-1#1#1#-1#100", 958);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 958 + "'", int2 == 958);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.0 10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0 10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01A0.25A0.01A0.1-1A0.25A0.01A0.1-", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1 -1 10 11001001001001001001001001001001001001001001");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("# 4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A10.100100.0010.250.010.1-", 574);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 574 + "'", int2 == 574);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "#404#41004.40014a404.4254a404.4014a404.414--414.4...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #404#41004.40014a404.4254a404.4014a404.414--414.4...");
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
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A1.1-A1.--404A1.1-A1.--41004.40014a404.4254a404.4014a404.414--414.404a4104.404a4524.404a41004.40104A1.1-A1.--404A1.1-A1.--410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A.5A.1A.1-1A.5A.1A.1-.1A.5A.1A.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A.5A.1A.1-1A.5A.1A.1-.1A.5A.1A.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) 404L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 404.0f + "'", float3 == 404.0f);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0410.0452.04100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, 526L, 62L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 476, (float) 0L, (float) 526);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 526.0f + "'", float3 == 526.0f);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a11a32", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                32a0                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, 574.0f, (float) 62L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1", (double) 958L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 958.0d + "'", double2 == 958.0d);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 10, (-1.0f), (float) 574);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 574.0f + "'", float3 == 574.0f);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) 1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, 10.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) ' ', (float) 958L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 958.0f + "'", float3 == 958.0f);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10a0a100.001a0.25a0.01a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a0a100.001a0.25a0.01a0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                     ", (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62L + "'", long2 == 62L);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A1.1-A1.--404A1.1-A1.--41004.40014A404.4254A404.4014A404.414--414.404A4104.404A4524.404A41004.40104A1.1-A1.--404A1.1-A1.--410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (short) -1, 958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1-1.010.052.0", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#404#41004.40014a404.4254a404.4014a404.414--414.404a4104.404a4524.404a41004.40104#404#410");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 10, 0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, (int) (short) 10, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 0, 100L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(100.0f, (float) 100, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        double[] doubleArray2 = new double[] { (short) 0, (-1.0f) };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 1, 958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.01 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(404L, (long) 958, 526L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 958L + "'", long3 == 958L);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        double[] doubleArray2 = new double[] { (short) 0, (-1.0f) };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (short) 100, 559);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(574, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a11a32", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 62, (float) 85, (float) 404L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 62.0f + "'", float3 == 62.0f);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', 0, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-a52.0a1-1.0a10.0a52.0a", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a10.0", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0#100.0#0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0#100.0#0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0 10.010#-1#1#1#-1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(559, 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (short) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1A0.25A0.01A0.1-1A0.25A0.01A0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', (-1), 958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 958 + "'", int3 == 958);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 0, 526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a0.2502.2500.25022.2", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(574.0f, (float) 526, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 574.0f + "'", float3 == 574.0f);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 62, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("      0.001A0.25A0.01A0.1-      ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("A1.1-A1.--100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a-1.0", 1040410L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1040410L + "'", long2 == 1040410L);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0a0a10a-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 559L, (float) 526L, (float) 958);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 958.0f + "'", float3 == 958.0f);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "  4     #0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:   4     #0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...0#0#...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...0#0#...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 0, (int) (byte) 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1040410.0d, (double) 404L, 1040410.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 404.0d + "'", double3 == 404.0d);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa042");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa042\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1 -1 10 11001001001001001001001001001001001001001001", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 526, (double) (short) 1, (double) 62L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 574, 526);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 574 + "'", int3 == 574);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...A52.0A1", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
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
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 1, 0.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#404#41004.40014a404.4254a404.4014a404.414--414.4..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a1a0a-1a10" + "'", str9, "100a1a0a-1a10");
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a0a10.....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                          1a0.25a0.01a0.1-1a0.25a0.01a0.1-                           ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("52.0#100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(476, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 476 + "'", int3 == 476);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(958, 574, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 840, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 840 + "'", int3 == 840);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 85, (double) 10, 1040410.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1040410.0d + "'", double3 == 1040410.0d);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 0, 574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 574 + "'", int3 == 574);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("A1.1-A1.--404A1.1-A1.--41004.40014A404.4254A404.4014A404.414--414.404A4104.404A4524.404A41004.40104A1.1-A1.--404A1.1-A1.--410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 0, 0.0d, (double) 526.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 526.0d + "'", double3 == 526.0d);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 840);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 840L + "'", long2 == 840L);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 3240L, (float) (-1L), (float) 62L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-a52.0a1-1.0a10.0a52.0a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0 10.0 52.0 100.0A0.25A0.01A0.1-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1, (float) (short) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1-1.010.052.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.010.052.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(574.0f, 0.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 574.0f + "'", float3 == 574.0f);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', 0L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str12, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (short) -1, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1 1", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("3240");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 3240 + "'", number1, 3240);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 10, 10);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (-1), 558);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        long[] longArray5 = new long[] { 10L, 1, (-1), 0, (-1L) };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray5, '4');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 1, -1, 0, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10414-1404-1" + "'", str8, "10414-1404-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 574, (double) 3240L, (double) 62.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3240.0d + "'", double3 == 3240.0d);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10L, (float) '4', (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1.0a10.0a52.0a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 0, 526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#0.01 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', (int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray1, ".a.25a.a.--.a.a52.a.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .a.25a.a.--.a.a52.a.");
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
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a1a0a-1a10" + "'", str11, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 1 0 -1 10" + "'", str15, "100 1 0 -1 10");
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("3240");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3240L + "'", long1 == 3240L);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("52233223232252232223232252233232252252233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233322aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52233223232252232223232252233232252252233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233322aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001a0.25a0.01a0.1-                                                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444  4     #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(100L, (long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" 0.0a100.0a0.0                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0#100.0#0.00.0#100.0#0.00.0#100.0#0.00.0#...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a1hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#0.01 0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) 10, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 0, 1);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a0a10" + "'", str15, "10a0a10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10" + "'", str19, "10");
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#-1#1#1#-1#10", (double) 559.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 559.0d + "'", double2 == 559.0d);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 1, (long) 1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A1.1-A1.--1040410A10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1.1-A1.--1040410A10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#0#100.001A0.25A0.01A0.1--1.0...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1-", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("      0.001A0.25A0.01A0.1-      ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', (int) (short) -1, 85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 526L, (float) 10, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.04100.040.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) ' ', 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 10.0" + "'", str12, "0.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0#10.0" + "'", str14, "0.0#10.0");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 526, 840);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 526");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 404L, (double) 100L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 404.0d + "'", double3 == 404.0d);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', (int) (byte) -1, 85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (short) 100, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1#32");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10a0a10...a52.0a1", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A1.1-A1.--1040410104041010#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(".a.25a.a.--.a.a52.a.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.001a0.25a0.01a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0.001a0.25a0.01a0.1- is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("11001010...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) 10, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', (int) (short) 10, 840);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(526L, 1L, (long) 526);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 526L + "'", long3 == 526L);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001A0.25A0.01A0.1--1.0A10.0A52.0A#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10a0a100.001a0.25a0.01a0.1-0.0a100.0a0.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.04444444444444444444444444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 85, 0.0f, (float) 4096);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4096.0f + "'", float3 == 4096.0f);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4096, 574.0f, (float) 404L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 404.0f + "'", float3 == 404.0f);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 85, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4041010#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 1040410, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-a10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("41a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-10#0#10100444444444444444444.A.25A.A.--.A.A52.A.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0404104-1                                                                            ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0410.0452.04100.0", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1a-1a10a1", (float) 526L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 526.0f + "'", float2 == 526.0f);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str12, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("104041010-111-1100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"104041010-111-1100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A-.25A-.--A-.--", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (int) (short) 1, (int) ' ');
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 0, 85);
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
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0410.0452.04100.0" + "'", str12, "-1.0410.0452.04100.0");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', 0, 85);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0410.0452.04100.0" + "'", str9, "-1.0410.0452.04100.0");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.3240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.11-a1.25a1.1-a1.--");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                               \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 4096.0f, (float) 4096);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4096.0f + "'", float3 == 4096.0f);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10a0a10#44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a0a10#44\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 526.0f, (float) 574);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(558, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10#0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#0#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                      1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0a.25a..0a.0000.a0..a52.a0...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                       1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0a.25a..0a.0000.a0..a52.a0...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10#0#101.11-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("00#1#0#-1#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.001a0.25a0.01a0.1441.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 958, (long) 526, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 958L + "'", long3 == 958L);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                     ", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3240, (float) 10L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3240.0f + "'", float3 == 3240.0f);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10041404-1410");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a10.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 404L, (double) 62, (double) 404.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 404.0d + "'", double3 == 404.0d);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-10a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(85, 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) (-1), (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.04100.040.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("       0.001a0.25a0.01a0.1-        ##############################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       0.001a0.25a0.01a0.1-        ##############################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', (int) 'a', 559);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, 526, 526);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0 10.0 52.0 100.0-a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        long[] longArray2 = new long[] { 109, 100L };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[109, 100]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(476, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a10.0a52.0a100.0", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, 62);
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
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("       0.001a0.25a0.01a0.1-        ##############################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, 62, 565);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 565 + "'", int3 == 565);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(559, (int) '#', 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 559 + "'", int3 == 559);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 574, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 10, (int) (byte) -1);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0#10.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 100 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, (int) (byte) 10);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                               ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10#0#101.11-A1.25A1.1-A1.-");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a0.25a0.01a0.1--1.0...0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3240, 0.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, 62.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 62.0d + "'", double3 == 62.0d);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1L, (long) 565, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a0.25a...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.25a...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("...A52.0A1", 4089);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4089 + "'", int2 == 4089);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10 -1 0 1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 -1 0 1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("3240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), 4096, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4096 + "'", int3 == 4096);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                32a0                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.01010#-1#1#1#-1#1004041010404A1.1-A1.--1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10-1.0a10.0a52.0a1-1.0a10.0a52.0a1#-1.0a10.0a52.0a1-1.0a10.0a52.0a10-1.0a10.0a52.0a1-1.0a10.0a52.0a1#-1.0a10.0a52.0a1-1.0a10.0a52.0a110");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10-1.0a10.0a52.0a1-1.0a10.0a52.0a1#-1.0a10.0a52.0a1-1.0a10.0a52.0a10-1.0a10.0a52.0a1-1.0a10.0a52.0a1#-1.0a10.0a52.0a1-1.0a10.0a52.0a110\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10a0a100.001a0.25a0.01a0.1-0.0a100.0a0.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 558, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 558 + "'", int3 == 558);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-a1.25a1.1-a1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.0a1a132 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-a1.25a1.1-a1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.0a1a132 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0, (double) 'a', (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...A52.0A110#0#100.001#0.25#0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("  4     #a-1.0a10.0a52.0a100.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(559L, 958L, (long) 85);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 958L + "'", long3 == 958L);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1040410, (double) (short) 0, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1040410.0d + "'", double3 == 1040410.0d);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A-.25A-.--A-.--", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a0a10...a52.0a1##############################################################-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.", (long) 165);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 165L + "'", long2 == 165L);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) -1, 998);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("104041", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104041 + "'", int2 == 104041);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 0, (int) (short) 1);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "...A52.0A110#0#100.001#0.25#0...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...A52.0A110#0#100.001#0.25#0...");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-.---A-.25A-.--A-.--");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-.---A-.25A-.--A-.--\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("32a0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 10, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1040410, (int) (byte) 100, 1040410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
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
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "0.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.00.001a0.25a0.01a0.1-100.0");
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
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) 10, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.Class<?> wildcardClass10 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, (long) 565, (long) 3240);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a0a001a0110                                                            ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 62, (-1.0f), (float) 574);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 574.0f + "'", float3 == 574.0f);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-a52.0a1-1.0a10.0a52.0a", 85);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85 + "'", int2 == 85);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".001A0.25A0.01A0.1--1.0A10.0A52.0A", (float) 998);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 998.0f + "'", float2 == 998.0f);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 109, (long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 565, (float) (-1L), (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4360, (double) 958.0f, (double) 559);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 559.0d + "'", double3 == 559.0d);
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3240, (int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 0, (long) (byte) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                      1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0a.25a..0a.0000.a0..a52.a0...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) (byte) -1, (long) 526);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 526L + "'", long3 == 526L);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (float) 100, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("  4     #a-1.0a10.0a52.0a100.", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (byte) 100, (int) 'a');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', (int) (short) 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1010 -1 1 1 -1 1004041010404A1.1-A1.--10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A1.1-A1.--1040410104041010#-1#1#1#-1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 0, 958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) 3240, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3240L + "'", long3 == 3240L);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a0.1--1.0.A1.1-A1.--1040410104041010#-1#1#1#-1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.1--1.0.A1.1-A1.--1040410104041010#-1#1#1#-1#100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 10.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#...32a0", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 0, 840L, (long) 4360);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4360L + "'", long3 == 4360L);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4--4---4-4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1a.a1a-aAa1a.a--a1040410", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 85, (float) 165, (float) 526);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 526.0f + "'", float3 == 526.0f);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1a.a1a-aAa1a.a--a1040410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-", (long) 526);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 526L + "'", long2 == 526L);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10a0a100.001a0.25a0.01a0.1-0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 558, (int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(558, (int) (short) 1, 4096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("  4     #0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(404.0d, (double) 1.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 404.0d + "'", double3 == 404.0d);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("52233223232252232223232252233232252252233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233322aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a", (double) 165L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 165.0d + "'", double2 == 165.0d);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 526, 1040410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 526");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#", (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-13240AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1-.---a-.25a-.--a-.--");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#0#100.001a0.25a0.01a0.1--1.0...", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("41a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-10#0#10100444444444444444444.A.25A.A.--.A.A52.A.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.0A10.0A52.0A100.001#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1L, (double) 165, (double) 526.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 526.0d + "'", double3 == 526.0d);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 574, (float) 109, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a              ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a10.0a52.0a1-1.0a10.0a52.0a1                                                                    ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0  4     #");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(62L, (long) (byte) 100, 559L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 62L + "'", long3 == 62L);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4096, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4096 + "'", int3 == 4096);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444-.1A-1.1A52.1A-1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                      1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0a.25a..0a.0000.a0..a52.a0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                      1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0a.25a..0a.0000.a0..a52.a0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 10, 10);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a10.0" + "'", str16, "0.0a10.0");
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("##############################################################        -1.0a10.0a52.0a100.0       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "AAAA#AA#A#A#AA#AAA4A4AAAA4A4aAAAAaAAAAA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: AAAA#AA#A#A#AA#AAA4A4AAAA4A4aAAAAaAAAAA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                    10414-1404-1                                     ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0...0.1--1.0a10.0a52.0a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#0#100.001A0.25A0.01A0.1--1.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#100.001A0.25A0.01A0.1--1.0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.100101E7d, (double) '4', (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(526, 1040410, 574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 526 + "'", int3 == 526);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1A0.25A0.01A0.1-1A0.25A0.01A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a11a320.001a0.25a0.01a0.1441.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100a0a10...a52.0a1104041010#-1#1#1#-1#100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("       0.001a0.25a0.01a0.1-        ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a10.0a52.0a100.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a10.100100.0010.250.010.1-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(100L, 62L, (long) 565);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 62L + "'", long3 == 62L);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                     ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10.0f, 1.100101E7d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) ' ', 4360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100 1 0 -1 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 85, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" 444 4a4#44");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 100, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0a10...a52.0a1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (-1), 4360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         -1.0410.0452.04");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.25a0.01a0.1-1a0.25a-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#a52.0a10.0a...0.1--1.0-", 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 3240L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1a1-a01a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a1-a01a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0 10.0" + "'", str10, "0.0 10.0");
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (short) 0, (long) 104041);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 559, (int) 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a0a10" + "'", str18, "10a0a10");
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#404#41004.40014a404.4254a404.4014a404.414--414.4..11001010", (float) 993);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 993.0f + "'", float2 == 993.0f);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".0410.0452.04100.0-1.0410.0452.0410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.Class<?> wildcardClass11 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 10, 958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#a#aAaAaAaAaAaA", (float) 85);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85.0f + "'", float2 == 85.0f);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 558, 10);
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
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A0.25A0.01A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A0.25A0.01A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.25a0.01a0.1-1a0.25a-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A1#a52.0a10.0a...0.1--1.0-", (float) 62);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 62.0f + "'", float2 == 62.0f);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 10, 4360L, 62L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.01-1.010.052.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 'a', (double) 62, (double) 993.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 993.0d + "'", double3 == 993.0d);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0#100.0#0.00.0#100.0#0.00.0#100.0#0.00.0#...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                 ", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("52233223232252232223232252233232252252233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233322aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233232252252233232252232223232252233");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2233322aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1", 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1-1.010.052.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1a32", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                                                                0.0 10.00.001a0.25a0.01a0.1-                                         1010#-1#1#1#-1#1004041010404A1.1-A1.--1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4089, (float) 165, (float) 4096);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 165.0f + "'", float3 == 165.0f);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("11001010...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11001010...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0d), (double) '4', (double) 62);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 62.0d + "'", double3 == 62.0d);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("# 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 1040410, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 526, (long) 1, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a0.1--1.0a0.01a0.25a100.001a0a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A10.10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(" 444 4a4#44");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 558, (long) 526, 1040410L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1040410L + "'", long3 == 1040410L);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#0#10#0#100.001A0.25A0.01A0.1--1", (double) 998);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 998.0d + "'", double2 == 998.0d);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3240" + "'", str8, "3240");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32 0" + "'", str11, "32 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32 0" + "'", str13, "32 0");
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, 958L, (long) 840);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 958L + "'", long3 == 958L);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 85, (double) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(".a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', (int) (byte) 1, 958);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a0a10" + "'", str15, "10a0a10");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1010#-1#1#1#-1#1004041010404A1.1-A1.--10", 4096.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.0f + "'", float2 == 4096.0f);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Aaaa#aa#a#a#aa#aaa4a4aaaa4a4AaaaaAaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, (int) '#', 1040410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1040410 + "'", int3 == 1040410);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 526);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 526.0d + "'", double2 == 526.0d);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#0#10" + "'", str16, "10#0#10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a0a10" + "'", str18, "10a0a10");
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 1040410, (int) '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 958, 109);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444440#0#100.001a0.25a0.01a0.1--1.0a1hi!", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 840L, (double) 559L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 840.0d + "'", double3 == 840.0d);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (byte) 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 1, 104041);
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
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                  ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0 100.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10#0#101010#-1#1#1#-1#1004041010404");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3240L, (double) 100L, (double) 558);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a11a32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a11a32\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 10, 165, 998);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 998 + "'", int3 == 998);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001a0.25a0.01a0.1-100.0", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

